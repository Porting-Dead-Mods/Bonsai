package com.kitp13.bonsai;

import com.kitp13.bonsai.Block.Blocks;
import com.kitp13.bonsai.Item.Items;
import com.kitp13.bonsai.tab.BonsaiTab;
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
