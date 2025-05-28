package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.ZombieEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ZombieEntity.class)
public abstract class ZombieMixin {

    @ModifyReturnValue(method = "createZombieAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyZombieAttributes(DefaultAttributeContainer.Builder original) {
        double health = 20.0 * CONFIG.healthMultiplierForZombie() * CONFIG.healthMultiplierForAll();
        double damage = 3.0 * CONFIG.damageMultiplierForZombie() * CONFIG.damageMultiplierForAll();
        double speed = 0.23000000417232513 * CONFIG.speedMultiplierForZombie() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForZombie() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}

