package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PiglinEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(PiglinEntity.class)
public abstract class PiglinMixin {

    @ModifyReturnValue(method = "createPiglinAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyPiglinAttributes(DefaultAttributeContainer.Builder original) {
        double health = 16.0 * CONFIG.healthMultiplierForPiglin() * CONFIG.healthMultiplierForAll();
        double damage = 5.0 * CONFIG.damageMultiplierForPiglin() * CONFIG.damageMultiplierForAll();
        double speed = 0.3499999940395355 * CONFIG.speedMultiplierForPiglin() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForPiglin() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
