package com.properjob.energymanipulation.item;

/**
 * Created by Danny's on 23/05/2015.
 */

import com.properjob.energymanipulation.creativetab.CreativeTab;
import com.properjob.energymanipulation.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemEM extends Item {

    public ItemEM()
    {
        super();
        this.setCreativeTab(CreativeTab.EM_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        System.out.println("Looking for: " + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

