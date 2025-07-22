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
                    target = "Lnet/minecraft/entity/passive/AllayEntity;travelFlying(Lnet/minecraft/util/math/Vec3d;F)V"
            )
    )
    private void modifySpeed(AllayEntity instance, Vec3d movementInput, float speed) {
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