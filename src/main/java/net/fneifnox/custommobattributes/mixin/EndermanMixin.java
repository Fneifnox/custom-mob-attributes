package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.EndermanEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(EndermanEntity.class)
public abstract class EndermanMixin {

    @ModifyReturnValue(method = "createEndermanAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyEndermanAttributes(DefaultAttributeContainer.Builder original) {
        double health = 40.0 * CONFIG.healthMultiplierForEnderman() * CONFIG.healthMultiplierForAll();
        double damage = 7.0 * CONFIG.damageMultiplierForEnderman() * CONFIG.damageMultiplierForAll();
        double speed = 0.30000001192092896 * CONFIG.speedMultiplierForEnderman() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForEnderman() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
