package ru.fiarr4ik.ocean_block.tile;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import ru.fiarr4ik.ocean_block.util.PositionHelper;

public class OneBlockGeneratorTile extends TileEntity {

    @Override
    public void updateEntity() {
        if (worldObj == null || worldObj.isRemote) {
            return;
        }

        var pos = PositionHelper.returnAbove(new PositionHelper(xCoord, yCoord, zCoord));

        if (worldObj.isAirBlock(pos.getX(), pos.getY(), pos.getZ())) {
            worldObj.setBlock(pos.getX(), pos.getY(), pos.getZ(), getBlockToSpawn(), 0, 2);
        }
    }

    private static Block getBlockToSpawn() {
        return Blocks.stone;
    }

}
