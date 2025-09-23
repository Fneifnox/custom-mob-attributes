package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.CreeperEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperEntityRenderer.class)
public class CreeperEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/entity/mob/CreeperEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At(value = "HEAD"), cancellable = true)
    private void changeCreeperScale(CreeperEntity creeperEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        float g = creeperEntity.getClientFuseTime(f);
        float h = 1.0F + MathHelper.sin(g * 100.0F) * g * 0.01F;
        g = MathHelper.clamp(g, 0.0F, 1.0F);
        g *= g;
        g *= g;
        float i = (1.0F + g * 0.4F) * h;
        float j = (1.0F + g * 0.1F) / h;
        matrixStack.scale((float) (i * creeperEntity.getAttributeValue(CustomMobAttributes.SCALE)),
                (float) (j * creeperEntity.getAttributeValue(CustomMobAttributes.SCALE)),
                (float) (i * creeperEntity.getAttributeValue(CustomMobAttributes.SCALE)));
        ci.cancel();
    }
}
