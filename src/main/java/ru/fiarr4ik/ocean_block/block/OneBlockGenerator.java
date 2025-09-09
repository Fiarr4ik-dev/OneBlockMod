package ru.fiarr4ik.ocean_block.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ru.fiarr4ik.ocean_block.Fiarr4ikOneBlock;
import ru.fiarr4ik.ocean_block.tile.OneBlockGeneratorTile;

/**
 * Класс блока, который является сущностью {@link OneBlockGeneratorTile}.
 */
public class OneBlockGenerator extends Block {

    private final String type;

    protected OneBlockGenerator(String name, String type) {
        super(Material.iron);
        setBlockName(name);
        setBlockTextureName(Fiarr4ikOneBlock.MOD_ID + ":" + name);
        this.type = type;
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new OneBlockGeneratorTile(type);
    }

}
