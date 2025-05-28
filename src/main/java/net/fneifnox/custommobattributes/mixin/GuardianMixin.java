package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
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
        double health = 30.0 * CONFIG.healthMultiplierForGoat() * CONFIG.healthMultiplierForAll();
        double damage = 6.0 * CONFIG.damageMultiplierForGoat() * CONFIG.damageMultiplierForAll();
        double speed = 0.5 * CONFIG.speedMultiplierForGoat() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForGoat() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
