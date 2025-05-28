package net.fneifnox.custommobattributes.mixin;

import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PhantomEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(PhantomEntity.class)
public abstract class PhantomMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        PhantomEntity self = (PhantomEntity) (Object) this;

        EntityAttributeInstance healthAttr = self.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
        if (healthAttr != null) {
            healthAttr.setBaseValue(20.0 * CONFIG.healthMultiplierForPhantom() * CONFIG.healthMultiplierForAll());
        }

        EntityAttributeInstance damageAttr = self.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
        if (damageAttr != null) {
            damageAttr.setBaseValue(2.0 * CONFIG.damageMultiplierForPhantom() * CONFIG.damageMultiplierForAll());
        }

        EntityAttributeInstance speedAttr = self.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
        if (speedAttr != null) {
            speedAttr.setBaseValue(0.7 * CONFIG.speedMultiplierForPhantom() * CONFIG.speedMultiplierForAll());
        }

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(Updater.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForPhantom() * CONFIG.scaleMultiplierForAll()));
        }
    }
}
