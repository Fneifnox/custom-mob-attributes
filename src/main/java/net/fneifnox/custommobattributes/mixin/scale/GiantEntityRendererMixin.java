package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.GiantEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.GiantEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GiantEntityRenderer.class)
public abstract class GiantEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/mob/GiantEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("TAIL"))
    private void changeGiantScale(GiantEntity giantEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) giantEntity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
