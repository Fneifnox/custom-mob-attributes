package net.fneifnox.custommobattributes.mixin.scale;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(EntityRenderer.class)
public abstract class ShadowRadiusMixin<T extends Entity> {

    @Shadow
    protected float shadowRadius;

    @Unique
    private Float baseShadowRadius = null;

    @Inject(method = "render", at = @At("HEAD"))
    private void changeEntityShadow(T entity, float entityYaw, float partialTicks, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int packedLight, CallbackInfo ci) {
        if (!(entity instanceof LivingEntity)) return;
        double scale = CustomMobAttributes.getScaleAttributeModifierValue((LivingEntity) entity, CustomMobAttributes.SCALE);

        if (baseShadowRadius == null) {
            baseShadowRadius = this.shadowRadius;
        }

        this.shadowRadius = baseShadowRadius * (float) scale;
    }
}