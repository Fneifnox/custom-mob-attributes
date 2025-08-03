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
    @Inject(
            method = "scale(Lnet/minecraft/entity/boss/WitherEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V",
            at = @At("HEAD"),
            cancellable = true
    )
    public void changeWitherScale(WitherEntity wither, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float g = 2.0F * (float) CustomMobAttributes.getScaleAttributeModifierValue(wither, CustomMobAttributes.SCALE);
        int i = wither.getInvulnerableTimer();
        if (i > 0) {
            g -= ((float)i - f) / 220.0F * 0.5F;
        }

        matrixStack.scale(g, g, g);
        ci.cancel();
    }
}
