package net.fneifnox.custommobattributes;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.*;
import net.minecraft.util.math.random.Random;

import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class AttributeUpdater {

    public static void register() {
        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (HuskEntity husk : world.getEntitiesByType(EntityType.HUSK, entity -> true)) {

                var health = husk.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 20.0 * CONFIG.healthMultiplierForHusk() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        husk.setHealth((float) val);
                    }
                }

                var damage = husk.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
                if (damage != null) {
                    double val = 3.0 * CONFIG.damageMultiplierForHusk() * CONFIG.damageMultiplierForAll();
                    if (damage.getBaseValue() != val) damage.setBaseValue(val);
                }

                var speed = husk.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.23 * CONFIG.speedMultiplierForHusk() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = husk.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForHusk() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (CodEntity cod : world.getEntitiesByType(EntityType.COD, entity -> true)) {

                var health = cod.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 3.0 * CONFIG.healthMultiplierForCod() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        cod.setHealth((float) val);
                    }
                }

                var speed = cod.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.7 * CONFIG.speedMultiplierForCod() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = cod.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForCod() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        final Map<UUID, Double> donkeyBaseHealthMap = new WeakHashMap<>();

        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (DonkeyEntity donkey : world.getEntitiesByType(EntityType.DONKEY, e -> true)) {
                UUID id = donkey.getUuid();
                Random random = donkey.getRandom();

                // Basis Health holen oder neu generieren
                double baseHealth = donkeyBaseHealthMap.computeIfAbsent(id, uuid -> 15.0 + random.nextInt(16));

                EntityAttributeInstance health = donkey.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double scaledHealth = baseHealth * CONFIG.healthMultiplierForDonkey() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != scaledHealth) {
                        health.setBaseValue(scaledHealth);
                        donkey.setHealth((float) Math.min(donkey.getHealth(), scaledHealth));
                    }
                }

                var speed = donkey.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.17499999701976776 * CONFIG.speedMultiplierForDonkey() * CONFIG.speedMultiplierForDonkey();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = donkey.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForDonkey() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (GlowSquidEntity glow_squid : world.getEntitiesByType(EntityType.GLOW_SQUID, entity -> true)) {

                var health = glow_squid.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 10.0 * CONFIG.healthMultiplierForGlowSquid() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        glow_squid.setHealth((float) val);
                    }
                }

                var speed = glow_squid.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.7 * CONFIG.speedMultiplierForGlowSquid() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = glow_squid.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForGlowSquid() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });

        final Map<UUID, Double> horseBaseHealthMap = new WeakHashMap<>();
        final Map<UUID, Double> horseBaseSpeedMap = new WeakHashMap<>();

        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (HorseEntity horse : world.getEntitiesByType(EntityType.HORSE, e -> true)) {
                UUID id = horse.getUuid();
                Random random = horse.getRandom();

                // Basis Health holen oder neu generieren
                double baseHealth = horseBaseHealthMap.computeIfAbsent(id, uuid -> 15.0 + random.nextInt(16));

                EntityAttributeInstance health = horse.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double scaledHealth = baseHealth * CONFIG.healthMultiplierForHorse() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != scaledHealth) {
                        health.setBaseValue(scaledHealth);
                        horse.setHealth((float) Math.min(horse.getHealth(), scaledHealth));
                    }
                }

                // Basis Speed holen oder neu generieren
                double baseSpeed = horseBaseSpeedMap.computeIfAbsent(id, uuid -> 0.1125 + (random.nextDouble() * (0.3375 - 0.1125)));

                EntityAttributeInstance speed = horse.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double scaledSpeed = baseSpeed * CONFIG.speedMultiplierForHorse() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != scaledSpeed) {
                        speed.setBaseValue(scaledSpeed);
                    }
                }

                var scale = horse.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForHorse() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        final Map<UUID, Double> LlamaBaseHealthMap = new WeakHashMap<>();

        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (LlamaEntity llama : world.getEntitiesByType(EntityType.LLAMA, e -> true)) {
                UUID id = llama.getUuid();
                Random random = llama.getRandom();

                // Basis Health holen oder neu generieren
                double baseHealth = LlamaBaseHealthMap.computeIfAbsent(id, uuid -> 15.0 + random.nextInt(16));

                EntityAttributeInstance health = llama.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double scaledHealth = baseHealth * CONFIG.healthMultiplierForLlama() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != scaledHealth) {
                        health.setBaseValue(scaledHealth);
                        llama.setHealth((float) Math.min(llama.getHealth(), scaledHealth));
                    }
                }

                var speed = llama.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.17499999701976776 * CONFIG.speedMultiplierForLlama() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = llama.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForLlama() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (MagmaCubeEntity magma_cube : world.getEntitiesByType(EntityType.MAGMA_CUBE, entity -> true)) {

                var scale = magma_cube.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForMagmaCube() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (MooshroomEntity mooshroom : world.getEntitiesByType(EntityType.MOOSHROOM, entity -> true)) {

                var health = mooshroom.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 10.0 * CONFIG.healthMultiplierForMooshroom() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        mooshroom.setHealth((float) val);
                    }
                }

                var speed = mooshroom.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.20000000298023224 * CONFIG.speedMultiplierForMooshroom() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = mooshroom.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForMooshroom() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        final Map<UUID, Double> muleBaseHealthMap = new WeakHashMap<>();

        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (MuleEntity mule : world.getEntitiesByType(EntityType.MULE, e -> true)) {
                UUID id = mule.getUuid();
                Random random = mule.getRandom();

                // Basis Health holen oder neu generieren
                double baseHealth = muleBaseHealthMap.computeIfAbsent(id, uuid -> 15.0 + random.nextInt(16));

                EntityAttributeInstance health = mule.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double scaledHealth = baseHealth * CONFIG.healthMultiplierForMule() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != scaledHealth) {
                        health.setBaseValue(scaledHealth);
                        mule.setHealth((float) Math.min(mule.getHealth(), scaledHealth));
                    }
                }

                var speed = mule.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.17499999701976776 * CONFIG.speedMultiplierForMule() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = mule.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForMule() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (PhantomEntity phantom : world.getEntitiesByType(EntityType.PHANTOM, entity -> true)) {

                var health = phantom.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 20.0 * CONFIG.healthMultiplierForPhantom() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        phantom.setHealth((float) val);
                    }
                }

                var damage = phantom.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
                if (damage != null) {
                    double val = 2.0 * CONFIG.damageMultiplierForPhantom() * CONFIG.damageMultiplierForAll();
                    if (damage.getBaseValue() != val) damage.setBaseValue(val);
                }

                var speed = phantom.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.7 * CONFIG.speedMultiplierForPhantom() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = phantom.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForPhantom() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (PufferfishEntity pufferfish : world.getEntitiesByType(EntityType.PUFFERFISH, entity -> true)) {

                var health = pufferfish.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 3.0 * CONFIG.healthMultiplierForPufferfish() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        pufferfish.setHealth((float) val);
                    }
                }

                var speed = pufferfish.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.7 * CONFIG.speedMultiplierForPufferfish() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = pufferfish.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForPufferfish() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (SalmonEntity salmon : world.getEntitiesByType(EntityType.SALMON, entity -> true)) {

                var health = salmon.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 3.0 * CONFIG.healthMultiplierForSalmon() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        salmon.setHealth((float) val);
                    }
                }

                var speed = salmon.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.7 * CONFIG.speedMultiplierForSalmon() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = salmon.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForSalmon() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (SkeletonEntity skeleton : world.getEntitiesByType(EntityType.SKELETON, entity -> true)) {

                var health = skeleton.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 20.0 * CONFIG.healthMultiplierForSkeleton() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        skeleton.setHealth((float) val);
                    }
                }

                var damage = skeleton.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
                if (damage != null) {
                    double val = 2.0 * CONFIG.damageMultiplierForSkeleton() * CONFIG.damageMultiplierForAll();
                    if (damage.getBaseValue() != val) damage.setBaseValue(val);
                }

                var speed = skeleton.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.25 * CONFIG.speedMultiplierForSkeleton() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = skeleton.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForSkeleton() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (SlimeEntity slime : world.getEntitiesByType(EntityType.SLIME, entity -> true)) {

                var scale = slime.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForSlime() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (StrayEntity stray : world.getEntitiesByType(EntityType.STRAY, entity -> true)) {

                var health = stray.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 20.0 * CONFIG.healthMultiplierForStray() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        stray.setHealth((float) val);
                    }
                }

                var damage = stray.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
                if (damage != null) {
                    double val = 2.0 * CONFIG.damageMultiplierForStray() * CONFIG.damageMultiplierForAll();
                    if (damage.getBaseValue() != val) damage.setBaseValue(val);
                }

                var speed = stray.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.25 * CONFIG.speedMultiplierForStray() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = stray.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForStray() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        final Map<UUID, Double> traderLlamaBaseHealthMap = new WeakHashMap<>();

        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (TraderLlamaEntity trader_llama : world.getEntitiesByType(EntityType.TRADER_LLAMA, e -> true)) {
                UUID id = trader_llama.getUuid();
                Random random = trader_llama.getRandom();

                // Basis Health holen oder neu generieren
                double baseHealth = traderLlamaBaseHealthMap.computeIfAbsent(id, uuid -> 15.0 + random.nextInt(16));

                EntityAttributeInstance health = trader_llama.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double scaledHealth = baseHealth * CONFIG.healthMultiplierForTraderLlama() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != scaledHealth) {
                        health.setBaseValue(scaledHealth);
                        trader_llama.setHealth((float) Math.min(trader_llama.getHealth(), scaledHealth));
                    }
                }

                var speed = trader_llama.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.17499999701976776 * CONFIG.speedMultiplierForTraderLlama() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = trader_llama.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForTraderLlama() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (TropicalFishEntity tropical_fish : world.getEntitiesByType(EntityType.TROPICAL_FISH, entity -> true)) {

                var health = tropical_fish.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 3.0 * CONFIG.healthMultiplierForTropicalFish() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        tropical_fish.setHealth((float) val);
                    }
                }

                var speed = tropical_fish.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.7 * CONFIG.speedMultiplierForTropicalFish() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = tropical_fish.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForTropicalFish() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (WanderingTraderEntity wandering_trader : world.getEntitiesByType(EntityType.WANDERING_TRADER, entity -> true)) {

                var health = wandering_trader.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 20.0 * CONFIG.healthMultiplierForWanderingTrader() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        wandering_trader.setHealth((float) val);
                    }
                }

                var speed = wandering_trader.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.7 * CONFIG.speedMultiplierForWanderingTrader() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = wandering_trader.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForWanderingTrader() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (WardenEntity warden : world.getEntitiesByType(EntityType.WARDEN, entity -> true)) {

                var health = warden.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 500.0 * CONFIG.healthMultiplierForWarden() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        warden.setHealth((float) val);
                    }
                }

                var damage = warden.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
                if (damage != null) {
                    double val = 30.0 * CONFIG.damageMultiplierForWarden() * CONFIG.damageMultiplierForAll();
                    if (damage.getBaseValue() != val) damage.setBaseValue(val);
                }

                var speed = warden.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.30000001192092896 * CONFIG.speedMultiplierForWarden() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = warden.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForWarden() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (WitherSkeletonEntity wither_skeleton : world.getEntitiesByType(EntityType.WITHER_SKELETON, entity -> true)) {

                var health = wither_skeleton.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 20.0 * CONFIG.healthMultiplierForWitherSkeleton() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        wither_skeleton.setHealth((float) val);
                    }
                }

                var damage = wither_skeleton.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
                if (damage != null) {
                    double val = 8.0 * CONFIG.damageMultiplierForWitherSkeleton() * CONFIG.damageMultiplierForAll();
                    if (damage.getBaseValue() != val) damage.setBaseValue(val);
                }

                var speed = wither_skeleton.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.25 * CONFIG.speedMultiplierForWitherSkeleton() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = wither_skeleton.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForWitherSkeleton() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });


        ServerTickEvents.END_WORLD_TICK.register(world -> {
            for (ZombieVillagerEntity zombie_villager : world.getEntitiesByType(EntityType.ZOMBIE_VILLAGER, entity -> true)) {

                var health = zombie_villager.getAttributeInstance(Updater.GENERIC_MAX_HEALTH);
                if (health != null) {
                    double val = 20.0 * CONFIG.healthMultiplierForZombieVillager() * CONFIG.healthMultiplierForAll();
                    if (health.getBaseValue() != val) {
                        health.setBaseValue(val);
                        zombie_villager.setHealth((float) val);
                    }
                }

                var damage = zombie_villager.getAttributeInstance(Updater.GENERIC_ATTACK_DAMAGE);
                if (damage != null) {
                    double val = 3.0 * CONFIG.damageMultiplierForZombieVillager() * CONFIG.damageMultiplierForAll();
                    if (damage.getBaseValue() != val) damage.setBaseValue(val);
                }

                var speed = zombie_villager.getAttributeInstance(Updater.GENERIC_MOVEMENT_SPEED);
                if (speed != null) {
                    double val = 0.23000000417232513 * CONFIG.speedMultiplierForZombieVillager() * CONFIG.speedMultiplierForAll();
                    if (speed.getBaseValue() != val) speed.setBaseValue(val);
                }

                var scale = zombie_villager.getAttributeInstance(Updater.GENERIC_SCALE);
                if (scale != null) {
                    double val = 1.0 * CONFIG.scaleMultiplierForZombieVillager() * CONFIG.scaleMultiplierForAll();
                    if (scale.getBaseValue() != val) scale.setBaseValue(val);
                }
            }
        });
    }
}
