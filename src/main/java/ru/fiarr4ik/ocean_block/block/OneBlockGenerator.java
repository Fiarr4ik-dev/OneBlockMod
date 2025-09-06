package ru.fiarr4ik.ocean_block.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ru.fiarr4ik.ocean_block.Fiarr4ikOneBlock;
import ru.fiarr4ik.ocean_block.tile.OneBlockGeneratorTile;

import java.util.Random;

public class OneBlockGenerator extends Block {

    protected OneBlockGenerator() {
        super(Material.iron);
        String name = Fiarr4ikOneBlock.MOD_ID + ":one_block_generator";
        setBlockName(name);
        setBlockTextureName("one_block_generator");
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new OneBlockGeneratorTile();
    }

}
