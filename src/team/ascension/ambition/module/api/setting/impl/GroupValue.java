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

package team.ascension.ambition.module.api.setting.impl;

import com.google.gson.JsonObject;
import team.ascension.ambition.module.api.setting.Setting;
import team.ascension.ambition.module.api.setting.SettingHolder;

import java.util.Arrays;
import java.util.List;

public class GroupValue extends SettingHolder<List<Setting<?>>> {

    private List<Setting<?>> value;
    public GroupValue(final Setting<?>... settings) {
        this.value = Arrays.asList(settings);
    }

    @Override
    public List<Setting<?>> getValue() {
        return this.value;
    }

    public <T extends Setting<?>> T get(final String name) {
        for (final Setting<?> setting : this.value) {
            if (setting.name.equalsIgnoreCase(name)) {
                return (T) setting;
            }
        }
        return null;
    }

    @Override
    public void setValue(final List<Setting<?>> value) {
        if (this.value != value) {
            this.onChangeValue();
            this.value = value;
        }
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public JsonObject serialize() {
        final JsonObject object = new JsonObject();
        for (final Setting<?> setting : this.value) {
            if (setting != null && setting.getHolder() != null) {
                object.add(setting.name, setting.getHolder().serialize());
            }
        }
        return object;
    }

    @Override
    public boolean deserialize(final JsonObject object) {
        for (final Setting<?> setting : this.value) {
            if (setting != null && object.has(setting.name)) {
                if (setting.getHolder() != null) {
                    setting.getHolder().deserialize(object.get(setting.name).getAsJsonObject());
                }
            }
        }
        return true;
    }
}
