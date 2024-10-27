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

public final class NumberValue extends SettingHolder<Number[]> {

    private Number[] value;

    private final String format;
    public Number minimum, maximum, increment;
    public NumberValue(final String format, final Number minimum, final Number maximum, final Number increment, final Number... points) {
        this.value = points;
        this.format = format;
        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = increment;
    }

    public NumberValue(final Number minimum, final Number maximum, final Number increment, final Number... points) {
        this("%s", minimum, maximum, increment, points);
    }

    public void increment(final int index) { throw new SdkNoImplException(); }
    public void decrement(final int index) { throw new SdkNoImplException(); }
    public void setValue(final int index, final Number value) { throw new SdkNoImplException(); }
    public String getFormatted(final int index) { throw new SdkNoImplException(); }
    public Number getValue(final int index) { throw new SdkNoImplException(); }
    public Number getSingleValue() { throw new SdkNoImplException(); }
    public Number getHighestValue() { throw new SdkNoImplException(); }
    public Number getLowestValue() { throw new SdkNoImplException(); }
    public int getHighestValueIndex() { throw new SdkNoImplException(); }
    public int getLowestValueIndex() { throw new SdkNoImplException(); }
    private int index(final int index) { throw new SdkNoImplException(); }
    public Number getNext(final int index1, final int index2, final boolean secure) { throw new SdkNoImplException(); }

    @Override public Number[] getValue() { throw new SdkNoImplException(); }
    @Override public void setValue(final Number[] value) { throw new SdkNoImplException(); }
    @Override public boolean isEnabled() { throw new SdkNoImplException(); }
    @Override public JsonObject serialize() { throw new SdkNoImplException(); }
    @Override public boolean deserialize(final JsonObject object) { throw new SdkNoImplException(); }

}
