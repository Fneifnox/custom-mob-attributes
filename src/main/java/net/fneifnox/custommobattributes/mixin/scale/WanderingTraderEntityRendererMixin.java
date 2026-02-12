package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.WanderingTraderRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.npc.WanderingTrader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WanderingTraderRenderer.class)
public class WanderingTraderEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/world/entity/npc/WanderingTrader;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("HEAD"))
    private void getEntity(WanderingTrader wanderingTraderEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        entity = wanderingTraderEntity;
    }

    @ModifyConstant(method = "scale(Lnet/minecraft/world/entity/npc/WanderingTrader;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", constant = @Constant(floatValue = 0.9375f))
    private float changeWanderingTraderScale(float original) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE.get());
        return original * multiplier;
    }
}
