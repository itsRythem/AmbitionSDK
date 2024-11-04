package team.ascension.ambition.sdk.module;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import team.ascension.ambition.sdk.accessor.Accessor;
import team.ascension.ambition.sdk.setting.ISetting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ModuleBase implements IModule {

    protected final List<ISetting<?>> settings = new ArrayList<>();
    protected boolean state;

    protected final String name, description;
    protected final Category category;
    public ModuleBase(final String name, final String description, final Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    @Override public String getName() { return this.name; }

    @Override public String getDescription() { return this.description; }

    @Override public Category getCategory() { return this.category; }

    @Override public String getSuffix() { return null; }

    @Override public ISetting<?> getKeybind() { return null; }

    @Override public boolean isEnabled() { return this.state; }

    @Override public void onEnable() {}

    @Override public void onDisable() {}

    @Override
    public void setEnabled(final boolean state, final boolean silent) {
        if (this.state != state) {
            this.register(state, silent);
            this.state = state;
        }
    }

    @Override
    public void register(final boolean state, final boolean silent) {
        Accessor.getEventBus().register(this);
    }

    @Override
    public void setEnabled(final boolean state) {
        this.setEnabled(state, false);
    }

    @Override
    public void toggle() {
        this.setEnabled(!this.isEnabled());
    }

    @Override
    public void registerSettings(final ISetting<?>... settings) {
        this.settings.addAll(Arrays.asList(settings));
    }

    @Override
    public List<ISetting<?>> getSettings() {
        return this.settings;
    }

    @Override
    public JsonObject serialize() {
        final JsonObject object = new JsonObject();
        if (!this.getSettings().isEmpty()) {
            final JsonArray settings = new JsonArray();
            for (final ISetting<?> setting : this.getSettings()) {
                if (setting == null || setting.getHolder() == null) {
                    continue;
                }

                final JsonObject settingObject = new JsonObject();
                settingObject.addProperty("name", setting.getName());
                settingObject.add("data", setting.getHolder().serialize());
                settings.add(settingObject);
            }
            object.add("settings", settings);
        }
        object.addProperty("enabled", this.state);
        return object;
    }

    @Override
    public boolean deserialize(final JsonObject object) {
        if (object.has("enabled")) {
            this.setEnabled(object.get("enabled").getAsBoolean(), true);
        }
        if (object.has("settings")) {
            final JsonArray settings = object.get("settings").getAsJsonArray();
            for (final JsonElement settingElement : settings) {
                if (settingElement != null && settingElement.isJsonObject()) {
                    final JsonObject settingObject = settingElement.getAsJsonObject();
                    if (settingObject.has("name") && settingObject.has("data")) {
                        for (final ISetting<?> setting : this.settings) {
                            try {
                                if (setting.getName().equalsIgnoreCase(settingObject.get("name").getAsString())) {
                                    setting.getHolder().deserialize(settingObject.get("data").getAsJsonObject());
                                }
                            } catch (final Exception exception) {
                                exception.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

}
