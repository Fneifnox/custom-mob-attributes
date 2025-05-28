package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.SkeletonHorseEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SkeletonHorseEntity.class)
public abstract class SkeletonHorseMixin {

    @ModifyReturnValue(method = "createSkeletonHorseAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifySkeletonHorseAttributes(DefaultAttributeContainer.Builder original) {
        double health = 15.0 * CONFIG.healthMultiplierForSkeletonHorse() * CONFIG.healthMultiplierForAll();
        double speed = 0.20000000298023224 * CONFIG.speedMultiplierForSkeletonHorse() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForSkeletonHorse() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
