package net.fneifnox.custommobattributes.mixin;

import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HuskEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(HuskEntity.class)
public abstract class HuskMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        HuskEntity self = (HuskEntity) (Object) this;

        EntityAttributeInstance healthAttr = self.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
        if (healthAttr != null) {
            healthAttr.setBaseValue(20.0 * CONFIG.healthMultiplierForHusk() * CONFIG.healthMultiplierForAll());
        }

        EntityAttributeInstance damageAttr = self.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
        if (damageAttr != null) {
            damageAttr.setBaseValue(3.0 * CONFIG.damageMultiplierForHusk() * CONFIG.damageMultiplierForAll());
        }

        EntityAttributeInstance speedAttr = self.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
        if (speedAttr != null) {
            speedAttr.setBaseValue(0.23 * CONFIG.speedMultiplierForHusk() * CONFIG.speedMultiplierForAll());
        }

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(Updater.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForHusk() * CONFIG.scaleMultiplierForAll()));
        }
    }
}
