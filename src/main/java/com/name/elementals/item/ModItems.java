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
    public static final Item SOUL_BLAZE_ROD = registerItem("soul_blaze_rod", new Item(new Item.Settings()));
    public static final Item BLOOM_ROD = registerItem("bloom_rod", new Item(new Item.Settings()));
    public static final Item NULL_ROD = registerItem("null_rod", new Item(new Item.Settings()));
    public static final Item TORRENT_ROD = registerItem("torrent_rod", new Item(new Item.Settings()));
    public static final Item ECHO_ROD = registerItem("echo_rod", new Item(new Item.Settings()));
    public static final Item BLITZ_ROD = registerItem("blitz_rod", new Item(new Item.Settings()));
    public static final Item CLOD_ROD = registerItem("clod_rod", new Item(new Item.Settings()));
    public static final Item FREEZE_ROD = registerItem("freeze_rod", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Elementals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Elementals.LOGGER.info("Registering Mod Items for " + Elementals.MOD_ID);

        //Adds the item to the INGERDIENTS creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                entries.add(SOUL_BLAZE_ROD);
                entries.add(BLOOM_ROD);
                entries.add(NULL_ROD);
                entries.add(TORRENT_ROD);
                entries.add(ECHO_ROD);
                entries.add(BLITZ_ROD);
                entries.add(CLOD_ROD);
                entries.add(FREEZE_ROD);
        });
    }
}
