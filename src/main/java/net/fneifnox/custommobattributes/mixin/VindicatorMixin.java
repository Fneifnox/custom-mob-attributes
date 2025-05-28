package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.VindicatorEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(VindicatorEntity.class)
public abstract class VindicatorMixin {

    @ModifyReturnValue(method = "createVindicatorAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyVindicatorAttributes(DefaultAttributeContainer.Builder original) {
        double health = 24.0 * CONFIG.healthMultiplierForVindicator() * CONFIG.healthMultiplierForAll();
        double damage = 13.0 * CONFIG.damageMultiplierForVindicator() * CONFIG.damageMultiplierForAll();
        double speed = 0.3499999940395355 * CONFIG.speedMultiplierForVindicator() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForVindicator() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
