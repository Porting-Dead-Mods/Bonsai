package com.portingdeadmods.bonsai;

import com.portingdeadmods.bonsai.Block.Blocks;
import com.portingdeadmods.bonsai.Item.Items;
import com.portingdeadmods.bonsai.tab.BonsaiTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Bonsai.MODID)
public class Bonsai {
    public static final String MODID = "bonsai";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Bonsai(){
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Items.ITEMS.register(modEventBus);
        Blocks.BLOCKS.register(modEventBus);
        BonsaiTab.TABS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
