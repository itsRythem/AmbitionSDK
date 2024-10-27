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
import team.ascension.ambition.module.api.hud.Anchor;
import team.ascension.ambition.module.api.setting.Setting;
import team.ascension.ambition.module.api.setting.SettingHolder;
import team.ascension.ambition.sdk.exception.SdkNoImplException;
import team.ascension.ambition.util.java.Pair;

public class AlignmentValue extends SettingHolder<Pair<Anchor, Setting<NumberValue>>> {

    public Anchor anchor;
    public Setting<NumberValue> offset;

    public AlignmentValue(final Anchor anchor, final float offset) {
        this.anchor = anchor;
        this.offset = new Setting.Builder<NumberValue>()
                .setName("Offset")
                .setHolder(new NumberValue("%s%%", 0.0f, 100.0f, 1.0f, offset))
                .build();
    }

    public Anchor getAnchor() { throw new SdkNoImplException(); }
    public void setAnchor(final Anchor anchor) { throw new SdkNoImplException(); }
    public float getOffset() { throw new SdkNoImplException(); }
    public void setOffset(final float offset) { throw new SdkNoImplException(); }

    @Override public Pair<Anchor, Setting<NumberValue>> getValue() { throw new SdkNoImplException(); }
    @Override public void setValue(final Pair<Anchor, Setting<NumberValue>> value) { throw new SdkNoImplException(); }
    @Override public boolean isEnabled() { throw new SdkNoImplException(); }
    @Override public JsonObject serialize() { throw new SdkNoImplException(); }
    @Override public boolean deserialize(final JsonObject object) { throw new SdkNoImplException(); }

}
