package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.ElderGuardianEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ElderGuardianEntity.class)
public abstract class ElderGuardianMixin {

    @ModifyReturnValue(method = "createElderGuardianAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyElderGuardianAttributes(DefaultAttributeContainer.Builder original) {
        double health = 80.0 * CONFIG.healthMultiplierForElderGuardian() * CONFIG.healthMultiplierForAll();
        double damage = 8.0 * CONFIG.damageMultiplierForElderGuardian() * CONFIG.damageMultiplierForAll();
        double speed = 0.30000001192092896 * CONFIG.speedMultiplierForElderGuardian() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForElderGuardian() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
