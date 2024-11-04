package team.ascension.ambition.sdk.module;

import com.google.gson.JsonObject;
import team.ascension.ambition.sdk.accessor.Accessor;
import team.ascension.ambition.sdk.setting.ISetting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModuleBase implements IModule {

    private final List<ISetting<?>> settings = new ArrayList<>();
    private boolean state;

    private final String name, description;
    private final Category category;
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

    @Override
    public void setEnabled(final boolean state, final boolean silent) {
        if (this.state != state) {
            if (state) {

            } else {

            }
            this.state = state;
        }
    }

    protected void register() {
        Accessor.getEventBus().register(this);
    }

    protected void unregister() {
        Accessor.getEventBus().unregister(this);
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
        return null;
    }

    @Override
    public boolean deserialize(final JsonObject object) {
        return false;
    }

}
