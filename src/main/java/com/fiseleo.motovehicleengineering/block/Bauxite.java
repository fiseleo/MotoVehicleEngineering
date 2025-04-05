package com.fiseleo.motovehicleengineering.block;

import com.google.common.collect.Iterables;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;


public class Bauxite {
    public static final String MODID = "motovehicleengineering";

    // 创建方块的 DeferredRegister
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.createBlocks(MODID);

    // 创建物品的 DeferredRegister
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(MODID);

    // 注册一个名为 "ore_test" 的方块
    public static final DeferredHolder<Block, Block> Bauxite =
            BLOCKS.register("bauxite", () ->
                    new Block(BlockBehaviour.Properties.of()
                            .requiresCorrectToolForDrops()
                            .strength(2f)
                    )
            );

    // 为上面注册的方块注册一个对应的 BlockItem
    public static final DeferredHolder<Item, Item> Bauxite_ITEM =
            ITEMS.register("bauxite",  () ->
                    new BlockItem(Bauxite.get(), new Item.Properties())
            );

}
