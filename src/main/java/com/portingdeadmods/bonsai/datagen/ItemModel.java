package com.portingdeadmods.bonsai.datagen;

import com.portingdeadmods.bonsai.Bonsai;
import com.portingdeadmods.bonsai.Item.Items;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ItemModel extends ItemModelProvider {


    public ItemModel(PackOutput packOutput, String modid, ExistingFileHelper existingFileHelper) {
        super(packOutput,modid,existingFileHelper);
    }

    @Override
    protected void registerModels() {

        this.item(Items.OAK_BONSAI_SEEDS);
        this.item(Items.SPRUCE_BONSAI_SEEDS);
        this.item(Items.ACACIA_BONSAI_SEEDS);
        this.item(Items.BIRCH_BONSAI_SEEDS);
        this.item(Items.DARKOAK_BONSAI_SEEDS);
        this.item(Items.JUNGLE_BONSAI_SEEDS);

        this.item(Items.OAK_BONSAI_CLIPPINGS);
        this.item(Items.SPRUCE_BONSAI_CLIPPINGS);
        this.item(Items.ACACIA_BONSAI_CLIPPINGS);
        this.item(Items.BIRCH_BONSAI_CLIPPINGS);
        this.item(Items.DARKOAK_BONSAI_CLIPPINGS);
        this.item(Items.JUNGLE_BONSAI_CLIPPINGS);
    }
    private ItemModelBuilder item(DeferredItem<Item> item){
        return basicItem(item.get());
    }
}
