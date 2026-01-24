package net.fneifnox.custommobattributes.mixin.movement;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.passive.*;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(FishEntity.class)
public abstract class FishSpeedMixin {

    @WrapOperation(method = "travel(Lnet/minecraft/util/math/Vec3d;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/passive/FishEntity;updateVelocity(FLnet/minecraft/util/math/Vec3d;)V"))
    private void modifySpeed(FishEntity instance, float originalSpeed, Vec3d movementInput, Operation<Void> original) {
        double finalSpeed = originalSpeed;

        if (instance instanceof CodEntity) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForCod() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof TropicalFishEntity) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForTropicalFish() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof SalmonEntity) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForSalmon() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof PufferfishEntity) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForPufferfish() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof TadpoleEntity) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForTadpole() * CONFIG.speedMultiplierForAll();
        }

        instance.updateVelocity((float) finalSpeed, movementInput);
    }
}
