package net.fneifnox.custommobattributes.mixin.movement;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(targets = "net.minecraft.entity.mob.GhastEntity$GhastMoveControl")
public abstract class GhastSpeedMixin extends MoveControl {

    public GhastSpeedMixin(MobEntity entity) {
        super(entity);
    }

    @WrapOperation(method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/Vec3d;multiply(D)Lnet/minecraft/util/math/Vec3d;"))
    private Vec3d redirectMultiply(Vec3d vec, double originalSpeed, Operation<Vec3d> original) {
        if (originalSpeed == 0.5d) {
            return vec.multiply(originalSpeed);
        }

        double speedMultiplier = CONFIG.speedMultiplierForGhast() * CONFIG.speedMultiplierForAll();
        return vec.multiply(originalSpeed * speedMultiplier);
    }
}
