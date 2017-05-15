package com.shardxi.overpower.handler;

import com.shardxi.overpower.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init (File configfile)
    {

        if (configuration == null)
        {
            configuration = new Configuration(configfile);
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadconfiguration();
        }
    }

    public void loadconfiguration()
    {
        testValue = configuration.getBoolean("ConfigValue", Configuration.CATEGORY_GENERAL, false, "This is the OPconfig value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
