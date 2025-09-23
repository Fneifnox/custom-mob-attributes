package net.fneifnox.custommobattributes.mixin.movement;

import net.minecraft.entity.passive.SquidEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SquidEntity.class)
public class SquidSpeedMixin {

    @Redirect(method = "tickMovement()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/passive/SquidEntity;setVelocity(DDD)V"))
    private void redirectSetVelocity(SquidEntity instance, double x, double y, double z) {
        double speedMultiplier = CONFIG.speedMultiplierForSquid() * CONFIG.speedMultiplierForAll();
        instance.setVelocity(x * speedMultiplier, y * speedMultiplier, z * speedMultiplier);
    }
}