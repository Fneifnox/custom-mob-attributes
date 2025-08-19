package net.fneifnox.custommobattributes.mixin.movement;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(BatEntity.class)
public class BatSpeedMixin {

    @Shadow @Nullable private BlockPos hangingPosition;

    @ModifyVariable(method = "mobTick", at = @At("STORE"), ordinal = 1)
    private Vec3d modifyForwardSpeed(Vec3d original) {
        BatEntity bat = (BatEntity)(Object)this;

        double d = (double)hangingPosition.getX() + 0.5 - bat.getX();
        double e = (double)hangingPosition.getY() + 0.1 - bat.getY();
        double f = (double)hangingPosition.getZ() + 0.5 - bat.getZ();

        Vec3d finalVec3d = bat.getVelocity();
        Vec3d finalVec3d2 = finalVec3d.add
                ((Math.signum(d) * 0.5 - finalVec3d.x) * 0.10000000149011612 * CONFIG.speedMultiplierForBat() * CONFIG.speedMultiplierForAll(),
                        (Math.signum(e) * 0.699999988079071 - finalVec3d.y) * 0.10000000149011612 * CONFIG.speedMultiplierForBat() * CONFIG.speedMultiplierForAll(),
                        (Math.signum(f) * 0.5 - finalVec3d.z) * 0.10000000149011612 * CONFIG.speedMultiplierForBat() * CONFIG.speedMultiplierForAll());
        return finalVec3d2;

    }
}
