package com.name.elementals;

import com.name.elementals.item.ModItemGroups;
import com.name.elementals.item.ModItems;
import com.name.elementals.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elementals implements ModInitializer {
	public static final String MOD_ID = "elementals";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModLootTableModifiers.modifyLootTables();
	}
}