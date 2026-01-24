package net.fneifnox.custommobattributes.mixin.movement;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Bat.class)
public class BatSpeedMixin {

    @Shadow @Nullable private BlockPos targetPosition;

    @ModifyVariable(method = "customServerAiStep", at = @At("STORE"), ordinal = 1)
    private Vec3 modifyForwardSpeed(Vec3 original) {
        Bat bat = (Bat)(Object)this;

        if (targetPosition == null) return original;

        double d = (double)targetPosition.getX() + 0.5 - bat.getX();
        double e = (double)targetPosition.getY() + 0.1 - bat.getY();
        double f = (double)targetPosition.getZ() + 0.5 - bat.getZ();

        Vec3 finalVec3d = bat.getDeltaMovement();
        Vec3 finalVec3d2 = finalVec3d.add
                ((Math.signum(d) * 0.5 - finalVec3d.x) * 0.10000000149011612 * Config.VANILLA.speedMultiplierForBat.get() * Config.VANILLA.speedMultiplierForAll.get(),
                        (Math.signum(e) * 0.699999988079071 - finalVec3d.y) * 0.10000000149011612 * Config.VANILLA.speedMultiplierForBat.get() * Config.VANILLA.speedMultiplierForAll.get(),
                        (Math.signum(f) * 0.5 - finalVec3d.z) * 0.10000000149011612 * Config.VANILLA.speedMultiplierForBat.get() * Config.VANILLA.speedMultiplierForAll.get());
        return finalVec3d2;
    }
}
