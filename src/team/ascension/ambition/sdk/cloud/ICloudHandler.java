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

package team.ascension.ambition.sdk.cloud;

import team.ascension.ambition.sdk.cloud.channel.IChannelHandler;
import team.ascension.ambition.sdk.cloud.file.IFileHandler;
import team.ascension.ambition.sdk.cloud.misc.IAssetHandler;
import team.ascension.ambition.sdk.cloud.misc.IReportHandler;
import team.ascension.ambition.sdk.cloud.misc.ISpotifyHandler;
import team.ascension.ambition.sdk.cloud.misc.product.IProductHandler;
import team.ascension.ambition.sdk.cloud.misc.stats.IStatisticHandler;
import team.ascension.ambition.sdk.cloud.misc.cosmetic.ICosmeticHandler;
import team.ascension.ambition.sdk.cloud.request.IRequestHandler;
import team.ascension.ambition.sdk.cloud.user.IFriendHandler;
import team.ascension.ambition.sdk.cloud.misc.party.IPartyHandler;
import team.ascension.ambition.sdk.cloud.user.IUserHandler;

public interface ICloudHandler {

    IUserHandler getUserHandler();
    IRequestHandler getRequestHandler();
    IFileHandler getFileHandler();
    ISocketClient getClient();
    IAssetHandler getAssetHandler();
    ICosmeticHandler getCosmeticHandler();
    ISpotifyHandler getSpotifyHandler();
    IChannelHandler getChannelHandler();
    IReportHandler getReportHandler();
    IFriendHandler getFriendHandler();
    IStatisticHandler getStatHandler();
    IPartyHandler getPartyHandler();
    IProductHandler getProductHandler();

}
