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

package team.ascension.ambition.sdk.cloud.misc.product;

import com.google.gson.JsonObject;

public class ProductVersion {
    private int release, downloads, visibility;
    private float price;
    private long timestamp;
    private String version;
    
    public ProductVersion(JsonObject object) {
        this.release = object.get("release").getAsInt();
        this.downloads = object.get("downloads").getAsInt();
        this.visibility = object.get("visibility").getAsInt();
        this.price = object.get("price").getAsFloat();
        this.timestamp = object.get("timestamp").getAsLong();
        this.version = object.get("version").getAsString();
    }

    public int getRelease() {
        return release;
    }

    public int getDownloads() {
        return downloads;
    }

    public int getVisibility() {
        return visibility;
    }

    public float getPrice() {
        return price;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getVersion() {
        return version;
    }
}
