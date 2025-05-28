package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PiglinBruteEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(PiglinBruteEntity.class)
public abstract class PiglinBruteMixin {

    @ModifyReturnValue(method = "createPiglinBruteAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyPiglinBruteAttributes(DefaultAttributeContainer.Builder original) {
        double health = 50.0 * CONFIG.healthMultiplierForPiglinBrute() * CONFIG.healthMultiplierForAll();
        double damage = 13.0 * CONFIG.damageMultiplierForPiglinBrute() * CONFIG.damageMultiplierForAll();
        double speed = 0.3499999940395355 * CONFIG.speedMultiplierForPiglinBrute() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForPiglinBrute() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
