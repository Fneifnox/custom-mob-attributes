package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.CaveSpiderEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.CaveSpiderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CaveSpiderEntityRenderer.class)
public class CaveSpiderEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/mob/CaveSpiderEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("TAIL"))
    private void changeCaveSpiderScale(CaveSpiderEntity caveSpiderEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) caveSpiderEntity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
