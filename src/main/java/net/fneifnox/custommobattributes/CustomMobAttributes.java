package net.fneifnox.custommobattributes;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.registry.Registry;

import static net.fneifnox.custommobattributes.config.Config.*;

@Mod(CustomMobAttributes.MOD_ID)
@Mod.EventBusSubscriber(modid = CustomMobAttributes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CustomMobAttributes {
	public static final String MOD_ID = "custom_mob_attributes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public CustomMobAttributes(FMLJavaModLoadingContext context) {
		context.registerConfig(ModConfig.Type.SERVER, CONFIG);

		AttributeUpdater.register();
	}

	public static final Attribute SCALE = registerAttribute("scale", 1.0, 0.0625, 16.0);

	private static Attribute registerAttribute(final String name, double base, double min, double max) {
		return new RangedAttribute("attribute." + MOD_ID + '.' + name, base, min, max);
	}
}