package net.fneifnox.custommobattributes.mixin.movement;

import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(targets = "net.minecraft.entity.mob.VexEntity$VexMoveControl")
public abstract class VexSpeedMixin extends MoveControl {

    public VexSpeedMixin(MobEntity entity) {
        super(entity);
    }

    @Redirect(
            method = "tick()V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/util/math/Vec3d;multiply(D)Lnet/minecraft/util/math/Vec3d;"
            )
    )
    private Vec3d redirectMultiply(Vec3d vec, double scale) {
        if (scale == 0.5d) {
            return vec.multiply(scale);
        }

        double speedMultiplier = CONFIG.speedMultiplierForVex() * CONFIG.speedMultiplierForAll();
        return vec.multiply(scale * speedMultiplier);
    }
}