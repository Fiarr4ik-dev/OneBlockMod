package ru.fiarr4ik.ocean_block.tile;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class OneBlockGeneratorTile extends TileEntity {

    @Override
    public void updateEntity() {
        if (worldObj == null || worldObj.isRemote) return;

        int x = xCoord;
        int y = yCoord + 1;
        int z = zCoord;

        if (worldObj.isAirBlock(x, y, z)) {
            worldObj.setBlock(x, y, z, Blocks.stone);
        }
    }

}
