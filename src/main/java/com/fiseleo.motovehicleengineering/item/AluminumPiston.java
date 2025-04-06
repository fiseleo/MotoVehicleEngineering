package com.fiseleo.motovehicleengineering.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AluminumPiston {

    public static final String MODID = "motovehicleengineering";
    public  static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(MODID);



    public static final DeferredHolder<Item, Item> Aluminum_Piston =
        ITEMS.register("aluminum_piston", () -> new Item(new Item.Properties()));

}
