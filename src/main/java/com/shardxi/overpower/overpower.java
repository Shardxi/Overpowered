package com.shardxi.overpower;

import com.shardxi.overpower.proxy.Iproxy;
import com.shardxi.overpower.reference.Reference;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class overpower

{
    @Mod.Instance(Reference.MOD_ID)
    public static overpower instance;

    @SidedProxy(clientSide = "com.shardxi.overpower.proxy.Clientproxy", serverSide = "com.shardxi.overpower.proxy.Serverproxy")
    public static Iproxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
