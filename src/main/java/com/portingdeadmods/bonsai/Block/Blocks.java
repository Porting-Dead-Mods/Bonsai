package com.portingdeadmods.bonsai.Block;

import com.portingdeadmods.bonsai.Bonsai;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;


public class Blocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Bonsai.MODID);
    public static final DeferredBlock<Block> OAK_BONSAI_CROP_BLOCK = BLOCKS.register("oak_bonsai_crop_block", () -> new OakBonsaiCropBlock(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> BIRCH_BONSAI_CROP_BLOCK = BLOCKS.register("birch_bonsai_crop_block", () -> new BirchBonsaiCropBlock(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> ACACIA_BONSAI_CROP_BLOCK = BLOCKS.register("acacia_bonsai_crop_block", () -> new AcaciaBonsaiCropBlock(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> DARK_OAK_BONSAI_CROP_BLOCK = BLOCKS.register("dark_oak_bonsai_crop_block", () -> new DarkOakBonsaiCropBlock(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> JUNGLE_BONSAI_CROP_BLOCK = BLOCKS.register("jungle_bonsai_crop_block", () -> new JungleBonsaiCropBlock(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));
    public static final DeferredBlock<Block> SPRUCE_BONSAI_CROP_BLOCK = BLOCKS.register("spruce_bonsai_crop_block", () -> new SpruceBonsaiCropBlock(BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.WHEAT).noOcclusion().noCollission()));

}
