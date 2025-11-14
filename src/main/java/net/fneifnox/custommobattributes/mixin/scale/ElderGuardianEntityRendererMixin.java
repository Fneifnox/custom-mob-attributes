package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.render.entity.ElderGuardianEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.GuardianEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ElderGuardianEntityRenderer.class)
public abstract class ElderGuardianEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/entity/mob/GuardianEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At("HEAD"))
    private void getEntity(GuardianEntity guardianEntity, MatrixStack matrixStack, float f, CallbackInfo ci) {
        entity = guardianEntity;
    }

    @Redirect(method = "scale(Lnet/minecraft/entity/mob/GuardianEntity;Lnet/minecraft/client/util/math/MatrixStack;F)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;scale(FFF)V"))
    private void changeElderGuardianScale(MatrixStack matrixStack, float x, float y, float z) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE);
        matrixStack.scale(x * multiplier, y * multiplier, z * multiplier);
    }
}
