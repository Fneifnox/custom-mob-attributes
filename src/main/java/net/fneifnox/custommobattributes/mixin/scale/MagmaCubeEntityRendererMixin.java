package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.MagmaCubeEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MagmaCubeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MagmaCubeEntityRenderer.class)
public class MagmaCubeEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/mob/MagmaCubeEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("TAIL"))
    private void changeMagmaCubeScale(MagmaCubeEntity magmaCubeEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) magmaCubeEntity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
