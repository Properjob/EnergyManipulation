package com.properjob.energymanipulation.creativetab;

import com.properjob.energymanipulation.init.ModBlocks;
import com.properjob.energymanipulation.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Danny's on 23/05/2015.
 */
public class CreativeTab {


    public static final CreativeTabs EM_TAB = new CreativeTabs(Reference.LOWERCASE_MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(ModBlocks.blockEnergyShield);
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return Reference.MOD_NAME;

        }
    };

}
