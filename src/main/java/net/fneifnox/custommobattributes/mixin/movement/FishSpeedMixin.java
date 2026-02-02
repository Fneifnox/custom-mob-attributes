package net.fneifnox.custommobattributes.mixin.movement;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.animal.fish.*;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(AbstractFish.class)
public abstract class FishSpeedMixin {

    @WrapOperation(method = "travelInWater", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/fish/AbstractFish;moveRelative(FLnet/minecraft/world/phys/Vec3;)V"))
    private void modifySpeed(AbstractFish instance, float originalSpeed, Vec3 movementInput, Operation<Void> original) {
        double finalSpeed = originalSpeed;

        if (instance instanceof Cod) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForCod() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof TropicalFish) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForTropicalFish() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof Salmon) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForSalmon() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof Pufferfish) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForPufferfish() * CONFIG.speedMultiplierForAll();
        }
        else if (instance instanceof Tadpole) {
            finalSpeed = originalSpeed * CONFIG.speedMultiplierForTadpole() * CONFIG.speedMultiplierForAll();
        }

        instance.moveRelative((float) finalSpeed, movementInput);
    }
}
