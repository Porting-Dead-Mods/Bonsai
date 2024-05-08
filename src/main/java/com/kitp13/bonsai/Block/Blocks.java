package com.kitp13.bonsai.Block;

import com.kitp13.bonsai.Bonsai;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Blocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Bonsai.MODID);
    public static final RegistryObject<Block> OAK_BONSAI_CROP_BLOCK = BLOCKS.register("oak_bonsai_crop_block", () -> new OakBonsaiCropBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> BIRCH_BONSAI_CROP_BLOCK = BLOCKS.register("birch_bonsai_crop_block", () -> new BirchBonsaiCropBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> ACACIA_BONSAI_CROP_BLOCK = BLOCKS.register("acacia_bonsai_crop_block", () -> new AcaciaBonsaiCropBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> DARK_OAK_BONSAI_CROP_BLOCK = BLOCKS.register("dark_oak_bonsai_crop_block", () -> new DarkOakBonsaiCropBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> JUNGLE_BONSAI_CROP_BLOCK = BLOCKS.register("jungle_bonsai_crop_block", () -> new JungleBonsaiCropBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> SPRUCE_BONSAI_CROP_BLOCK = BLOCKS.register("spruce_bonsai_crop_block", () -> new SpruceBonsaiCropBlock(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));

}
