package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.PhantomRenderer;
import net.minecraft.world.entity.monster.Phantom;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PhantomRenderer.class)
public abstract class PhantomEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/monster/Phantom;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("TAIL"))
    private void changePhantomScale(Phantom phantomEntity, PoseStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) phantomEntity.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
