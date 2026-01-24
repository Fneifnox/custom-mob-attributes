package net.fneifnox.custommobattributes.mixin.movement;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.animal.Squid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Squid.class)
public class SquidSpeedMixin {

    @WrapOperation(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/Squid;setDeltaMovement(DDD)V"))
    private void redirectSetVelocity(Squid instance, double x, double y, double z, Operation<Void> original) {
        double speedMultiplier;
        if (Config.VANILLA.adultsAlsoAffectBabies.get() && instance.isBaby()) {
            speedMultiplier = Config.VANILLA.speedMultiplierForBabySquid.get() * Config.VANILLA.speedMultiplierForBabyAll.get() * Config.VANILLA.speedMultiplierForSquid.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        else {
            speedMultiplier = instance.isBaby() ? Config.VANILLA.speedMultiplierForBabySquid.get() * Config.VANILLA.speedMultiplierForBabyAll.get() : Config.VANILLA.speedMultiplierForSquid.get() * Config.VANILLA.speedMultiplierForAll.get();
        }
        instance.setDeltaMovement(x * speedMultiplier, y * speedMultiplier, z * speedMultiplier);
    }
}