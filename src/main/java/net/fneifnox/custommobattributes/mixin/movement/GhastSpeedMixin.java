package net.fneifnox.custommobattributes.mixin.movement;

import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(targets = "net.minecraft.world.entity.monster.Ghast$GhastMoveControl")
public abstract class GhastSpeedMixin extends MoveControl {

    public GhastSpeedMixin(Mob entity) {
        super(entity);
    }

    @WrapOperation(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/phys/Vec3;scale(D)Lnet/minecraft/world/phys/Vec3;"))
    private Vec3 redirectMultiply(Vec3 vec, double originalSpeed, com.llamalad7.mixinextras.injector.wrapoperation.Operation<Vec3> original) {
        if (originalSpeed == 0.5d) {
            return vec.scale(originalSpeed);
        }

        double speedMultiplier = Config.VANILLA.speedMultiplierForGhast.get() * Config.VANILLA.speedMultiplierForAll.get();
        return vec.scale(originalSpeed * speedMultiplier);
    }
}
