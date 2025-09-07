package ru.fiarr4ik.ocean_block;

import ru.fiarr4ik.ocean_block.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Fiarr4ikOneBlock.MOD_ID, version = Fiarr4ikOneBlock.VERSION)
public class Fiarr4ikOneBlock {

    public static final String MOD_ID = "fiarr4ik_ocean_block";
    public static final String VERSION = "1.0.0";

    @SidedProxy(
            clientSide = "ru.fiarr4ik.ocean_block.client.ClientProxy",
            serverSide = "ru.fiarr4ik.ocean_block.common.CommonProxy"
    )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
