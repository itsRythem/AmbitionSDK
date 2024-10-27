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

package team.ascension.ambition.module.api.setting.impl.mode;

import com.google.gson.JsonObject;
import team.ascension.ambition.module.api.setting.SettingHolder;
import team.ascension.ambition.sdk.exception.SdkNoImplException;
import team.ascension.ambition.util.java.NamedObject;

import java.util.List;

public class MultiModeValue extends SettingHolder<List<String>> {

    protected List<String> value, values, icons;
    public String iconFont;
    public boolean items, blocks;

    public MultiModeValue(final String[] value, final String[] values) {}
    public MultiModeValue(final NamedObject[] enumValue, final NamedObject[] enumValues) {}
    public MultiModeValue(final String[] value, final String[] values, final String[] icons, final String iconFont) {}
    //public MultiModeValue(final Block[] blocks, final Block[] allowedBlocks) {}
    //public MultiModeValue(final Block[] blocks) {}
    //public MultiModeValue(final Item[] items) {}

    public boolean isEnabled(final String targetValue) { throw new SdkNoImplException(); }
    public boolean isEnabled(final NamedObject enumValue) { throw new SdkNoImplException(); }
    public void setEnabled(final String value, final boolean state) { throw new SdkNoImplException(); }
    public List<String> getValues() { throw new SdkNoImplException(); }

    @Override public List<String> getValue() { throw new SdkNoImplException(); }
    @Override public void setValue(final List<String> value) { throw new SdkNoImplException(); }
    @Override public boolean isEnabled() { throw new SdkNoImplException(); }
    @Override public JsonObject serialize() { throw new SdkNoImplException(); }
    @Override public boolean deserialize(final JsonObject object) { throw new SdkNoImplException(); }

}
