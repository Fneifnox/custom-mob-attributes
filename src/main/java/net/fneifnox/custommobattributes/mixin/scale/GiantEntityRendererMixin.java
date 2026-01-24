package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.GiantMobRenderer;
import net.minecraft.world.entity.monster.Giant;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GiantMobRenderer.class)
public abstract class GiantEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Giant;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("TAIL"))
    private void changeGiantScale(Giant giantEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) giantEntity.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
