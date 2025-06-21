package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.GuardianEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(GuardianEntity.class)
public abstract class GuardianMixin {

    @ModifyReturnValue(method = "createGuardianAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyGuardianAttributes(DefaultAttributeContainer.Builder original) {
        double health = 30.0 * CONFIG.healthMultiplierForGuardian() * CONFIG.healthMultiplierForAll();
        double damage = 6.0 * CONFIG.damageMultiplierForGuardian() * CONFIG.damageMultiplierForAll();
        double speed = 0.5 * CONFIG.speedMultiplierForGuardian() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForGuardian() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
