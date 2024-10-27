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
import team.ascension.ambition.module.api.setting.SettingHolder;
import team.ascension.ambition.sdk.exception.SdkNoImplException;

import java.awt.*;

public final class ColorValue extends SettingHolder<Color> {

    private int flags;
    private Color value;
    public ColorValue(final Color value, final int flags) {
        this.value = value;
        this.flags = flags;
    }

    @Override public Color getValue() { throw new SdkNoImplException(); }
    @Override public void setValue(final Color value) { throw new SdkNoImplException(); }
    @Override public boolean isEnabled() { throw new SdkNoImplException(); }
    @Override public JsonObject serialize() { throw new SdkNoImplException(); }
    @Override public boolean deserialize(final JsonObject object) { throw new SdkNoImplException(); }

    public Color getColor(final long offset) { throw new SdkNoImplException(); }
    public void setFlag(final int flag, final boolean included) { throw new SdkNoImplException(); }
    public boolean hasFlag(final int flag) { throw new SdkNoImplException(); }

    public static final class Flags {

        public static final int RAINBOW     = 1 << 1;
        public static final int FADE        = 1 << 2;
        public static final int THEME        = 1 << 3;

    }

}
