package com.name.elementals.util;

import com.name.elementals.Elementals;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> WATER_PLANTS = createTag("water_plants");
        public static final TagKey<Item> INK_SACS = createTag("ink_sacs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Elementals.MOD_ID, name));
        }
    }

    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Elementals.MOD_ID, name));
        }
    }
}
