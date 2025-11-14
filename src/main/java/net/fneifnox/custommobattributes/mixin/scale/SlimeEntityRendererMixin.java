package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.SlimeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SlimeEntityRenderer.class)
public class SlimeEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/mob/SlimeEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("TAIL"))
    private void changeSlimeScale(SlimeEntity slimeEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) slimeEntity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
