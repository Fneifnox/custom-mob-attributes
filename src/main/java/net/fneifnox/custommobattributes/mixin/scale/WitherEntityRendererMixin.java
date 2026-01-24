package net.fneifnox.custommobattributes.mixin.scale;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.client.renderer.entity.WitherBossRenderer;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@OnlyIn(Dist.CLIENT)
@Mixin(WitherBossRenderer.class)
public class WitherEntityRendererMixin {

    @Inject(method = "scale(Lnet/minecraft/world/entity/boss/wither/WitherBoss;Lcom/mojang/blaze3d/vertex/PoseStack;F)V", at = @At("TAIL"))
    public void changeWitherScale(WitherBoss wither, PoseStack matrixStack, float f, CallbackInfo ci) {
        float multiplier = (float) wither.getAttributeValue(CustomMobAttributes.SCALE.get());
        matrixStack.scale(multiplier, multiplier, multiplier);
    }
}
