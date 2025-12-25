package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class BetterNetherCompat {

    public static void initBetterNetherAttributeHandlers() {
        EntityType firefly = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "firefly"));
        EntityType flyingPig = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "flying_pig"));
        EntityType hydrogenJellyfish = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "hydrogen_jellyfish"));
        EntityType jungleSkeleton = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "jungle_skeleton"));
        EntityType naga = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "naga"));
        EntityType skull = Registries.ENTITY_TYPE.get(Identifier.of("betternether", "skull"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(firefly, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterNether::healthMultiplierForFirefly, CONFIG.betterNether::damageMultiplierForFirefly, null, CONFIG.betterNether::scaleMultiplierForFirefly
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(flyingPig, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterNether::healthMultiplierForFlyingPig, CONFIG.betterNether::damageMultiplierForFlyingPig, CONFIG.betterNether::speedMultiplierForFlyingPig, CONFIG.betterNether::scaleMultiplierForFlyingPig
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(hydrogenJellyfish, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterNether::healthMultiplierForHydrogenJellyfish, CONFIG.betterNether::damageMultiplierForHydrogenJellyfish, null, CONFIG.betterNether::scaleMultiplierForHydrogenJellyfish
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(jungleSkeleton, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterNether::healthMultiplierForJungleSkeleton, CONFIG.betterNether::damageMultiplierForJungleSkeleton, CONFIG.betterNether::speedMultiplierForJungleSkeleton, CONFIG.betterNether::scaleMultiplierForJungleSkeleton
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(naga, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterNether::healthMultiplierForNaga, CONFIG.betterNether::damageMultiplierForNaga, CONFIG.betterNether::speedMultiplierForNaga, CONFIG.betterNether::scaleMultiplierForNaga
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(skull, entity -> {
            AttributeUpdater.configureEntityAttributes(entity.getEntityWorld(), entity, CONFIG.betterNether::healthMultiplierForSkull, CONFIG.betterNether::damageMultiplierForSkull, null, CONFIG.betterNether::scaleMultiplierForSkull
            );
        });
    }
}
