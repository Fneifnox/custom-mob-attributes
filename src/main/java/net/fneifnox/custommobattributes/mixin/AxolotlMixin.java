package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AxolotlEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(AxolotlEntity.class)
public abstract class AxolotlMixin {

    @ModifyReturnValue(method = "createAxolotlAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyAxolotlAttributes(DefaultAttributeContainer.Builder original) {
        double health = 14.0 * CONFIG.healthMultiplierForAxolotl() * CONFIG.healthMultiplierForAll();
        double damage = 2.0 * CONFIG.damageMultiplierForAxolotl() * CONFIG.damageMultiplierForAll();
        double speed = 1.0 * CONFIG.speedMultiplierForAxolotl() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForAxolotl() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
