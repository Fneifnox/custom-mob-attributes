package net.fneifnox.custommobattributes.mixin.movement;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.animal.Squid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Squid.class)
public class SquidSpeedMixin {

    @Redirect(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/Squid;setDeltaMovement(DDD)V"))
    private void redirectSetVelocity(Squid instance, double x, double y, double z) {
        double speedMultiplier = instance.isBaby() ? CONFIG.babySquid.speedMultiplierForBabySquid() * CONFIG.speedMultiplierForBabyAll() : CONFIG.speedMultiplierForSquid() * CONFIG.speedMultiplierForAll();
        instance.setDeltaMovement(x * speedMultiplier, y * speedMultiplier, z * speedMultiplier);
    }
}