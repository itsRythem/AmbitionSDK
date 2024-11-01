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

package team.ascension.ambition.sdk.util.enums;

import team.ascension.ambition.sdk.util.jplus.INamedObject;

/* if you make a anticheat specific bypass for an anticheat not here, just add it :) */
public enum AntiCheat implements INamedObject {

    UNKNOWN("Unknown"),
    ANY("Any"),
    NONE("None"),
    NCP("NCP"),
    UPDATED_NCP("Updated NCP"),
    MATRIX("Matrix"),
    VULCAN("Vulcan"),
    ANTI_AURA_1("Anti Aura 1.0"),
    ANTI_AURA_2("Anti Aura 2.0"),
    NEGATIVITY_1("Negativity 1.0"),
    NEGATIVITY_2("Negativity 2.0"),
    WRAITH("Wraith"),
    HAWK("Hawk"),
    FREQUENCY("Frequency"),
    KAURI("Kauri"),
    MEDUSA("Medusa"),
    ALICE("Alice"),
    INTAVE("Intave"),
    BUZZ("Buzz"),
    VERUS("Verus"),
    HORIZON("Horizon"),
    HADES("Hades"),
    FOX_ADDITION("Fox Addition"),
    ACR("ACR"),
    NESS("Ness"),
    GODS_EYE("Gods Eye"),
    AAC_5("AAC 5.0"),
    AAC_3("AAC 3.0"),
    SPARTAN("Spartan"),
    POLAR("Polar"),
    ASTRO("Astro"),
    WATCHDOG("Watchdog"),
    KARHU("Karhu"),
    NESS_RELOADED("Ness Reloaded"),
    NOVA("Nova"),
    SPARKY("Sparky"),
    GRIM("Grim");

    public final String name;
    AntiCheat(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
