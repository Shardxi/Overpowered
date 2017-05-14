package com.shardxi.overpower.configeration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init (File configfile)
    {
        Configuration configuration = new Configuration(configfile);
        boolean configValue = false;
        try
        {
            // Load the configuration file
            configuration.load();

            // Read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is the configfile reader").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            // Save the configuration file
            configuration.save();
        }
        System.out.println(configValue);
    }
}
