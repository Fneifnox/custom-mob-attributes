package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.ParrotEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ParrotEntity.class)
public abstract class ParrotMixin {

    @ModifyReturnValue(method = "createParrotAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyParrotAttributes(DefaultAttributeContainer.Builder original) {
        double health = 6.0 * CONFIG.healthMultiplierForParrot() * CONFIG.healthMultiplierForAll();
        double damage = 3.0 * CONFIG.damageMultiplierForParrot() * CONFIG.damageMultiplierForAll();
        double speed = 0.20000000298023224 * CONFIG.speedMultiplierForParrot() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForParrot() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
