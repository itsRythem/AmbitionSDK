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

package team.ascension.ambition.sdk.plugin;

import team.ascension.ambition.sdk.IClient;

/**
 * Represents a plugin that can be loaded and unloaded by the client.
 * This interface defines the lifecycle methods for initializing and cleaning up
 * plugin resources. Plugins implementing this interface can interact with the client
 * through the provided {@link IClient} instance.
 *
 * <p>To create a new plugin, implement this interface and define the behavior
 * for loading and unloading resources or functionality in {@link #onLoad(IClient)}
 * and {@link #onUnload()} respectively.</p>
 *
 * <h2>Example Usage:</h2>
 * <pre>{@code
 * public class MyPlugin implements Plugin {
 *
 *     @Override
 *     public void onLoad(IClient client) {
 *         // Initialize plugin resources and restore previous states
 *     }
 *
 *     @Override
 *     public void onUnload() {
 *         // Clean up resources or save state before plugin is unloaded
 *     }
 * }
 * }</pre>
 */
public interface Plugin {

    /**
     * Called when the plugin is loaded into the client. This method should contain
     * any initialization code or setup required by the plugin.
     *
     * @param client The client instance providing access to core functionality and
     *               APIs that the plugin may need to interact with. This is typically
     *               used to register commands, interact with modules,
     *               access client settings, or attach event listeners.
     */
    void onLoad(final IClient client);

    /**
     * Called when the plugin is unloaded from the client. This method should contain
     * any cleanup code required by the plugin, such as unregistering listeners,
     * saving state, or freeing resources.
     */
    void onUnload();

}