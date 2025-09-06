package ru.fiarr4ik.ocean_block.common;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ru.fiarr4ik.ocean_block.block.ModBlocks;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.register();
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
