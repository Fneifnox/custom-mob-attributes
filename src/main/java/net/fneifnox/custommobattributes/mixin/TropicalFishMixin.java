package net.fneifnox.custommobattributes.mixin;

import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.TropicalFishEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(TropicalFishEntity.class)
public abstract class TropicalFishMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        TropicalFishEntity self = (TropicalFishEntity) (Object) this;

        EntityAttributeInstance healthAttr = self.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
        if (healthAttr != null) {
            healthAttr.setBaseValue(3.0 * CONFIG.healthMultiplierForTropicalFish() * CONFIG.healthMultiplierForAll());
        }

        EntityAttributeInstance speedAttr = self.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
        if (speedAttr != null) {
            speedAttr.setBaseValue(0.7 * CONFIG.speedMultiplierForTropicalFish() * CONFIG.speedMultiplierForAll());
        }

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(Updater.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForTropicalFish() * CONFIG.scaleMultiplierForAll()));
        }
    }
}
