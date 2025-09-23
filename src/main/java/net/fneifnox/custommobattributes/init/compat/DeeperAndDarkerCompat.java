package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class DeeperAndDarkerCompat {

    public static void initDeeperAndDarkerAttributeHandlers() {
        EntityType anglerFish = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "angler_fish"));
        EntityType sculkCentipede = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "sculk_centipede"));
        EntityType sculkLeech = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "sculk_leech"));
        EntityType sculkSnapper = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "sculk_snapper"));
        EntityType shattered = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "shattered"));
        EntityType shriekWorm = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "shriek_worm"));
        EntityType sludge = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "sludge"));
        EntityType stalker = Registries.ENTITY_TYPE.get(Identifier.of("deeperdarker", "stalker"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(anglerFish, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, anglerFish, CONFIG.deeperAndDarker::healthMultiplierForAnglerFish, CONFIG.deeperAndDarker::damageMultiplierForAnglerFish, CONFIG.deeperAndDarker::speedMultiplierForAnglerFish, CONFIG.deeperAndDarker::scaleMultiplierForAnglerFish
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkCentipede, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, sculkCentipede, CONFIG.deeperAndDarker::healthMultiplierForSculkCentipede, CONFIG.deeperAndDarker::damageMultiplierForSculkCentipede, CONFIG.deeperAndDarker::speedMultiplierForSculkCentipede, CONFIG.deeperAndDarker::scaleMultiplierForSculkCentipede
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkLeech, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, sculkLeech, CONFIG.deeperAndDarker::healthMultiplierForSculkLeech, CONFIG.deeperAndDarker::damageMultiplierForSculkLeech, CONFIG.deeperAndDarker::speedMultiplierForSculkLeech, CONFIG.deeperAndDarker::scaleMultiplierForSculkLeech
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sculkSnapper, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, sculkSnapper, CONFIG.deeperAndDarker::healthMultiplierForSculkSnapper, CONFIG.deeperAndDarker::damageMultiplierForSculkSnapper, CONFIG.deeperAndDarker::speedMultiplierForSculkSnapper, CONFIG.deeperAndDarker::scaleMultiplierForSculkSnapper
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shattered, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, shattered, CONFIG.deeperAndDarker::healthMultiplierForShattered, CONFIG.deeperAndDarker::damageMultiplierForShattered, CONFIG.deeperAndDarker::speedMultiplierForShattered, CONFIG.deeperAndDarker::scaleMultiplierForShattered
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(shriekWorm, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, shriekWorm, CONFIG.deeperAndDarker::healthMultiplierForShriekWorm, CONFIG.deeperAndDarker::damageMultiplierForShriekWorm, null, CONFIG.deeperAndDarker::scaleMultiplierForShriekWorm
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sludge, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, sludge, CONFIG.deeperAndDarker::healthMultiplierForSludge, CONFIG.deeperAndDarker::damageMultiplierForSludge, CONFIG.deeperAndDarker::speedMultiplierForSludge, CONFIG.deeperAndDarker::scaleMultiplierForSludge
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(stalker, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, stalker, CONFIG.deeperAndDarker::healthMultiplierForStalker, CONFIG.deeperAndDarker::damageMultiplierForStalker, CONFIG.deeperAndDarker::speedMultiplierForStalker, CONFIG.deeperAndDarker::scaleMultiplierForStalker
            );
        });
    }
}
