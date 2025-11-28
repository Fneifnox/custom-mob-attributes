package net.fneifnox.custommobattributes.mixin.movement;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractFish.class)
public abstract class FishSpeedMixin {

    @Redirect(method = "travel", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/AbstractFish;moveRelative(FLnet/minecraft/world/phys/Vec3;)V"))
    private void modifySpeed(AbstractFish instance, float speed, Vec3 movementInput) {
        double finalSpeed = speed;

        if (instance instanceof Cod) {
            finalSpeed = speed * Config.VANILLA.speedMultiplierForCod.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof TropicalFish) {
            finalSpeed = speed * Config.VANILLA.speedMultiplierForTropicalFish.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof Salmon) {
            finalSpeed = speed * Config.VANILLA.speedMultiplierForSalmon.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof Pufferfish) {
            finalSpeed = speed * Config.VANILLA.speedMultiplierForPufferfish.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else if (instance instanceof Tadpole) {
            finalSpeed = speed * Config.VANILLA.speedMultiplierForTadpole.get() * Config.VANILLA.speedMultiplierForAll.get();
        }

        instance.moveRelative((float) finalSpeed, movementInput);
    }
}
