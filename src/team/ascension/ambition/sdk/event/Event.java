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

package team.ascension.ambition.sdk.event;

public class Event {

    public EventStage stage;
    public boolean cancelled;

    public Event(final EventStage stage, final boolean cancelled) {
        this.stage = stage;
        this.cancelled = cancelled;
    }

    public Event(final EventStage stage) {
        this(stage, false);
    }

    public Event(final boolean cancelled) {
        this(null, cancelled);
    }

    public Event() {
        this(null, false);
    }

    public EventStage getStage() {
        return this.stage;
    }

    public void setStage(final EventStage stage) {
        this.stage = stage;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }

    public void cancel() {
        this.cancelled = true;
    }

    public boolean isPre() {
        return this.stage == EventStage.PRE;
    }

    public boolean isPost() {
        return this.stage == EventStage.POST;
    }

    public boolean isIncoming() {
        return this.stage == EventStage.INCOMING;
    }

    public boolean isOutgoing() {
        return this.stage == EventStage.OUTGOING;
    }

}
