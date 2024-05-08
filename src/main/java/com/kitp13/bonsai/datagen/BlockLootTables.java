package com.kitp13.bonsai.datagen;

import com.kitp13.bonsai.Block.Blocks;
import com.kitp13.bonsai.Block.BonsaiCropBlock;
import com.kitp13.bonsai.Block.OakBonsaiCropBlock;
import com.kitp13.bonsai.Item.Items;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.regex.qual.Regex;

import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {
    public BlockLootTables(){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        makeBonsaiLootTable(Blocks.OAK_BONSAI_CROP_BLOCK, Items.OAK_BONSAI_SEEDS, Items.OAK_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.ACACIA_BONSAI_CROP_BLOCK, Items.ACACIA_BONSAI_SEEDS, Items.ACACIA_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.BIRCH_BONSAI_CROP_BLOCK, Items.BIRCH_BONSAI_SEEDS, Items.BIRCH_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.JUNGLE_BONSAI_CROP_BLOCK, Items.JUNGLE_BONSAI_SEEDS, Items.JUNGLE_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.SPRUCE_BONSAI_CROP_BLOCK, Items.SPRUCE_BONSAI_SEEDS, Items.SPRUCE_BONSAI_CLIPPINGS);
        makeBonsaiLootTable(Blocks.DARK_OAK_BONSAI_CROP_BLOCK, Items.DARK_OAK_BONSAI_SEEDS,Items.DARK_OAK_BONSAI_CLIPPINGS);

    }
    private void makeBonsaiLootTable(RegistryObject<Block> block, RegistryObject<Item> seed, RegistryObject<Item> flower){
        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(block.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BonsaiCropBlock.AGE,7));
        this.add(block.get(), createCropDrops(block.get(),flower.get(), seed.get(),lootItemConditionBuilder));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Blocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
