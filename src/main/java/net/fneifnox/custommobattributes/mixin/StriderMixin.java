package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.StriderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(StriderEntity.class)
public abstract class StriderMixin {

    @ModifyReturnValue(method = "createStriderAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyStriderAttributes(DefaultAttributeContainer.Builder original) {
        double health = 20.0 * CONFIG.healthMultiplierForStrider() * CONFIG.healthMultiplierForAll();
        double speed = 0.11549999740719796 * CONFIG.speedMultiplierForStrider() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForStrider() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
