package com.name.elementals.util;

import com.name.elementals.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier ELDER_GUARDIAN_ID
            = Identifier.of("minecraft","entities/elder_guardian");

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            if (ELDER_GUARDIAN_ID.equals(key.getValue())) {
                LootPool.Builder TridentTeethBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModItems.LEFT_TRIDENT_TOOTH))
                        .with(ItemEntry.builder(ModItems.MIDDLE_TRIDENT_TOOTH))
                        .with(ItemEntry.builder(ModItems.RIGHT_TRIDENT_TOOTH));

                tableBuilder.pool(TridentTeethBuilder.build());
            }
        });
    }
}