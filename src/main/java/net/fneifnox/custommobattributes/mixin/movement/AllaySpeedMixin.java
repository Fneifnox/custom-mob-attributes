package net.fneifnox.custommobattributes.mixin.movement;

import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(AllayEntity.class)
public abstract class AllaySpeedMixin {

    @Redirect(
            method = "travel(Lnet/minecraft/util/math/Vec3d;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/passive/AllayEntity;updateVelocity(FLnet/minecraft/util/math/Vec3d;)V"
            )
    )
    private void modifySpeed(AllayEntity instance, float speed, Vec3d movementInput) {
        float finalSpeed = speed;
        if (instance.isTouchingWater()) {
            finalSpeed = speed * CONFIG.speedMultiplierForAllay() * CONFIG.speedMultiplierForAll();
        }
        else if (instance.isInLava()) {
            finalSpeed = speed * CONFIG.speedMultiplierForAllay() * CONFIG.speedMultiplierForAll();
        }
        else {
            finalSpeed = speed * CONFIG.speedMultiplierForAllay() * CONFIG.speedMultiplierForAll();
        }
        instance.updateVelocity(finalSpeed, movementInput);
    }
}