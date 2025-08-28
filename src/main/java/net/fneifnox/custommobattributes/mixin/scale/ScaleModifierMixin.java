package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Priority = 500 for compat reasons
@Mixin(value = LivingEntity.class, priority = 500)
    public abstract class ScaleModifierMixin {

    @Unique
    private double lastScale = 1.0;

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        LivingEntity livingEntity = (LivingEntity)(Object)this;
        double scale = CustomMobAttributes.getScaleAttributeModifierValue(livingEntity, CustomMobAttributes.SCALE);

        if (scale != this.lastScale) {
            this.lastScale = scale;
            livingEntity.calculateDimensions();
        }
    }

    @ModifyReturnValue(method = "getScaleFactor", at = @At("RETURN"))
    public float modifyScaleFactor(float original) {
        LivingEntity livingEntity = (LivingEntity)(Object)this;
        return (float) (livingEntity.isBaby() ? (0.5f * livingEntity.getAttributeValue(CustomMobAttributes.SCALE)) : (1.0f * livingEntity.getAttributeValue(CustomMobAttributes.SCALE)));
    }
}
