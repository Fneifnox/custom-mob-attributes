package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.monster.Creeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperRenderer.class)
public class CreeperEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Creeper;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At(value = "HEAD"), cancellable = true)
    private void changeCreeperScale(Creeper creeperEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        float g = creeperEntity.getSwelling(f);
        float h = 1.0F + Mth.sin(g * 100.0F) * g * 0.01F;
        g = Mth.clamp(g, 0.0F, 1.0F);
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
