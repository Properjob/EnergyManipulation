package com.properjob.energymanipulation.handler;

import com.properjob.energymanipulation.reference.Settings;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Danny's on 23/05/2015.
 */
public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        //Default values for ore generation
        try
        {
            configuration.load();

            //Read and Write Values to config file
            //Block and items
            Settings.General.enabledEnergyCrystalBlock = configuration.getBoolean("Enable EnergyCrystal Block", "General", true,"");
            Settings.General.enabledEnergyShield = configuration.getBoolean("Enable EnergyCrystal Field", "General", true,"");
            // World generation
            Settings.Ores.EnergyCrystalOre.enabledEnergyCrystalOreGen = configuration.getBoolean("Enable EnergyCrystal Ore Gen", "World Generation", true, null);
            Settings.Ores.EnergyCrystalOre.EnergyCrystalOreMaxVeinSize = configuration.get("World Generation", "EnergyCrystalOreMaxVeinSize", 8).getInt();
            Settings.Ores.EnergyCrystalOre.EnergyCrystalOreMinVeinSize = configuration.get("World Generation", "EnergyCrystalOreMinVeinSize", 3).getInt();
            Settings.Ores.EnergyCrystalOre.EnergyCrystalOreMaxY = configuration.get("World Generation", "EnergyCrystalOreMaxY", 35).getInt();
            Settings.Ores.EnergyCrystalOre.EnergyCrystalOreMinY = configuration.get("World Generation", "EnergyCrystalOreMinY", 1).getInt();
            Settings.Ores.EnergyCrystalOre.EnergyCrystalOreRarity = configuration.get("World Generation", "EnergyCrystalOreRarity", 4).getInt();
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }
    }
}
