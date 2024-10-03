package com.portingdeadmods.bonsai;

import com.portingdeadmods.bonsai.Block.Blocks;
import com.portingdeadmods.bonsai.Item.Items;
import com.portingdeadmods.bonsai.tab.BonsaiTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Bonsai.MODID)
public class Bonsai {
    public static final String MODID = "bonsai";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Bonsai(IEventBus modEventBus, ModContainer modContainer){
        Items.ITEMS.register(modEventBus);
        Blocks.BLOCKS.register(modEventBus);
        BonsaiTab.TABS.register(modEventBus);
    }
}
