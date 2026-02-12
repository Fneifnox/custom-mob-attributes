package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Priority = 500 for compat reasons
@Mixin(LivingEntity.class)
public abstract class ScaleModifierMixin {

    @Unique
    private double lastScale = 1.0;

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        LivingEntity livingEntity = (LivingEntity)(Object)this;

        double scale = livingEntity.getAttributeValue(CustomMobAttributes.SCALE.get());

        if (scale != this.lastScale) {
            System.out.println("TICK - refreshDimensions");
            this.lastScale = scale;
            livingEntity.refreshDimensions();
        }
    }

    @ModifyReturnValue(method = "getScale", at = @At("RETURN"))
    public float modifyScaleFactor(float original) {
        LivingEntity livingEntity = (LivingEntity)(Object)this;
        if (livingEntity.getAttributes() != null) {
            System.out.println("GETSCALE - custom");
            return (float) (livingEntity.isBaby() ? (0.5f * livingEntity.getAttributeValue(CustomMobAttributes.SCALE.get())) : (1.0f * livingEntity.getAttributeValue(CustomMobAttributes.SCALE.get())));
        }
        System.out.println("GETSCALE - original");
        return 1f;
    }
}
