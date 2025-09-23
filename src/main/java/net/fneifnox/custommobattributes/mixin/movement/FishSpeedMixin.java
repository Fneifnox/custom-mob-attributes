package net.fneifnox.custommobattributes.mixin.movement;

import net.minecraft.entity.passive.*;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(FishEntity.class)
public abstract class FishSpeedMixin {

    @Redirect(method = "travel(Lnet/minecraft/util/math/Vec3d;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/passive/FishEntity;updateVelocity(FLnet/minecraft/util/math/Vec3d;)V"))
    private void modifySpeed(FishEntity instance, float speed, Vec3d movementInput) {
        double finalSpeed = speed;

        if (instance instanceof CodEntity) {
            finalSpeed = speed * CONFIG.speedMultiplierForCod() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof TropicalFishEntity) {
            finalSpeed = speed * CONFIG.speedMultiplierForTropicalFish() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof SalmonEntity) {
            finalSpeed = speed * CONFIG.speedMultiplierForSalmon() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof PufferfishEntity) {
            finalSpeed = speed * CONFIG.speedMultiplierForPufferfish() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof TadpoleEntity) {
            finalSpeed = speed * CONFIG.speedMultiplierForTadpole() * CONFIG.speedMultiplierForAll();
        }

        instance.updateVelocity((float) finalSpeed, movementInput);
    }
}
