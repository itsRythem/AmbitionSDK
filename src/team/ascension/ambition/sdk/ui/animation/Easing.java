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

package team.ascension.ambition.sdk.ui.animation;

import team.ascension.ambition.sdk.util.jplus.INamedObject;

import java.util.function.Function;

public enum Easing implements INamedObject {

    LINEAR("Linear", x -> x),

    SINE_IN("Sine In", x -> 1.0f - (float) Math.cos((x * 3.14f) / 2.0f)),
    SINE_OUT("Sine Out", x -> (float) Math.sin((x * 3.14f) / 2.0f)),
    SINE_IN_OUT("Sine In Out", x -> -((float) Math.cos(3.14f * x) - 1.0f) / 2.0f),

    CUBIC_IN("Cubic In", x -> x * x * x),
    CUBIC_OUT("Cubic Out", x -> 1.0f - (float) Math.pow(1.0f - x, 3.0f)),
    CUBIC_IN_OUT("Cubic In Out", x -> (x < 0.5f ? 4.0f * x * x * x : 1.0f - (float) Math.pow(-2.0f * x + 2.0f, 3.0f) / 2.0f)),

    EXPO_IN("Exponential In", x -> x == 0.0f ? 0.0f : (float) Math.pow(2.0f, 10.0f * x - 10.0f)),
    EXPO_OUT("Exponential Out", x -> x == 1.0f ? 1.0f : 1.0f - (float) Math.pow(2.0f, -10.0f * x)),
    EXPO_IN_OUT("Exponential In Out", x -> x == 0.0f ? 0.0f : x == 1.0f ? 1.0f : x < 0.5f ? (float) Math.pow(2.0f, 20.0f * x - 10.0f) / 2.0f : (2.0f - (float) Math.pow(2.0f, -20.0f * x + 10.0f)) / 2.0f),

    BACK_IN("Back In", x -> 2.70158f * x * x * x - 1.70158f * x * x),
    BACK_OUT("Back Out", x -> 1.0f + 2.70158f * (float) Math.pow(x - 1.0f, 3.0f) + 1.70158f * (float) Math.pow(x - 1.0f, 2.0f)),
    BACK_IN_OUT("Back In Out", x -> x < 0.5f ? (float) (Math.pow(2.0f * x, 2.0f) * (3.5949095f * 2.0f * x - 2.5949095f)) / 2.0f : (float) (Math.pow(2.0f * x - 2.0f, 2.0f) * (3.5949095f * (x * 2.0f - 2.0f) + 2.5949095f) + 2.0f) / 2.0f);

    private final String name;
    private final Function<Float, Float> function;
    Easing(final String name, final Function<Float, Float> function) {
        this.name = name;
        this.function = function;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public float apply(final float progress) {
        return this.function.apply(progress);
    }

}