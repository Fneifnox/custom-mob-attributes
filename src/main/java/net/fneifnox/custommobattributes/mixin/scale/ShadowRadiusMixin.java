package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@OnlyIn(Dist.CLIENT)
@Mixin(EntityRenderer.class)
public abstract class ShadowRadiusMixin<T extends Entity> {

    @Shadow
    protected float shadowRadius;

    @Unique
    private Float baseShadowRadius = null;

    @Inject(method = "render", at = @At("HEAD"))
    private void changeEntityShadow(T entity, float entityYaw, float partialTicks, PoseStack matrixStack, MultiBufferSource vertexConsumerProvider, int packedLight, CallbackInfo ci) {
        if (!(entity instanceof LivingEntity)) return;
        double scale = ((LivingEntity) entity).getAttributeValue(CustomMobAttributes.SCALE.get());

        if (baseShadowRadius == null) {
            baseShadowRadius = this.shadowRadius;
        }

        this.shadowRadius = baseShadowRadius * (float) scale;
    }
}