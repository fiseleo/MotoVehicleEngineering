package com.fiseleo.motovehicleengineering.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.fiseleo.motovehicleengineering.item.PistonSteel.PISTON_Steel;
import static com.fiseleo.motovehicleengineering.block.Bauxite.Bauxite;


public class VehicleTab {
    public static final String MODID = "motovehicleengineering";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MVE_CREATIVE_TAB =
            CREATIVE_MODE_TABS.register("mve_tab", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup." + MODID + ".mve_tab"))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> new ItemStack(PISTON_Steel.get()))
                            .displayItems((params, output) -> {
                                output.accept(PISTON_Steel.get());
                                output.accept(Bauxite.get());

                            })
                            .build()
            );
}
