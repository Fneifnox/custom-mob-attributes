package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.ElderGuardianRenderer;
import net.minecraft.world.entity.monster.Guardian;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ElderGuardianRenderer.class)
public abstract class ElderGuardianEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Guardian;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("TAIL"))
    private void changeElderGuardianScale(Guardian guardianEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) guardianEntity.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
