package com.portingdeadmods.bonsai.datagen;

import com.portingdeadmods.bonsai.Bonsai;
import com.portingdeadmods.bonsai.Item.Items;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModel extends ItemModelProvider {
    public ItemModel(PackOutput output, String modid, ExistingFileHelper fileHelper){
        super(output, modid, fileHelper);
    }

    @Override
    protected void registerModels() {
        // this.
        this.item(Items.OAK_BONSAI_SEEDS);
        this.item(Items.SPRUCE_BONSAI_SEEDS);
        this.item(Items.ACACIA_BONSAI_SEEDS);
        this.item(Items.BIRCH_BONSAI_SEEDS);
        this.item(Items.DARK_OAK_BONSAI_SEEDS, "darkoak_bonsai_seeds");
        this.item(Items.JUNGLE_BONSAI_SEEDS);

        this.item(Items.OAK_BONSAI_CLIPPINGS);
        this.item(Items.SPRUCE_BONSAI_CLIPPINGS);
        this.item(Items.ACACIA_BONSAI_CLIPPINGS);
        this.item(Items.BIRCH_BONSAI_CLIPPINGS);
        this.item(Items.DARK_OAK_BONSAI_CLIPPINGS, "darkoak_bonsai_clippings");
        this.item(Items.JUNGLE_BONSAI_CLIPPINGS);
    }
    private ItemModelBuilder item(RegistryObject<Item> item){
        return item(item, item.getId().getPath());
    }
    private ItemModelBuilder item(RegistryObject<Item> item, String textureName){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Bonsai.MODID, "item/" + textureName));
    }
}
