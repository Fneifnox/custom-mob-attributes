package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.GhastRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Ghast;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GhastRenderer.class)
public class GhastEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Ghast;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("HEAD"))
    private void getEntity(Ghast ghastEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        entity = ghastEntity;
    }

    @ModifyConstant(method = "scale(Lnet/minecraft/world/entity/monster/Ghast;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", constant = @Constant(floatValue = 4.5f))
    private float changeGhastScale(float original) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE.get());
        return original * multiplier;
    }
}
