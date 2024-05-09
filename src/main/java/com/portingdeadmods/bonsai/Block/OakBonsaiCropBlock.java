package com.portingdeadmods.bonsai.Block;

import com.portingdeadmods.bonsai.Item.Items;
import net.minecraft.world.level.ItemLike;

public class OakBonsaiCropBlock extends BonsaiCropBlock {
    public OakBonsaiCropBlock(Properties p_52247_) {
        super(p_52247_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return Items.OAK_BONSAI_SEEDS.get();
    }
}
