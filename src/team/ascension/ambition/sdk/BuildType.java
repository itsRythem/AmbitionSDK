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

package team.ascension.ambition.sdk;

import team.ascension.ambition.sdk.util.jplus.INamedObject;

public enum BuildType implements INamedObject {

    RELEASE("Production", 0),
    BETA("Beta", 1),
    ALPHA("Alpha", 2),
    DEVELOPMENT("Development", 3);

    public final String name;
    public final int level;
    BuildType(final String name, final int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public boolean isHigherThan(final BuildType build) {
        return this.level > build.level;
    }

    public boolean isLowerThan(final BuildType build) {
        return this.level < build.level;
    }

    public boolean isHigherThanOrEqualTo(final BuildType build) {
        return this.level >= build.level;
    }

    public boolean isLowerThanOrEqualTo(final BuildType build) {
        return this.level <= build.level;
    }

    public boolean isEqualTo(final BuildType build) {
        return this.level == build.level;
    }

}
