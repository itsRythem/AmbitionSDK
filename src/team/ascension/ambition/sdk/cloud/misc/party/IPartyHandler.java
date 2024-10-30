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

package team.ascension.ambition.sdk.cloud.misc.party;

import com.google.gson.JsonObject;
import team.ascension.ambition.sdk.cloud.IPacketHandler;

import java.util.HashSet;
import java.util.function.Consumer;

public interface IPartyHandler extends IPacketHandler {
    void registerCallback(PartyAction action, Consumer<JsonObject> callback);

    void sendAction(PartyAction action, JsonObject info);

    void acceptCurrentInvite(int id);

    void createParty();

    void invitePlayer(int userId);

    void kickPlayer(int userId);

    void disband();

    boolean isInParty();

    boolean isLeader();

    IParty getCurrentParty();

    HashSet<Integer> getPendingInvites();
}
