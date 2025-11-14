package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.BatEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.BatEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BatEntityRenderer.class)
public class BatEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/entity/passive/BatEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("HEAD"))
    private void getEntity(BatEntity batEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        entity = batEntity;
    }

    @ModifyConstant(method = "scale(Lnet/minecraft/entity/passive/BatEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", constant = @Constant(floatValue = 0.35f))
    private float changeBatScale(float original) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE);
        return original * multiplier;
    }
}
