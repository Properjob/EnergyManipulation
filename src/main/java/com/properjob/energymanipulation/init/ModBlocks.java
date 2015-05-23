package com.properjob.energymanipulation.init;

import com.properjob.energymanipulation.block.BlockEM;
import com.properjob.energymanipulation.block.BlockEnergyCrystal;
import com.properjob.energymanipulation.block.BlockEnergyCrystalOre;
import com.properjob.energymanipulation.block.BlockEnergyShield;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Danny's on 23/05/2015.
 */
public class ModBlocks {

    public static final BlockEM BlockEnergyCrystal = new BlockEnergyCrystal();
    public static final BlockEM BlockEnergyCrystalOre = new BlockEnergyCrystalOre();
    public static final BlockEM BlockEnergyShield = new BlockEnergyShield();

    public static void init()
    {
        GameRegistry.registerBlock(BlockEnergyCrystal, "BlockEnergyCrystal");
        GameRegistry.registerBlock(BlockEnergyCrystalOre, "BlockEnergyCrystalOre");
        GameRegistry.registerBlock(BlockEnergyShield, "BlockEnergyShield");

    }
}
