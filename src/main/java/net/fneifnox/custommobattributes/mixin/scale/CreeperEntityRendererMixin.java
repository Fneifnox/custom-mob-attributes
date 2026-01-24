package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.CreeperRenderer;
import net.minecraft.world.entity.monster.Creeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreeperRenderer.class)
public class CreeperEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Creeper;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At(value = "TAIL"))
    private void changeCreeperScale(Creeper creeperEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) creeperEntity.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
