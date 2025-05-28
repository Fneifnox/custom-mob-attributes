package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.DolphinEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(DolphinEntity.class)
public abstract class DolphinMixin {

    @ModifyReturnValue(method = "createDolphinAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyDolphinAttributes(DefaultAttributeContainer.Builder original) {
        double health = 10.0 * CONFIG.healthMultiplierForDolphin() * CONFIG.healthMultiplierForAll();
        double damage = 3.0 * CONFIG.damageMultiplierForDolphin() * CONFIG.damageMultiplierForAll();
        double speed = 1.2000000476837158 * CONFIG.speedMultiplierForDolphin() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForDolphin() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
