package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.PhantomEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PhantomEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PhantomEntityRenderer.class)
public abstract class PhantomEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/entity/mob/PhantomEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("HEAD"))
    private void getEntity(PhantomEntity phantomEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        entity = phantomEntity;
    }

    @Redirect(method = "scale(Lnet/minecraft/entity/mob/PhantomEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V"))
    private void changePhantomScale(MatrixStack matrixStack, float x, float y, float z) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(x * multiplier, y * multiplier, z * multiplier);
    }
}
