package com.shardxi.overpower;

import com.shardxi.overpower.configeration.ConfigurationHandler;
import com.shardxi.overpower.proxy.Iproxy;
import com.shardxi.overpower.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class overpower

{
    @Mod.Instance(Reference.MOD_ID)
    public static overpower instance;

    @SidedProxy(clientSide = "com.shardxi.overpower.proxy.Clientproxy", serverSide = "com.shardxi.overpower.proxy.Serverproxy")
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
