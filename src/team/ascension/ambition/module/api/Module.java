/*
 * Copyright (C) 2024 Ascension Store. - All Rights Reserved
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package team.ascension.ambition.module.api;

import com.google.gson.JsonObject;
import team.ascension.ambition.module.api.setting.Setting;
import team.ascension.ambition.module.api.setting.impl.BooleanValue;
import team.ascension.ambition.module.api.setting.impl.KeybindValue;
import team.ascension.ambition.sdk.exception.SdkNoImplException;

import java.util.ArrayList;
import java.util.List;

public abstract class Module {

    private final List<Setting<?>> settings = new ArrayList<>();

    public final Setting<KeybindValue> keybind = new Setting.Builder<KeybindValue>()
            .setName("Keybind")
            .setDescription("The key used to toggle this module")
            .setHolder(new KeybindValue(0))
            .build();

    public final Setting<BooleanValue> hidden = new Setting.Builder<BooleanValue>()
            .setName("Hidden")
            .setDescription("Hides this module from the array list")
            .setHolder(new BooleanValue(false))
            .build();

    private boolean registeredSettings, enabled, silent;

    public final String name, description;
    public final Category category;
    public Module(final String name, final String description, final int key, final boolean enabled, final boolean hidden, final Category category) {
        this.name = name;
        this.description = description;
        this.keybind.getHolder().setValue(key);;
        this.category = category;
        this.hidden.getHolder().setValue(hidden);
        this.setEnabled(enabled, true);
    }

    public Module() {
        final Class<? extends Module> clazz = this.getClass();
        if (clazz.isAnnotationPresent(ModuleInfo.class)) {
            final ModuleInfo info = clazz.getAnnotation(ModuleInfo.class);
            this.name = info.name();
            this.description = info.description();
            this.keybind.getHolder().setValue(info.key());
            this.category = info.category();
            this.hidden.getHolder().setValue(info.hidden());
            this.silent = info.silent();
            this.setEnabled(info.enabled(), true);
        } else {
            throw new RuntimeException("Module missing information");
        }
    }

    public void registerSettings() { throw new SdkNoImplException(); }
    public void registerSettings(final Setting<?>... settings) { throw new SdkNoImplException(); }

    public boolean isEnabled() { throw new SdkNoImplException(); }
    public void setEnabled(final boolean enabled, final boolean silent) { throw new SdkNoImplException(); }
    public void toggle() { throw new SdkNoImplException(); }

    private void register(final boolean silent) { throw new SdkNoImplException(); }
    private void unregister(final boolean silent) { throw new SdkNoImplException(); }

    public void onEnable() {}
    public void onDisable() {}

    public String getSuffix() {
        return null;
    }

    public List<Setting<?>> getSettings() {
        return new ArrayList<>(this.settings);
    }

    public JsonObject serialize() { throw new SdkNoImplException(); }
    //public boolean deserialize(final JsonObject object, final ConfigHandler.ModuleFallbackMode fallbackMode) { throw new SdkNoImplException(); }

}
