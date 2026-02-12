package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.GiantMobRenderer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Giant;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GiantMobRenderer.class)
public abstract class GiantEntityRendererMixin {

    LivingEntity entity;

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Giant;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("HEAD"))
    private void getEntity(Giant giantEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        entity = giantEntity;
    }

    @Redirect(method = "scale(Lnet/minecraft/world/entity/monster/Giant;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;scale(FFF)V"))
    private void changePhantomScale(PoseStack matrixStack, float x, float y, float z) {
        float multiplier = (float) entity.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(x * multiplier, y * multiplier, z * multiplier);
    }
}
