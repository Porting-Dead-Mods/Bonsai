package com.portingdeadmods.bonsai.tab;

import com.portingdeadmods.bonsai.Item.Items;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class BonsaiTab {
    /*
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
     */
    public static final CreativeModeTab BONSAI_TAB = (new CreativeModeTab("bonsai")
    {
        @Override
        public ItemStack makeIcon () {
            return new ItemStack(Items.OAK_BONSAI_CLIPPINGS.get());
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable("Bonsai Tree Crops");
        }
    });
}
