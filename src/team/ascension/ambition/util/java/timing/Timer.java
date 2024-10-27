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

package team.ascension.ambition.util.java.timing;

public class Timer {

    public long lastTime;
    public Timer() {
        this.lastTime = System.currentTimeMillis();
    }

    public boolean hasElapsedMillis(final long ms, final boolean reset) {
        final long elapsed = this.getTimeElapsedMillis();
        if (elapsed >= ms) {
            if (reset) {
                this.reset();
            }
            return true;
        }
        return false;
    }

    public boolean hasElapsedMillis(final long ms) {
        return this.hasElapsedMillis(ms, false);
    }

    public boolean hasElapsedSeconds(final long seconds, final boolean reset) {
        final long elapsed = this.getTimeElapsedMillis() / 1_000L;
        if (elapsed >= seconds) {
            if (reset) {
                this.reset();
            }
            return true;
        }
        return false;
    }

    public boolean hasElapsedTicks(final int ticks, final boolean reset) {
        final long elapsed = this.getTimeElapsedMillis() / 1_000L;
        if (elapsed >= ticks * 50L) {
            if (reset) {
                this.reset();
            }
            return true;
        }
        return false;
    }

    public boolean hasElapsedSeconds(final long seconds) {
        return this.hasElapsedSeconds(seconds, false);
    }

    public boolean wantFrames(final long frames, final boolean reset) {
        final long elapsed = this.getTimeElapsedMillis();
        if (elapsed >= (1_000L / frames)) {
            if (reset) {
                this.reset();
            }
            return true;
        }
        return false;
    }

    public boolean wantFrames(final long frames) {
        return this.wantFrames(frames, false);
    }

    public long getTimeElapsedMillis() {
        return System.currentTimeMillis() - this.lastTime;
    }

    public void reset() {
        this.lastTime = System.currentTimeMillis();
    }

    public static boolean hasTimeElapsedMs(final long startTime, final double duration) {
        return (System.currentTimeMillis() - startTime) >= duration;
    }

}
