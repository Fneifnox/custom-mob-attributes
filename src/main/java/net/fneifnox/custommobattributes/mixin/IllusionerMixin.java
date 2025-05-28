package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.IllusionerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(IllusionerEntity.class)
public abstract class IllusionerMixin {

    @ModifyReturnValue(method = "createIllusionerAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyIllusionerAttributes(DefaultAttributeContainer.Builder original) {
        double health = 32.0 * CONFIG.healthMultiplierForIllusioner() * CONFIG.healthMultiplierForAll();
        double damage = 2.0 * CONFIG.damageMultiplierForIllusioner() * CONFIG.damageMultiplierForAll();
        double speed = 0.5 * CONFIG.speedMultiplierForIllusioner() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForIllusioner() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
