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

package team.ascension.ambition.module.api.setting;

import com.google.gson.JsonObject;
import team.ascension.ambition.Build;
import team.ascension.ambition.sdk.exception.SdkNoImplException;
import team.ascension.ambition.util.enums.Recommendation;
import team.ascension.ambition.util.enums.Risk;
import team.ascension.ambition.util.java.timing.Timer;

import java.util.function.Supplier;

public final class Setting<T extends SettingHolder<?>> {

    private T holder;
    private JsonObject defaultObject;
    public String name, description;
    private Setting<?> parent;
    private Setting<?>[] children;
    public Supplier<Boolean> condition;
    public Risk risk = Risk.NONE;
    public Recommendation recommendation = Recommendation.NONE;
    public final Timer timer = new Timer();
    public Build buildLevel = Build.RELEASE;

    private Setting(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public void restoreValue() { throw new SdkNoImplException(); }
    public boolean isEnabled() { throw new SdkNoImplException(); }
    public T getHolder() { throw new SdkNoImplException(); }
    public Setting<?> getParent() { throw new SdkNoImplException(); }
    private Setting<T> init() { throw new SdkNoImplException(); }

    public static final class Builder<T extends SettingHolder<?>> {

        private final Setting<T> setting;
        private Runnable listener;

        public Builder(final String name, final String description) {
            this.setting = new Setting<>(name, description);
        }

        public Builder(final String name) {
            this(name, null);
        }

        public Builder() {
            this(null, null);
        }

        public Builder<T> setName(final String name) { throw new SdkNoImplException(); }
        public Builder<T> setDescription(final String description) { throw new SdkNoImplException(); }
        public Builder<T> setHolder(final T holder) { throw new SdkNoImplException(); }
        public Builder<T> setChildren(final Setting<?>... children) { throw new SdkNoImplException(); }
        public Builder<T> setRisk(final Risk risk) { throw new SdkNoImplException(); }
        public Builder<T> setRecommendation(final Recommendation recommendation) { throw new SdkNoImplException(); }
        public Builder<T> setParent(final Setting<?> parent) { throw new SdkNoImplException(); }
        public Builder<T> setListener(final Runnable listener) { throw new SdkNoImplException(); }
        public Builder<T> setCondition(final Supplier<Boolean> condition) { throw new SdkNoImplException(); }
        public Builder<T> setBuildLevel(final Build build) { throw new SdkNoImplException(); }
        public Setting<T> build() { throw new SdkNoImplException(); }

    }

}
