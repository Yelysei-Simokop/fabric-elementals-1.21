package com.name.elementals.item;

import com.name.elementals.Elementals;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ELEMENTALS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Elementals.MOD_ID, "elementals_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.OMINOUS_FIRE_TRIAL_KEY))
                    .displayName(Text.translatable("itemgroup.elementals.elemetnals_items"))
                    .entries((displayContext, entries) -> {
                        //Weapon Materials
                        entries.add(ModItems.LEFT_TRIDENT_TOOTH);
                        entries.add(ModItems.MIDDLE_TRIDENT_TOOTH);
                        entries.add(ModItems.RIGHT_TRIDENT_TOOTH);
                        //Rods
                        entries.add(ModItems.SOUL_BLAZE_ROD);
                        entries.add(ModItems.TORRENT_ROD);
                        entries.add(ModItems.CLOD_ROD);
                        entries.add(ModItems.BLOOM_ROD);
                        entries.add(ModItems.NULL_ROD);
                        entries.add(ModItems.ECHO_ROD);
                        entries.add(ModItems.BLITZ_ROD);
                        entries.add(ModItems.FREEZE_ROD);
                        //Powders
                        entries.add(ModItems.SOUL_FIRE_POWDER);
                        entries.add(ModItems.WIND_POWDER);
                        entries.add(ModItems.WATER_POWDER);
                        entries.add(ModItems.EARTH_POWDER);
                        entries.add(ModItems.FLORAL_POWDER);
                        entries.add(ModItems.VOID_POWDER);
                        entries.add(ModItems.SCULK_POWDER);
                        entries.add(ModItems.LIGHTNING_POWDER);
                        entries.add(ModItems.FROST_POWDER);
                        //Charges
                        entries.add(ModItems.SOUL_FIRE_CHARGE);
                        entries.add(ModItems.WATER_CHARGE);
                        entries.add(ModItems.EARTH_CHARGE);
                        entries.add(ModItems.FLORAL_CHARGE);
                        entries.add(ModItems.VOID_CHARGE);
                        entries.add(ModItems.SCULK_CHARGE);
                        entries.add(ModItems.LIGHTNING_CHARGE);
                        entries.add(ModItems.FROST_CHARGE);
                        //Trial and Ominous Trial Keys
                        entries.add(ModItems.FIRE_TRIAL_KEY);
                        entries.add(ModItems.SOUL_FIRE_TRIAL_KEY);
                        entries.add(ModItems.WIND_TRIAL_KEY);
                        entries.add(ModItems.WATER_TRIAL_KEY);
                        entries.add(ModItems.EARTH_TRIAL_KEY);
                        entries.add(ModItems.FLORAL_TRIAL_KEY);
                        entries.add(ModItems.VOID_TRIAL_KEY);
                        entries.add(ModItems.SCULK_TRIAL_KEY);
                        entries.add(ModItems.LIGHTNING_TRIAL_KEY);
                        entries.add(ModItems.FROST_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_FIRE_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_SOUL_FIRE_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_WIND_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_WATER_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_EARTH_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_FLORAL_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_VOID_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_SCULK_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_LIGHTNING_TRIAL_KEY);
                        entries.add(ModItems.OMINOUS_FROST_TRIAL_KEY);
                    }).build());

    public static void registerItemGroups() {
        Elementals.LOGGER.info("Registering Item Groups for " + Elementals.MOD_ID);
    }
}
