package net.fneifnox.custommobattributes.mixin.scale;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin<T extends LivingEntity, M extends EntityModel<T>> {

    @Inject(method = "scale", at = @At("HEAD"))
    private void changeEntityScale(T entity, MatrixStack matrices, float amount, CallbackInfo ci) {
        double scale = CustomMobAttributes.getScaleAttributeModifierValue(entity, CustomMobAttributes.SCALE);
        // Skaliere das Entity am Anfang der Render-Methode
        matrices.scale((float)scale, (float)scale, (float)scale);
    }
}
