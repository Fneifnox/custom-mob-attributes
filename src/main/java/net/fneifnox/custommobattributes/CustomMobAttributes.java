package net.fneifnox.custommobattributes;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fneifnox.custommobattributes.config.Config.*;

@Mod(CustomMobAttributes.MOD_ID)
@Mod.EventBusSubscriber(modid = CustomMobAttributes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CustomMobAttributes {
	public static final String MOD_ID = "custom_mob_attributes";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public CustomMobAttributes(FMLJavaModLoadingContext context) {
		context.registerConfig(ModConfig.Type.SERVER, CONFIG);

		AttributeUpdater.register();

		ATTRIBUTES.register(context.getModEventBus());
	}

	private static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(ForgeRegistries.Keys.ATTRIBUTES, MOD_ID);

	public static final RegistryObject<Attribute> SCALE = ATTRIBUTES.register("scale", () -> new RangedAttribute("scale", 1.0, 0.0625, 16.0).setSyncable(true));
}