package net.stickmanm.axontechnologies.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModLootTableModifiers {
    private static final Identifier ARCHAEOLOGY_DESERT_TEMPLE_ID =
            new Identifier("minecraft", "archaeology/desert_pyramid");

    private static final Identifier ARCHAEOLOGY_TRAIL_RUINS_ID =
            new Identifier("minecraft", "archaeology/trail_ruins_common");

    private static final Identifier ARCHAEOLOGY_TRAIL_RUINS_RARE_ID =
            new Identifier("minecraft", "archaeology/trail_ruins_rare");

    private static final Identifier DESERT_TEMPLE_ID =
            new Identifier("minecraft", "chests/desert_pyramid");

    private static final Identifier ANCIENT_CITY_ID =
            new Identifier("minecraft", "chests/ancient_city");

    private static final Identifier END_CITY_ID =
            new Identifier("minecraft", "chests/end_city_treasure");

    private static final Identifier BURIED_TREASURE_ID =
            new Identifier("minecraft", "chests/buried_treasure");



    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {


            if(DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModBlocks.THUNDERED_SAPLING.asItem()))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(DESERT_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUADRUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUADRUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.5f)).build());

                tableBuilder.pool(poolBuilder.build());

            }

            if(ANCIENT_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUATTUORDECUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUADRUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.5f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUATTUORDECUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUINTUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUINTUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.001f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.QUATTUORDECUPLE_COMPRESSED_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(BURIED_TREASURE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModBlocks.THUNDERED_SAPLING.asItem()))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }



        });

        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {

            if(ARCHAEOLOGY_DESERT_TEMPLE_ID.equals(id)){
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModBlocks.THUNDERED_SAPLING).build());
                entries.add(ItemEntry.builder(ModItems.QUADRUPLE_COMPRESSED_STICK).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }

            if(ARCHAEOLOGY_TRAIL_RUINS_ID.equals(id)){
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModBlocks.THUNDERED_SAPLING).build());
                entries.add(ItemEntry.builder(ModItems.QUADRUPLE_COMPRESSED_STICK).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }

            if(ARCHAEOLOGY_TRAIL_RUINS_RARE_ID.equals(id)){
                List<LootPoolEntry> entries = new ArrayList<>(Arrays.asList(original.pools[0].entries));
                entries.add(ItemEntry.builder(ModBlocks.THUNDERED_SAPLING).build());
                entries.add(ItemEntry.builder(ModItems.QUADRUPLE_COMPRESSED_STICK).build());
                entries.add(ItemEntry.builder(ModItems.QUINTUPLE_COMPRESSED_STICK).build());
                entries.add(ItemEntry.builder(ModItems.QUATTUORDECUPLE_COMPRESSED_STICK).build());

                LootPool.Builder pool = LootPool.builder().with(entries);
                return LootTable.builder().pool(pool).build();
            }


            return null;
        });
    }
}
