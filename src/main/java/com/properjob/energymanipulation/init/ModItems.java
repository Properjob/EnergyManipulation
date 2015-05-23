package com.properjob.energymanipulation.init;

import com.properjob.energymanipulation.item.ItemEM;
import com.properjob.energymanipulation.item.ItemEnergyCrystal;
import com.properjob.energymanipulation.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Danny's on 23/05/2015.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemEM itemEnergyCrystal = new ItemEnergyCrystal();

    public static void init(){
        GameRegistry.registerItem(itemEnergyCrystal, "itemEnergyCrystal");


    }

}
