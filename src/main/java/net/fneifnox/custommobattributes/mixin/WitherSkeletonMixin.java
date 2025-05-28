package net.fneifnox.custommobattributes.mixin;

import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(WitherSkeletonEntity.class)
public abstract class WitherSkeletonMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        WitherSkeletonEntity self = (WitherSkeletonEntity) (Object) this;

        EntityAttributeInstance healthAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (healthAttr != null) {
            healthAttr.setBaseValue(20.0 * CONFIG.healthMultiplierForWitherSkeleton() * CONFIG.healthMultiplierForAll());
        }

        EntityAttributeInstance damageAttr = self.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        if (damageAttr != null) {
            damageAttr.setBaseValue(8.0 * CONFIG.damageMultiplierForWitherSkeleton() * CONFIG.damageMultiplierForAll());
        }

        EntityAttributeInstance speedAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
        if (speedAttr != null) {
            speedAttr.setBaseValue(0.25 * CONFIG.speedMultiplierForWitherSkeleton() * CONFIG.speedMultiplierForAll());
        }

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(EntityAttributes.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForWitherSkeleton() * CONFIG.scaleMultiplierForAll()));
        }
    }
}
