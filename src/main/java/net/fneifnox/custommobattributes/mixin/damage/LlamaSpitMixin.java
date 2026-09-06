package net.fneifnox.custommobattributes.mixin.damage;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.animal.equine.Llama;
import net.minecraft.world.entity.animal.equine.TraderLlama;
import net.minecraft.world.entity.projectile.LlamaSpit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Objects;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(LlamaSpit.class)
public class LlamaSpitMixin {
    @WrapOperation(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private boolean injectCustomDamage(Entity entity, ServerLevel serverWorld, DamageSource source, float originalDamage, Operation<Boolean> original) {
        LlamaSpit llamaSpitEntity = (LlamaSpit)(Object)this;
        double multiplier = 1;
        if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityTypes.LLAMA) {
            Llama llamaEntity = (Llama) llamaSpitEntity.getOwner();
            if (CONFIG.adultsAlsoAffectBabies() && llamaEntity.isBaby()) {
                multiplier = CONFIG.babyLlama.damageMultiplierForBabyLlama() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForLlama() * CONFIG.damageMultiplierForAll();
            }
            else {
                multiplier = llamaEntity.isBaby() ? CONFIG.babyLlama.damageMultiplierForBabyLlama() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForLlama() * CONFIG.damageMultiplierForAll();
            }
        }
        else if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityTypes.TRADER_LLAMA) {
            TraderLlama traderLlamaEntity = (TraderLlama) llamaSpitEntity.getOwner();
            if (CONFIG.adultsAlsoAffectBabies() && traderLlamaEntity.isBaby()) {
                multiplier = CONFIG.babyTraderLlama.damageMultiplierForBabyTraderLlama() * CONFIG.damageMultiplierForBabyAll() * CONFIG.damageMultiplierForTraderLlama() * CONFIG.damageMultiplierForAll();
            }
            else {
                multiplier = traderLlamaEntity.isBaby() ? CONFIG.babyTraderLlama.damageMultiplierForBabyTraderLlama() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForTraderLlama() * CONFIG.damageMultiplierForAll();
            }
        }
        return entity.hurtServer(serverWorld, source, (float) (originalDamage * multiplier));
    }
}
