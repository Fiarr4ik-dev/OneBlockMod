package ru.fiarr4ik.ocean_block.tile;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import ru.fiarr4ik.ocean_block.util.OneBlockLoader;
import ru.fiarr4ik.ocean_block.util.PositionHelper;
import ru.fiarr4ik.ocean_block.dto.BlockChance;

import java.util.List;
import java.util.Random;

public class OneBlockGeneratorTile extends TileEntity {

    private static final Random RANDOM = new Random();

    private String type;

    public OneBlockGeneratorTile(String type) {
        this.type = type;
    }

    @Override
    public void updateEntity() {
        if (worldObj == null || worldObj.isRemote) return;

        var pos = PositionHelper.returnAbove(new PositionHelper(xCoord, yCoord, zCoord));

        if (worldObj.isAirBlock(pos.getX(), pos.getY(), pos.getZ())) {
            worldObj.setBlock(pos.getX(), pos.getY(), pos.getZ(), getBlockToSpawn(), 0, 2);
        }
    }

    private Block getBlockToSpawn() {
        List<BlockChance> blocks = OneBlockLoader.returnOneBlockType(type);
        if (blocks == null || blocks.isEmpty()) return net.minecraft.init.Blocks.stone;

        double rand = RANDOM.nextDouble();
        double sum = 0.0;

        for (BlockChance bc : blocks) {
            sum += bc.getChance();
            if (rand <= sum) return bc.getBlock();
        }

        return blocks.get(0).getBlock();
    }
}
