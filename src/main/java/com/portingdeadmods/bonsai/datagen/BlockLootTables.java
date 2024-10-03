package com.portingdeadmods.bonsai.datagen;

import com.portingdeadmods.bonsai.Block.Blocks;
import com.portingdeadmods.bonsai.Block.BonsaiCropBlock;
import com.portingdeadmods.bonsai.Item.Items;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.Collections;
import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {
    private final Set<Block> knownBlocks = new ReferenceOpenHashSet<>();
    public BlockLootTables(HolderLookup.Provider provider){
        super(Collections.emptySet(), FeatureFlags.VANILLA_SET, provider);
    }

    @Override
    protected void generate() {
        makeBonsaiLootTable(Blocks.OAK_BONSAI_CROP_BLOCK, Items.OAK_BONSAI_SEEDS, Items.OAK_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.ACACIA_BONSAI_CROP_BLOCK, Items.ACACIA_BONSAI_SEEDS, Items.ACACIA_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.BIRCH_BONSAI_CROP_BLOCK, Items.BIRCH_BONSAI_SEEDS, Items.BIRCH_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.JUNGLE_BONSAI_CROP_BLOCK, Items.JUNGLE_BONSAI_SEEDS, Items.JUNGLE_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.SPRUCE_BONSAI_CROP_BLOCK, Items.SPRUCE_BONSAI_SEEDS, Items.SPRUCE_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.DARK_OAK_BONSAI_CROP_BLOCK, Items.DARKOAK_BONSAI_SEEDS,Items.DARKOAK_BONSAI_CLIPPINGS);

    }
    private void makeBonsaiLootTable(DeferredBlock<Block> block, DeferredItem<Item> seed, DeferredItem<Item> flower){
        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(block.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BonsaiCropBlock.AGE,7));
        this.add(block.get(), createCropDrops(block.get(),flower.get(), seed.get(),lootItemConditionBuilder));
        knownBlocks.add(block.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }
}
