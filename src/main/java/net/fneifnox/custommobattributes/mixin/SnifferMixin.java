package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.SnifferEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SnifferEntity.class)
public abstract class SnifferMixin {

    @ModifyReturnValue(method = "createSnifferAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifySnifferAttributes(DefaultAttributeContainer.Builder original) {
        double health = 14.0 * CONFIG.healthMultiplierForSniffer() * CONFIG.healthMultiplierForAll();
        double speed = 0.10000000149011612 * CONFIG.speedMultiplierForSniffer() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForSniffer() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
