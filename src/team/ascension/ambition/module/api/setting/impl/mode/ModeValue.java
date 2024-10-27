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

public final class ModeValue extends SettingHolder<String> {

    private String value;
    private final String[] values = {};

    public ModeValue(final String value, final String[] values) {}
    public ModeValue(final NamedObject enumValue, final NamedObject[] enumValues) {}

    public boolean isSelected(final NamedObject value) { throw new SdkNoImplException(); }
    public boolean isSelected(final String value) { throw new SdkNoImplException(); }

    public String[] getValues() { throw new SdkNoImplException(); }
    public NamedObject getEnumValue() { throw new SdkNoImplException(); }

    @Override public String getValue() { throw new SdkNoImplException(); }
    @Override public void setValue(final String value) { throw new SdkNoImplException(); }
    @Override public boolean isEnabled() { throw new SdkNoImplException(); }
    @Override public JsonObject serialize() { throw new SdkNoImplException(); }
    @Override public boolean deserialize(final JsonObject object) { throw new SdkNoImplException(); }

}
