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

package team.ascension.ambition.sdk.minecraft.entity;

import team.ascension.ambition.sdk.minecraft.command.IBaseCommandSender;
import team.ascension.ambition.sdk.minecraft.entity.player.IEntityPlayer;

public interface IEntity extends IBaseCommandSender {
    boolean isSprinting();

    void setSprinting(boolean sprinting);

    boolean isInvisible();

    void setInvisible(boolean invisible);

    boolean isEating();

    void setEating(boolean eating);

    boolean getFlag(int flag);

    void setFlag(int flag, boolean set);

    boolean hitByEntity(IEntity entityIn);

    double getPosX();

    double getPosY();

    double getPosZ();

    double getPrevPosX();

    double getPrevPosY();

    double getPrevPosZ();

    double getLastTickPosX();

    double getLastTickPosY();

    double getLastTickPosZ();

    boolean isOnGround();

    void setOnGround(boolean onGround);

    float[] getScreenPosition(float partialTicks);

    float[] getScreenPosition(double renderPosX, double renderPosY, double renderPosZ, float partialTicks);

    int getEntityId();

    boolean canAttackWithItem();

    void setFire(int i);

    void setMotionX(double motionX);

    double getMotionY();

    void setMotionY(double motionY);

    double getMotionZ();

    void setMotionZ(double motionZ);

    float getRotationYaw();

    void setRotationYaw(float rotationYaw);

    float getRotationPitch();

    void setRotationPitch(float rotationPitch);

    float getPrevRotationYaw();

    void setPrevRotationYaw(float prevRotationYaw);

    float getPrevRotationPitch();

    void setPrevRotationPitch(float prevRotationPitch);

    void setLocationAndAngles(double x, double y, double z, float yaw, float pitch);

    float getDistanceToEntity(IEntity entityIn);

    double getDistanceSq(double x, double y, double z);

    double getDistance(double x, double y, double z);

    void addVelocity(double x, double y, double z);

    boolean isBurning();

    double getMotionX();

    void extinguish();

}
