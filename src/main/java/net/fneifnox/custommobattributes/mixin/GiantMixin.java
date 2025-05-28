package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.GiantEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(GiantEntity.class)
public abstract class GiantMixin {

    @ModifyReturnValue(method = "createGiantAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyGiantAttributes(DefaultAttributeContainer.Builder original) {
        double health = 100.0 * CONFIG.healthMultiplierForGiant() * CONFIG.healthMultiplierForAll();
        double damage = 50.0 * CONFIG.damageMultiplierForGiant() * CONFIG.damageMultiplierForAll();
        double speed = 0.5 * CONFIG.speedMultiplierForGiant() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForGiant() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
