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
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(BatEntity.class)
public class BatSpeedMixin extends MobEntity {

    @Shadow @Nullable private BlockPos hangingPosition;

    public BatSpeedMixin(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method = "mobTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/passive/BatEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V"), cancellable = true)
    private void modifyForwardSpeed(CallbackInfo ci) {

        double d = (double)hangingPosition.getX() + 0.5 - this.getX();
        double e = (double)hangingPosition.getY() + 0.1 - this.getY();
        double f = (double)hangingPosition.getZ() + 0.5 - this.getZ();

        Vec3d finalVec3d = this.getVelocity();
        Vec3d finalVec3d2 = finalVec3d.add
                ((Math.signum(d) * 0.5 - finalVec3d.x) * 0.10000000149011612 * CONFIG.speedMultiplierForBat() * CONFIG.speedMultiplierForAll(),
                        (Math.signum(e) * 0.699999988079071 - finalVec3d.y) * 0.10000000149011612 * CONFIG.speedMultiplierForBat() * CONFIG.speedMultiplierForAll(),
                        (Math.signum(f) * 0.5 - finalVec3d.z) * 0.10000000149011612 * CONFIG.speedMultiplierForBat() * CONFIG.speedMultiplierForAll());
        this.setVelocity(finalVec3d2);
        ci.cancel();
    }
}
