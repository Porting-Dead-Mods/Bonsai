package com.kitp13.bonsai.datagen;

import com.kitp13.bonsai.Block.Blocks;
import com.kitp13.bonsai.Block.BonsaiCropBlock;
import com.kitp13.bonsai.Block.OakBonsaiCropBlock;
import com.kitp13.bonsai.Bonsai;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.checkerframework.checker.units.qual.C;

import java.util.function.Function;

public class BlockStateProvider extends net.minecraftforge.client.model.generators.BlockStateProvider {
    public BlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        makeBonsaiCrop((BonsaiCropBlock) Blocks.OAK_BONSAI_CROP_BLOCK.get(), "bonsai_oak", "bonsai_oak");
        makeBonsaiCrop((BonsaiCropBlock) Blocks.SPRUCE_BONSAI_CROP_BLOCK.get(), "bonsai_spruce", "bonsai_spruce");
        makeBonsaiCrop((BonsaiCropBlock) Blocks.JUNGLE_BONSAI_CROP_BLOCK.get(), "bonsai_jungle", "bonsai_jungle");
        makeBonsaiCrop((BonsaiCropBlock) Blocks.BIRCH_BONSAI_CROP_BLOCK.get(), "bonsai_birch", "bonsai_birch");
        makeBonsaiCrop((BonsaiCropBlock) Blocks.ACACIA_BONSAI_CROP_BLOCK.get(), "bonsai_acacia", "bonsai_acacia");
        makeBonsaiCrop((BonsaiCropBlock) Blocks.DARK_OAK_BONSAI_CROP_BLOCK.get(), "bonsai_darkoak", "bonsai_darkoak");

    }
    private void makeBonsaiCrop(BonsaiCropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(block, state, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] states(BonsaiCropBlock block, BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName+state.getValue(block.getAgeProperty()),
                new ResourceLocation(Bonsai.MODID, "block/"+textureName+state.getValue(block.getAgeProperty()))).renderType("cutout"));
        return models;
    }
}
