package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.StriderEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.StriderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(StriderEntityRenderer.class)
public class StriderEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/passive/StriderEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("TAIL"))
    private void changeStriderScale(StriderEntity striderEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) striderEntity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
