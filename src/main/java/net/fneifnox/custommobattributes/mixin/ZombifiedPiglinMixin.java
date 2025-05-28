package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ZombifiedPiglinEntity.class)
public abstract class ZombifiedPiglinMixin {

    @ModifyReturnValue(method = "createZombifiedPiglinAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyZombifiedPiglinAttributes(DefaultAttributeContainer.Builder original) {
        double health = 20.0 * CONFIG.healthMultiplierForZombifiedPiglin() * CONFIG.healthMultiplierForAll();
        double damage = 8.0 * CONFIG.damageMultiplierForZombifiedPiglin() * CONFIG.damageMultiplierForAll();
        double speed = 0.23000000417232513 * CONFIG.speedMultiplierForZombifiedPiglin() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForZombifiedPiglin() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
