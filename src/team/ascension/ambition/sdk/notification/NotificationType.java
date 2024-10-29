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

package team.ascension.ambition.sdk.notification;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public final class NotificationType {

    public static final String FONT = "icons/MaterialSymbolsRounded_28pt-Regular";
    public static final List<Character> FONT_GLYPHS = Arrays.asList('\ue5ca', '\ue645', '\ue5cd', '\uf59b', '\ueb8b', '\ue8b6', '\ue163');

    public static final NotificationType SUCCESS = new NotificationType("Success", FONT, '\ue5ca', new Color(124, 232, 104));
    public static final NotificationType WARNING = new NotificationType("Warning", FONT, '\ue645', new Color(232, 217, 104));
    public static final NotificationType ERROR = new NotificationType("Error", FONT, '\ue5cd', new Color(255, 64, 64));
    public static final NotificationType INFORMATION = new NotificationType("Information", FONT, '\uf59b', new Color(133, 206, 242));
    public static final NotificationType QUESTION = new NotificationType("Question", FONT, '\ueb8b', new Color(133, 162, 242));

    public final String name, font;
    public final char icon;
    public final Color color;
    public NotificationType(final String name, final String font, final char icon, final Color color) {
        this.name = name;
        this.font = font;
        this.icon = icon;
        this.color = color;
    }

}
