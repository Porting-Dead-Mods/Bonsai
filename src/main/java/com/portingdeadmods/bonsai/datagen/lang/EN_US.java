package com.portingdeadmods.bonsai.datagen.lang;

import com.portingdeadmods.bonsai.Item.Items;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class EN_US extends LanguageProvider {
    public EN_US(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(Items.OAK_BONSAI_CLIPPINGS, "Oak Bonsai Clippings");
        add(Items.OAK_BONSAI_SEEDS, "Oak Bonsai Seeds");
        add(Items.DARK_OAK_BONSAI_CLIPPINGS, "Dark Oak Bonsai Clippings");
        add(Items.DARK_OAK_BONSAI_SEEDS, "Dark Oak Bonsai Seeds");
        add(Items.BIRCH_BONSAI_CLIPPINGS, "Birch Bonsai Clippings");
        add(Items.BIRCH_BONSAI_SEEDS, "Birch Bonsai Seeds");
        add(Items.SPRUCE_BONSAI_CLIPPINGS, "Spruce Bonsai Clippings");
        add(Items.SPRUCE_BONSAI_SEEDS, "Spruce Bonsai Seeds");
        add(Items.JUNGLE_BONSAI_CLIPPINGS, "Jungle Bonsai Clippings");
        add(Items.JUNGLE_BONSAI_SEEDS, "Jungle Bonsai Seeds");
        add(Items.ACACIA_BONSAI_CLIPPINGS, "Acacia Bonsai Clippings");
        add(Items.ACACIA_BONSAI_SEEDS, "Acacia Bonsai Seeds");
        add("item_group_bonsai", "Bonsai");

    }
    private void add(RegistryObject<Item> item, String translation){
        add(item.get(), translation);
    }
}
