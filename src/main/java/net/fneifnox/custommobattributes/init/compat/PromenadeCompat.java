package net.fneifnox.custommobattributes.init.compat;

import net.fneifnox.custommobattributes.AttributeUpdater;
import net.minecraft.entity.EntityType;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

public class PromenadeCompat {

    public static void initPromenadeAttributeHandlers() {
        EntityType capybara = Registries.ENTITY_TYPE.get(Identifier.of("promenade", "capybara"));
        EntityType duck = Registries.ENTITY_TYPE.get(Identifier.of("promenade", "duck"));
        EntityType lushCreeper = Registries.ENTITY_TYPE.get(Identifier.of("promenade", "lush_creeper"));
        EntityType sunken = Registries.ENTITY_TYPE.get(Identifier.of("promenade", "sunken"));

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(capybara, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, capybara, CONFIG.promenade::healthMultiplierForCapybara, CONFIG.promenade::damageMultiplierForCapybara, CONFIG.promenade::speedMultiplierForCapybara, CONFIG.promenade::scaleMultiplierForCapybara
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(duck, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, duck, CONFIG.promenade::healthMultiplierForDuck, CONFIG.promenade::damageMultiplierForDuck, CONFIG.promenade::speedMultiplierForDuck, CONFIG.promenade::scaleMultiplierForDuck
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(lushCreeper, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, lushCreeper, CONFIG.promenade::healthMultiplierForLushCreeper, CONFIG.promenade::damageMultiplierForLushCreeper, CONFIG.promenade::speedMultiplierForLushCreeper, CONFIG.promenade::scaleMultiplierForLushCreeper
            );
        });

        AttributeUpdater.ATTRIBUTE_HANDLERS.put(sunken, entity -> {
            World world = entity.getWorld();
            AttributeUpdater.configureEntityAttributes(world, sunken, CONFIG.promenade::healthMultiplierForSunken, CONFIG.promenade::damageMultiplierForSunken, CONFIG.promenade::speedMultiplierForSunken, CONFIG.promenade::scaleMultiplierForSunken
            );
        });
    }
}
