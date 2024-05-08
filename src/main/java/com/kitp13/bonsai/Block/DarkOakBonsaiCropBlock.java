package com.kitp13.bonsai.Block;

import com.kitp13.bonsai.Item.Items;
import net.minecraft.world.level.ItemLike;

public class DarkOakBonsaiCropBlock extends BonsaiCropBlock{
    public DarkOakBonsaiCropBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return Items.DARK_OAK_BONSAI_SEEDS.get();
    }
}
