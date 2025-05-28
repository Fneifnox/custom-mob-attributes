package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.CaveSpiderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(CaveSpiderEntity.class)
public abstract class CaveSpiderMixin {

    @ModifyReturnValue(method = "createCaveSpiderAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyCaveSpiderAttributes(DefaultAttributeContainer.Builder original) {
        double health = 12.0 * CONFIG.healthMultiplierForCaveSpider() * CONFIG.healthMultiplierForAll();
        double damage = 2.0 * CONFIG.damageMultiplierForCaveSpider() * CONFIG.damageMultiplierForAll();
        double speed = 0.30000001192092896 * CONFIG.speedMultiplierForCaveSpider() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForCaveSpider() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
