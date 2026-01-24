package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.GhastRenderer;
import net.minecraft.world.entity.monster.Ghast;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GhastRenderer.class)
public class GhastEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Ghast;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("TAIL"))
    private void changeGhastScale(Ghast ghastEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) ghastEntity.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
