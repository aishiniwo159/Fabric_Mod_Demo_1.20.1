package asia.a951;

import asia.a951.registry.ModItemGroup;
import asia.a951.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoMod159 implements ModInitializer {
	public static final String MOD_ID = "demomod159";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
		// 1. 在主类中定义物品
	@Override
	public void onInitialize() {
			// This code runs as soon as Minecraft is in a mod-load-ready state.
			// However, some things (like resources) may still be uninitialized.
			// Proceed with mild caution.
			//-----------------------------------------------------------------------------------------------------

			LOGGER.info("Loding VCX's Mod!");
			ModItemGroup.registerGroups();
			ModItems.registerItems();
		}
}