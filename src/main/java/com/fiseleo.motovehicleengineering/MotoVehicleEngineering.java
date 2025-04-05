package com.fiseleo.motovehicleengineering;


import com.fiseleo.motovehicleengineering.item.VehicleTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import com.fiseleo.motovehicleengineering.item.PistonIron;


@Mod(MotoVehicleEngineering.MODID)
public class MotoVehicleEngineering
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "motovehicleengineering";

    public MotoVehicleEngineering(IEventBus modEventBus, ModContainer modContainer)
    {
        VehicleTab.CREATIVE_MODE_TABS.register(modEventBus);
        PistonIron.ITEMS.register(modEventBus);


    }

}
