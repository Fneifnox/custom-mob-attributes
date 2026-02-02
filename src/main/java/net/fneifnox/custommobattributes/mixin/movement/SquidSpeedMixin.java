package net.fneifnox.custommobattributes.mixin.movement;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.animal.squid.Squid;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(Squid.class)
public class SquidSpeedMixin {

    @WrapOperation(method = "aiStep", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/animal/squid/Squid;setDeltaMovement(Lnet/minecraft/world/phys/Vec3;)V"))
    private void redirectSetVelocity(Squid instance, Vec3 vec3, Operation<Void> original) {
        double speedMultiplier;
        if (CONFIG.adultsAlsoAffectBabies() && instance.isBaby()) {
            speedMultiplier = CONFIG.babySquid.speedMultiplierForBabySquid() * CONFIG.speedMultiplierForBabyAll() * CONFIG.speedMultiplierForSquid() * CONFIG.speedMultiplierForAll();
        }
        else {
            speedMultiplier = instance.isBaby() ? CONFIG.babySquid.speedMultiplierForBabySquid() * CONFIG.speedMultiplierForBabyAll() : CONFIG.speedMultiplierForSquid() * CONFIG.speedMultiplierForAll();
        }
        instance.setDeltaMovement(vec3.x * speedMultiplier, vec3.y * speedMultiplier, vec3.z * speedMultiplier);
    }
}