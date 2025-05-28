package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.SnowGolemEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SnowGolemEntity.class)
public abstract class SnowGolemMixin {

    @ModifyReturnValue(method = "createSnowGolemAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifySnowGolemAttributes(DefaultAttributeContainer.Builder original) {
        double health = 4.0 * CONFIG.healthMultiplierForSnowGolem() * CONFIG.healthMultiplierForAll();
        double speed = 0.20000000298023224 * CONFIG.speedMultiplierForSnowGolem() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForSnowGolem() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
