package net.fneifnox.custommobattributes.mixin.movement;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractFish.class)
public abstract class FishSpeedMixin {

    @WrapOperation(method = "travel", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/AbstractFish;moveRelative(FLnet/minecraft/world/phys/Vec3;)V"))
    private void modifySpeed(AbstractFish instance, float originalSpeed, Vec3 movementInput, Operation<Void> original) {
        double finalSpeed = originalSpeed;

        if (instance instanceof Cod) {
            finalSpeed = originalSpeed * Config.VANILLA.speedMultiplierForCod.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof TropicalFish) {
            finalSpeed = originalSpeed * Config.VANILLA.speedMultiplierForTropicalFish.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof Salmon) {
            finalSpeed = originalSpeed * Config.VANILLA.speedMultiplierForSalmon.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof Pufferfish) {
            finalSpeed = originalSpeed * Config.VANILLA.speedMultiplierForPufferfish.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof Tadpole) {
            finalSpeed = originalSpeed * Config.VANILLA.speedMultiplierForTadpole.get() * Config.VANILLA.speedMultiplierForAll.get();
        }

        instance.moveRelative((float) finalSpeed, movementInput);
    }
}
