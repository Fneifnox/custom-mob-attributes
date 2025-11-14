package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.WitherSkeletonEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherSkeletonEntityRenderer.class)
public class WitherSkeletonEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/entity/mob/AbstractSkeletonEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("HEAD"))
    private void getEntity(AbstractSkeletonEntity abstractSkeletonEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        entity = abstractSkeletonEntity;
    }

    @ModifyConstant(method = "scale(Lnet/minecraft/entity/mob/AbstractSkeletonEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", constant = @Constant(floatValue = 1.2f))
    private float changeBatScale(float original) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE);
        return original * multiplier;
    }
}
