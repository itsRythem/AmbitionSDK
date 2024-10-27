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

package team.ascension.ambition.module.api.hud;

import team.ascension.ambition.sdk.exception.SdkNoImplException;

public enum Anchor {

    TOP_LEFT(0, 0.0f, 0.0f),
    TOP_CENTER(1, 0.5f, 0.0f),
    TOP_RIGHT(2, 1.0f, 0.0f),
    CENTER_LEFT(3, 0.0f, 0.5f),
    CENTER_RIGHT(4, 1.0f, 0.5f),
    CENTER(5, 0.5f, 0.5f),
    BOTTOM_LEFT(6, 0.0f, 1.0f),
    BOTTOM_CENTER(7, 0.5f, 1.0f),
    BOTTOM_RIGHT(8, 1.0f, 1.0f);

    public final int index;
    public final float x, y;
    Anchor(final int index, final float x, final float y) {
        this.index = index;
        this.x = x;
        this.y = y;
    }

    public static Anchor fromIndex(final int index) { throw new SdkNoImplException(); }

}