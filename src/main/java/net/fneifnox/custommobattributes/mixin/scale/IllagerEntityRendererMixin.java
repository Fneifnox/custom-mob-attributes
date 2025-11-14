package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.IllagerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(IllagerEntityRenderer.class)
public class IllagerEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/entity/mob/IllagerEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("HEAD"))
    private void getEntity(IllagerEntity illagerEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        entity = illagerEntity;
    }

    @ModifyConstant(method = "scale(Lnet/minecraft/entity/mob/IllagerEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", constant = @Constant(floatValue = 0.9375f))
    private float changeIllagerScale(float original) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE);
        return original * multiplier;
    }
}
