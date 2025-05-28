package net.fneifnox.custommobattributes.mixin;

import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.DonkeyEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(DonkeyEntity.class)
public abstract class DonkeyMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onConstructed(EntityType<? extends DonkeyEntity> entityType, World world, CallbackInfo ci) {
        DonkeyEntity self = (DonkeyEntity)(Object)this;

        EntityAttributeInstance health = self.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
        if (health != null) {
            double scaled = health.getBaseValue()
                    * CONFIG.healthMultiplierForDonkey()
                    * CONFIG.healthMultiplierForAll();
            health.setBaseValue(scaled);
            self.setHealth((float) scaled);
        }

        EntityAttributeInstance speed = self.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
        if (speed != null) {
            double scaled = speed.getBaseValue()
                    * CONFIG.speedMultiplierForDonkey()
                    * CONFIG.speedMultiplierForAll();
            speed.setBaseValue(scaled);
        }

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(Updater.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForDonkey() * CONFIG.scaleMultiplierForAll()));
        }
    }
}
