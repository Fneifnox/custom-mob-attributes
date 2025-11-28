package net.fneifnox.custommobattributes.mixin.movement;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "net.minecraft.world.entity.monster.Vex$VexMoveControl")
public abstract class VexSpeedMixin extends MoveControl {

    public VexSpeedMixin(Mob entity) {
        super(entity);
    }

    @Redirect(method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/phys/Vec3;scale(D)Lnet/minecraft/world/phys/Vec3;"))
    private Vec3 redirectMultiply(Vec3 vec, double scale) {
        if (scale == 0.5d) {
            return vec.scale(scale);
        }

        double speedMultiplier = Config.VANILLA.speedMultiplierForVex.get() * Config.VANILLA.speedMultiplierForAll.get();
        return vec.scale(scale * speedMultiplier);
    }
}