package asia.a951;

import asia.a951.registry.ModItemGroup;
import asia.a951.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemConvertible;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoMod159 implements ModInitializer {
	public static final String MOD_ID = "demomod159";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("VCX!启动!");
		ModItemGroup.registerGroups();
		ModItems.registerItems();
	}
}