package com.portingdeadmods.bonsai.Item;

import com.portingdeadmods.bonsai.Block.Blocks;
import com.portingdeadmods.bonsai.Bonsai;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bonsai.MODID);

    // Bonsai Seeds
    public static RegistryObject<Item> OAK_BONSAI_SEEDS = ITEMS.register("oak_bonsai_seeds", () -> new ItemNameBlockItem(Blocks.OAK_BONSAI_CROP_BLOCK.get(), new Item.Properties()));
    public static RegistryObject<Item> BIRCH_BONSAI_SEEDS = ITEMS.register("birch_bonsai_seeds", () -> new ItemNameBlockItem(Blocks.BIRCH_BONSAI_CROP_BLOCK.get(), new Item.Properties()));
    public static RegistryObject<Item> ACACIA_BONSAI_SEEDS = ITEMS.register("acacia_bonsai_seeds", () -> new ItemNameBlockItem(Blocks.ACACIA_BONSAI_CROP_BLOCK.get(), new Item.Properties()));
    public static RegistryObject<Item> DARK_OAK_BONSAI_SEEDS = ITEMS.register("dark_oak_bonsai_seeds", () -> new ItemNameBlockItem(Blocks.DARK_OAK_BONSAI_CROP_BLOCK.get(), new Item.Properties()));
    public static RegistryObject<Item> JUNGLE_BONSAI_SEEDS = ITEMS.register("jungle_bonsai_seeds", () -> new ItemNameBlockItem(Blocks.JUNGLE_BONSAI_CROP_BLOCK.get(), new Item.Properties()));
    public static RegistryObject<Item> SPRUCE_BONSAI_SEEDS = ITEMS.register("spruce_bonsai_seeds", () -> new ItemNameBlockItem(Blocks.SPRUCE_BONSAI_CROP_BLOCK.get(), new Item.Properties()));

    // Bonsai Clippings
    public static RegistryObject<Item> OAK_BONSAI_CLIPPINGS = ITEMS.register("oak_bonsai_clippings", () -> new Item(new Item.Properties()));
    public static RegistryObject<Item> BIRCH_BONSAI_CLIPPINGS = ITEMS.register("birch_bonsai_clippings", () -> new Item(new Item.Properties()));
    public static RegistryObject<Item> ACACIA_BONSAI_CLIPPINGS = ITEMS.register("acacia_bonsai_clippings", () -> new Item(new Item.Properties()));
    public static RegistryObject<Item> DARK_OAK_BONSAI_CLIPPINGS = ITEMS.register("dark_oak_bonsai_clippings", () -> new Item(new Item.Properties()));
    public static RegistryObject<Item> JUNGLE_BONSAI_CLIPPINGS = ITEMS.register("jungle_bonsai_clippings", () -> new Item(new Item.Properties()));
    public static RegistryObject<Item> SPRUCE_BONSAI_CLIPPINGS = ITEMS.register("spruce_bonsai_clippings", () -> new Item(new Item.Properties()));
}
