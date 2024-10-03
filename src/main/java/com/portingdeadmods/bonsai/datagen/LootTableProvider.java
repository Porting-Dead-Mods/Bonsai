package com.portingdeadmods.bonsai.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LootTableProvider {
    public static net.minecraft.data.loot.LootTableProvider create(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        return new net.minecraft.data.loot.LootTableProvider(output, Collections.emptySet(), List.of(
                new net.minecraft.data.loot.LootTableProvider.SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK)
        ), lookupProvider);
    }
}
