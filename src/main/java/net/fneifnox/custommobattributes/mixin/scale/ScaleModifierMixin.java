package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.WitherEntity;
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
        LivingEntity entity = (LivingEntity)(Object)this;
        double scale = CustomMobAttributes.getScaleAttributeModifierValue(entity, CustomMobAttributes.SCALE);

        if (scale != this.lastScale) {
            this.lastScale = scale;
            entity.calculateDimensions();
        }
    }

    @ModifyReturnValue(method = "getDimensions", at = @At("RETURN"))
    private EntityDimensions modifyDimensions(EntityDimensions original) {
        LivingEntity entity = (LivingEntity) (Object) this;
        double scale = CustomMobAttributes.getScaleAttributeModifierValue(entity, CustomMobAttributes.SCALE);

        EntityDimensions base = entity.getType().getDimensions();
        if (entity instanceof WitherEntity) {
            System.out.println("Original width: " + base.width + ", height: " + base.height);
        }
        EntityDimensions scaled = base.scaled((float)scale);
        if (entity instanceof WitherEntity) {
            System.out.println("Scaled width: " + scaled.width + ", height: " + scaled.height);
        }
        return scaled;
    }
}
