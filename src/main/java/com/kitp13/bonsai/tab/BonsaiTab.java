package com.kitp13.bonsai.tab;

import com.kitp13.bonsai.Bonsai;
import com.kitp13.bonsai.Item.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class BonsaiTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bonsai.MODID);
    public static RegistryObject<CreativeModeTab> BONSAI_TAB = TABS.register("bonsai_tab", () ->
            CreativeModeTab.builder()
                    .title(Component.translatable("item_group_"+Bonsai.MODID))
                    .icon(()->new ItemStack(Items.OAK_BONSAI_CLIPPINGS.get()))
                    .displayItems((p,out) -> {
                        out.accept(Items.OAK_BONSAI_SEEDS.get());
                        out.accept(Items.OAK_BONSAI_CLIPPINGS.get());
                        out.accept(Items.JUNGLE_BONSAI_SEEDS.get());
                        out.accept(Items.JUNGLE_BONSAI_CLIPPINGS.get());
                        out.accept(Items.DARK_OAK_BONSAI_SEEDS.get());
                        out.accept(Items.DARK_OAK_BONSAI_CLIPPINGS.get());
                        out.accept(Items.ACACIA_BONSAI_SEEDS.get());
                        out.accept(Items.ACACIA_BONSAI_CLIPPINGS.get());
                        out.accept(Items.SPRUCE_BONSAI_SEEDS.get());
                        out.accept(Items.SPRUCE_BONSAI_CLIPPINGS.get());
                        out.accept(Items.BIRCH_BONSAI_SEEDS.get());
                        out.accept(Items.BIRCH_BONSAI_CLIPPINGS.get());

                    }).build()
            );
}
