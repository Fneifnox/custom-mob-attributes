package net.fneifnox.custommobattributes.mixin;

import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.DonkeyEntity;
import net.minecraft.entity.passive.MooshroomEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(MooshroomEntity.class)
public abstract class MooshroomMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        MooshroomEntity self = (MooshroomEntity) (Object) this;

        EntityAttributeInstance healthAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (healthAttr != null) {
            healthAttr.setBaseValue(10.0 * CONFIG.healthMultiplierForMooshroom() * CONFIG.healthMultiplierForAll());
        }

        EntityAttributeInstance speedAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
        if (speedAttr != null) {
            speedAttr.setBaseValue(0.20000000298023224 * CONFIG.speedMultiplierForMooshroom() * CONFIG.speedMultiplierForAll());
        }

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(EntityAttributes.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForMooshroom() * CONFIG.scaleMultiplierForAll()));
        }
    }
}
