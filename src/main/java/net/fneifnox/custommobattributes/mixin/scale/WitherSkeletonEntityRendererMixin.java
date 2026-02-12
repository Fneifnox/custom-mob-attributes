package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.WitherSkeletonRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.AbstractSkeleton;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherSkeletonRenderer.class)
public class WitherSkeletonEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/AbstractSkeleton;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("HEAD"))
    private void getEntity(AbstractSkeleton abstractSkeletonEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        entity = abstractSkeletonEntity;
    }

    @ModifyConstant(method = "scale(Lnet/minecraft/world/entity/monster/AbstractSkeleton;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", constant = @Constant(floatValue = 1.2f))
    private float changeBatScale(float original) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE.get());
        return original * multiplier;
    }
}
