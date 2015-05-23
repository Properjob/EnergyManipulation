package com.properjob.energymanipulation.block;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Danny's on 23/05/2015.
 */
public class BlockEnergyShield extends BlockEM {
    public BlockEnergyShield(){
        super();
        this.setBlockName("BlockEnergyShield");
        this.setBlockTextureName("BlockEnergyShield");
        this.setBlockUnbreakable();
        float MAX_VALUE = Integer.MAX_VALUE / 1;
        this.setResistance(MAX_VALUE );

    }
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    @Override
    public int getRenderBlockPass()
    {
        return 1;
    }
    @Override
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int x, int y, int z, int side)
    {
        Block i1 = par1IBlockAccess.getBlock(x, y, z);
        return !(i1 == this) ? true : false;
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
    {
        return false;

    }
    @Override
    public void onBlockExploded(World world, int x, int y, int z, Explosion explosion){}

    @Override
    public boolean canDropFromExplosion(Explosion explosion)
    {
        return false;
    }
}