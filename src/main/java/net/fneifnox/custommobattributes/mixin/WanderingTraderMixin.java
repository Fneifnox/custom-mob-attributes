package net.fneifnox.custommobattributes.mixin;

import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.WanderingTraderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(WanderingTraderEntity.class)
public abstract class WanderingTraderMixin {

    @Inject(method = "<init>", at = @At("TAIL"))
    private void onInit(CallbackInfo ci) {
        WanderingTraderEntity self = (WanderingTraderEntity) (Object) this;

        EntityAttributeInstance healthAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH);
        if (healthAttr != null) {
            healthAttr.setBaseValue(20.0 * CONFIG.healthMultiplierForWanderingTrader() * CONFIG.healthMultiplierForAll());
        }

        EntityAttributeInstance speedAttr = self.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED);
        if (speedAttr != null) {
            speedAttr.setBaseValue(0.7 * CONFIG.speedMultiplierForWanderingTrader() * CONFIG.speedMultiplierForAll());
        }

        EntityAttributeInstance scaleAttr = self.getAttributeInstance(EntityAttributes.GENERIC_SCALE);
        if (scaleAttr != null) {
            scaleAttr.setBaseValue((float) (1.0 * CONFIG.scaleMultiplierForWanderingTrader() * CONFIG.scaleMultiplierForAll()));
        }
    }
}
