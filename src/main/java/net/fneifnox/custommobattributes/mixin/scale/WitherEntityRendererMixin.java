package net.fneifnox.custommobattributes.mixin.scale;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.WitherEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.boss.WitherEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(WitherEntityRenderer.class)
public class WitherEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/boss/WitherEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("TAIL"))
    public void changeWitherScale(WitherEntity wither, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) wither.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
