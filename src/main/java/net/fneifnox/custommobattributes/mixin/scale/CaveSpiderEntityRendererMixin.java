package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.CaveSpiderRenderer;
import net.minecraft.world.entity.monster.CaveSpider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CaveSpiderRenderer.class)
public class CaveSpiderEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/CaveSpider;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("TAIL"))
    private void changeCaveSpiderScale(CaveSpider caveSpiderEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) caveSpiderEntity.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
