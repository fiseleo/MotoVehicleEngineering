package com.fiseleo.motovehicleengineering.item;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class PistonIron {
    public static final String MODID = "motovehicleengineering";
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(MODID);


    public static final DeferredHolder<Item, Item> PISTON_IRON =
            ITEMS.register("piston_iron", () -> new Item(new Item.Properties()));


}
