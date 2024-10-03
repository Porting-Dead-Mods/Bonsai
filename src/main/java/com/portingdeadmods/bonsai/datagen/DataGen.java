package com.portingdeadmods.bonsai.datagen;

import com.portingdeadmods.bonsai.Bonsai;
import com.portingdeadmods.bonsai.datagen.lang.EN_US;
import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeClient(), new ItemModel(generator.getPackOutput(), Bonsai.MODID, event.getExistingFileHelper()));
        generator.addProvider(event.includeClient(), new BlockStateProvider(generator.getPackOutput(),Bonsai.MODID,event.getExistingFileHelper()));
        generator.addProvider(event.includeServer(), LootTableProvider.create(generator.getPackOutput(), event.getLookupProvider()));
        generator.addProvider(event.includeServer(), new Recipes(generator.getPackOutput(), event.getLookupProvider()));
        generator.addProvider(event.includeClient(), new EN_US(generator.getPackOutput(),Bonsai.MODID, "en_us"));
    }
}
