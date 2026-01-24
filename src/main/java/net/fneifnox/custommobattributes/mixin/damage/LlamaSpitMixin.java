package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.entity.passive.TraderLlamaEntity;
import net.minecraft.entity.projectile.LlamaSpitEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Objects;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(LlamaSpitEntity.class)
public class LlamaSpitMixin {
    @WrapOperation(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private boolean injectCustomDamage(Entity entity, ServerWorld serverWorld, DamageSource source, float originalDamage, Operation<Boolean> original) {
        LlamaSpitEntity llamaSpitEntity = (LlamaSpitEntity)(Object)this;
        double multiplier = 1;
        if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityType.LLAMA) {
            LlamaEntity llamaEntity = (LlamaEntity) llamaSpitEntity.getOwner();
            if (CONFIG.adultsAlsoAffectBabies() && llamaEntity.isBaby()) {
                multiplier = CONFIG.babyLlama.damageMultiplierForBabyLlama() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForLlama() * CONFIG.damageMultiplierForAll();
            }
            else {
                multiplier = llamaEntity.isBaby() ? CONFIG.babyLlama.damageMultiplierForBabyLlama() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForLlama() * CONFIG.damageMultiplierForAll();
            }
        }
        else if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityType.TRADER_LLAMA) {
            TraderLlamaEntity traderLlamaEntity = (TraderLlamaEntity) llamaSpitEntity.getOwner();
            if (CONFIG.adultsAlsoAffectBabies() && traderLlamaEntity.isBaby()) {
                multiplier = CONFIG.babyTraderLlama.damageMultiplierForBabyTraderLlama() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForTraderLlama() * CONFIG.damageMultiplierForAll();
            }
            else {
                multiplier = traderLlamaEntity.isBaby() ? CONFIG.babyTraderLlama.damageMultiplierForBabyTraderLlama() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForTraderLlama() * CONFIG.damageMultiplierForAll();
            }
        }
        return entity.damage(serverWorld, source, (float) (originalDamage * multiplier));
    }
}
