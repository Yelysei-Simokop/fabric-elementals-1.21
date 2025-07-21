package com.name.elementals.item;

import com.name.elementals.Elementals;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //technically adds the item to minecraft

    //Weapon Materials
    public static final Item LEFT_TRIDENT_TOOTH = registerItem("left_trident_tooth", new Item(new Item.Settings()));
    public static final Item MIDDLE_TRIDENT_TOOTH = registerItem("middle_trident_tooth", new Item(new Item.Settings()));
    public static final Item RIGHT_TRIDENT_TOOTH = registerItem("right_trident_tooth", new Item(new Item.Settings()));
    //Rods
    public static final Item SOUL_BLAZE_ROD = registerItem("soul_blaze_rod", new Item(new Item.Settings()));
    public static final Item TORRENT_ROD = registerItem("torrent_rod", new Item(new Item.Settings()));
    public static final Item CLOD_ROD = registerItem("clod_rod", new Item(new Item.Settings()));
    public static final Item BLOOM_ROD = registerItem("bloom_rod", new Item(new Item.Settings()));
    public static final Item NULL_ROD = registerItem("null_rod", new Item(new Item.Settings()));
    public static final Item ECHO_ROD = registerItem("echo_rod", new Item(new Item.Settings()));
    public static final Item BLITZ_ROD = registerItem("blitz_rod", new Item(new Item.Settings()));
    public static final Item FREEZE_ROD = registerItem("freeze_rod", new Item(new Item.Settings()));
    //Powders
    public static final Item SOUL_FIRE_POWDER = registerItem("soul_fire_powder", new Item(new Item.Settings()));
    public static final Item WIND_POWDER = registerItem("wind_powder", new Item(new Item.Settings()));
    public static final Item WATER_POWDER = registerItem("water_powder", new Item(new Item.Settings()));
    public static final Item EARTH_POWDER = registerItem("earth_powder", new Item(new Item.Settings()));
    public static final Item FLORAL_POWDER = registerItem("floral_powder", new Item(new Item.Settings()));
    public static final Item VOID_POWDER = registerItem("void_powder", new Item(new Item.Settings()));
    public static final Item SCULK_POWDER = registerItem("sculk_powder", new Item(new Item.Settings()));
    public static final Item LIGHTNING_POWDER = registerItem("lightning_powder", new Item(new Item.Settings()));
    public static final Item FROST_POWDER = registerItem("frost_powder", new Item(new Item.Settings()));
    //Trial and Ominous Trial Keys
    public static final Item FIRE_TRIAL_KEY = registerItem("fire_trial_key", new Item(new Item.Settings()));
    public static final Item SOUL_FIRE_TRIAL_KEY = registerItem("soul_fire_trial_key", new Item(new Item.Settings()));
    public static final Item WIND_TRIAL_KEY = registerItem("wind_trial_key", new Item(new Item.Settings()));
    public static final Item WATER_TRIAL_KEY = registerItem("water_trial_key", new Item(new Item.Settings()));
    public static final Item EARTH_TRIAL_KEY = registerItem("earth_trial_key", new Item(new Item.Settings()));
    public static final Item FLORAL_TRIAL_KEY = registerItem("floral_trial_key", new Item(new Item.Settings()));
    public static final Item VOID_TRIAL_KEY = registerItem("void_trial_key", new Item(new Item.Settings()));
    public static final Item SCULK_TRIAL_KEY = registerItem("sculk_trial_key", new Item(new Item.Settings()));
    public static final Item LIGHTNING_TRIAL_KEY = registerItem("lightning_trial_key", new Item(new Item.Settings()));
    public static final Item FROST_TRIAL_KEY = registerItem("frost_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_FIRE_TRIAL_KEY = registerItem("ominous_fire_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_SOUL_FIRE_TRIAL_KEY = registerItem("ominous_soul_fire_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_WIND_TRIAL_KEY = registerItem("ominous_wind_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_WATER_TRIAL_KEY = registerItem("ominous_water_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_EARTH_TRIAL_KEY = registerItem("ominous_earth_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_FLORAL_TRIAL_KEY = registerItem("ominous_floral_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_VOID_TRIAL_KEY = registerItem("ominous_void_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_SCULK_TRIAL_KEY = registerItem("ominous_sculk_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_LIGHTNING_TRIAL_KEY = registerItem("ominous_lightning_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_FROST_TRIAL_KEY = registerItem("ominous_frost_trial_key", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Elementals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elementals.LOGGER.info("Registering Mod Items for " + Elementals.MOD_ID);

        //Adds the item to the INGERDIENTS creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {




        });
    }
}
