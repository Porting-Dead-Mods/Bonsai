package com.kitp13.bonsai.Block;

import com.kitp13.bonsai.Item.Items;
import net.minecraft.world.level.ItemLike;

public class SpruceBonsaiCropBlock extends BonsaiCropBlock{
    public SpruceBonsaiCropBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return Items.SPRUCE_BONSAI_SEEDS.get();
    }
}
