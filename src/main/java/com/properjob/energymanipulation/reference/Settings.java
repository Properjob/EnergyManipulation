package com.properjob.energymanipulation.reference;

/**
 * Created by Danny's on 23/05/2015.
 */
public class Settings {

    public static class General{

        //Blocks
        public static boolean enabledEnergyCrystalBlock;
        public static boolean enabledEnergyShield;
        //Items
        public static boolean enabledEnergyCrystal;
    }

    public static class Ores{

        public static class EnergyCrystalOre{
            //EnergyCrystal ore settings
            public static boolean enabledEnergyCrystalOreGen;
            public static int EnergyCrystalOreMinVeinSize;
            public static int EnergyCrystalOreMaxVeinSize;
            public static int EnergyCrystalOreRarity;
            public static int EnergyCrystalOreMinY;
            public static int EnergyCrystalOreMaxY;
        }
    }

}
