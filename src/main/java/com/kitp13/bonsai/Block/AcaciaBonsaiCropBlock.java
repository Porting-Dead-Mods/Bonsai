package com.kitp13.bonsai.Block;

import com.kitp13.bonsai.Item.Items;
import net.minecraft.world.level.ItemLike;

public class AcaciaBonsaiCropBlock extends BonsaiCropBlock{
    public AcaciaBonsaiCropBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return Items.ACACIA_BONSAI_SEEDS.get();
    }
}
