package com.properjob.energymanipulation.block;

import com.properjob.energymanipulation.creativetab.CreativeTab;
import com.properjob.energymanipulation.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Danny's on 23/05/2015.
 */
public class BlockEnergyCrystalOre extends BlockEM {

    public BlockEnergyCrystalOre() {
        super(Material.rock);
        this.setBlockName("BlockEnergyCrystalOre");
        this.setBlockTextureName("BlockEnergyCrystalOre");
        this.setCreativeTab(CreativeTab.EM_TAB);
        this.setResistance(2.0F);
        this.setHardness(3.0F);

    }

    public Item getItemDropped(int i1, Random random, int i2){

        return ModItems.itemEnergyCrystal;
    }

    public int quantityDropped(Random random)
    {
        return random.nextInt(1) + 4;
    }

}
