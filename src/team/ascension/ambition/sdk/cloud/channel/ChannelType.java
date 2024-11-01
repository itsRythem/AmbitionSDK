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

package team.ascension.ambition.sdk.cloud.channel;

import team.ascension.ambition.sdk.util.jplus.INamedObject;

public enum ChannelType implements INamedObject {

    GLOBAL("Global", 0),
    PRIVATE("Private", 1),
    GROUP("Group", 2);

    private final String name;
    private final int index;
    ChannelType(final String name, final int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getIndex() {
        return this.index;
    }

    public static ChannelType valueOf(final int index) {
        for (final ChannelType type : values()) {
            if (type.index == index) {
                return type;
            }
        }
        return null;
    }

}
