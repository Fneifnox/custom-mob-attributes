package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.GhastEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(GhastEntity.class)
public abstract class GhastMixin {

    @ModifyReturnValue(method = "createGhastAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyGhastAttributes(DefaultAttributeContainer.Builder original) {
        double health = 10.0 * CONFIG.healthMultiplierForGhast() * CONFIG.healthMultiplierForAll();
        double speed = 0.7 * CONFIG.speedMultiplierForGhast() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForGhast() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}

