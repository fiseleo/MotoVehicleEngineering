package com.fiseleo.motovehicleengineering.item;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class PistonSteel {
    public static final String MODID = "motovehicleengineering";
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(MODID);


    public static final DeferredHolder<Item, Item> PISTON_Steel =
            ITEMS.register("piston_steel", () -> new Item(new Item.Properties()));


}
