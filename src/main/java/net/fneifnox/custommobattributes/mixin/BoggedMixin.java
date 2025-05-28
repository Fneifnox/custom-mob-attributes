package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.BoggedEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(BoggedEntity.class)
public abstract class BoggedMixin {

    @ModifyReturnValue(method = "createBoggedAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyBoggedAttributes(DefaultAttributeContainer.Builder original) {
        double health = 16.0 * CONFIG.healthMultiplierForBogged() * CONFIG.healthMultiplierForAll();
        double damage = 2.0 * CONFIG.damageMultiplierForBogged() * CONFIG.damageMultiplierForAll();
        double speed = 0.25 * CONFIG.speedMultiplierForBogged() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForBogged() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
