package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.SpiderEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SpiderEntity.class)
public abstract class SpiderMixin {

    @ModifyReturnValue(method = "createSpiderAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifySpiderAttributes(DefaultAttributeContainer.Builder original) {
        double health = 16.0 * CONFIG.healthMultiplierForSpider() * CONFIG.healthMultiplierForAll();
        double damage = 2.0 * CONFIG.damageMultiplierForSpider() * CONFIG.damageMultiplierForAll();
        double speed = 0.30000001192092896 * CONFIG.speedMultiplierForSpider() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForSpider() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_ATTACK_DAMAGE, damage)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
