package net.fneifnox.custommobattributes.mixin;

import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(HorseEntity.class)
public abstract class HorseMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        HorseEntity self = (HorseEntity) (Object) this;
        Random random = self.getRandom();

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(EntityAttributes.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForHorse() * CONFIG.scaleMultiplierForAll()));
        }
    }

    @Inject(method = "initAttributes", at = @At("TAIL"))
    private void onInitAttributes(Random random, CallbackInfo ci) {
        HorseEntity self = (HorseEntity) (Object) this;

        // ===== Health =====
        EntityAttributeInstance healthAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (healthAttr != null) {
            double original = healthAttr.getBaseValue();
            double scaled = original * CONFIG.healthMultiplierForHorse() * CONFIG.healthMultiplierForAll();
            healthAttr.setBaseValue(scaled);
        }

        // ===== Speed =====
        EntityAttributeInstance speedAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
        if (speedAttr != null) {
            double original = speedAttr.getBaseValue();
            double scaled = original * CONFIG.speedMultiplierForHorse() * CONFIG.speedMultiplierForAll();
            speedAttr.setBaseValue(scaled);
        }
    }
}

