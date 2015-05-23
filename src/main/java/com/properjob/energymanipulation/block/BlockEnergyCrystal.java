package com.properjob.energymanipulation.block;

import com.properjob.energymanipulation.creativetab.CreativeTab;
import net.minecraft.block.material.Material;

/**
 * Created by Danny's on 23/05/2015.
 */
public class BlockEnergyCrystal extends BlockEM{
    public BlockEnergyCrystal() {
        super(Material.iron);
        this.setBlockName("BlockEnergyCrystal");
        this.setBlockTextureName("BlockEnergyCrystal");
        this.setCreativeTab(CreativeTab.EM_TAB);
        this.setResistance(5.0F);
        this.setHardness(10.0F);
        this.setLightLevel(1.0F);
    }
}
