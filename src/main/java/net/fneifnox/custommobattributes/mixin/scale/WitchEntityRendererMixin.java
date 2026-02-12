package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.WitchRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Witch;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitchRenderer.class)
public class WitchEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Witch;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("HEAD"))
    private void getEntity(Witch witchEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        entity = witchEntity;
    }

    @ModifyConstant(method = "scale(Lnet/minecraft/world/entity/monster/Witch;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", constant = @Constant(floatValue = 0.9375f))
    private float changeWitchScale(float original) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE.get());
        return original * multiplier;
    }
}
