package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.WitchEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.WitchEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitchEntityRenderer.class)
public class WitchEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/mob/WitchEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("TAIL"))
    private void changeWitchScale(WitchEntity witchEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) witchEntity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
