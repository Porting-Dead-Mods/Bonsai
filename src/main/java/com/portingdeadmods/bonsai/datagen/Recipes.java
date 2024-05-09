package com.portingdeadmods.bonsai.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider implements IConditionBuilder {
    public Recipes(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        BonsaiRecipe(Items.OAK_PLANKS, com.portingdeadmods.bonsai.Item.Items.OAK_BONSAI_CLIPPINGS, consumer);
        BonsaiRecipe(Items.ACACIA_PLANKS, com.portingdeadmods.bonsai.Item.Items.ACACIA_BONSAI_CLIPPINGS, consumer);
        BonsaiRecipe(Items.SPRUCE_PLANKS, com.portingdeadmods.bonsai.Item.Items.SPRUCE_BONSAI_CLIPPINGS, consumer);
        BonsaiRecipe(Items.DARK_OAK_PLANKS, com.portingdeadmods.bonsai.Item.Items.DARK_OAK_BONSAI_CLIPPINGS, consumer);
        BonsaiRecipe(Items.JUNGLE_PLANKS, com.portingdeadmods.bonsai.Item.Items.JUNGLE_BONSAI_CLIPPINGS, consumer);
        BonsaiRecipe(Items.BIRCH_PLANKS, com.portingdeadmods.bonsai.Item.Items.BIRCH_BONSAI_CLIPPINGS, consumer);

        BonsaiSeedRecipe(com.portingdeadmods.bonsai.Item.Items.OAK_BONSAI_SEEDS, Items.OAK_SAPLING, consumer);
        BonsaiSeedRecipe(com.portingdeadmods.bonsai.Item.Items.ACACIA_BONSAI_SEEDS, Items.ACACIA_SAPLING, consumer);
        BonsaiSeedRecipe(com.portingdeadmods.bonsai.Item.Items.SPRUCE_BONSAI_SEEDS, Items.SPRUCE_SAPLING, consumer);
        BonsaiSeedRecipe(com.portingdeadmods.bonsai.Item.Items.DARK_OAK_BONSAI_SEEDS,Items.DARK_OAK_SAPLING, consumer);
        BonsaiSeedRecipe(com.portingdeadmods.bonsai.Item.Items.JUNGLE_BONSAI_SEEDS, Items.JUNGLE_SAPLING,consumer);
        BonsaiSeedRecipe(com.portingdeadmods.bonsai.Item.Items.BIRCH_BONSAI_SEEDS,Items.BIRCH_SAPLING,consumer);
    }
    private void BonsaiRecipe(Item plank,RegistryObject<Item> clippings, Consumer<FinishedRecipe> consumer){
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, plank)
                .pattern("CC").pattern("CC")
                .define('C', clippings.get())
                .unlockedBy(getHasName(clippings.get()), has(clippings.get())).save(consumer);
    }
    private void BonsaiSeedRecipe(RegistryObject<Item> bonsaiSeed, Item sapling, Consumer<FinishedRecipe> consumer){
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, bonsaiSeed.get())
                .requires(Items.WHEAT_SEEDS).requires(sapling).unlockedBy(getHasName(sapling), has(sapling)).save(consumer);
    }
}
