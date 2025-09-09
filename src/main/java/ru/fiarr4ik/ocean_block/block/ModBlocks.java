package ru.fiarr4ik.ocean_block.block;

import cpw.mods.fml.common.registry.GameRegistry;
import ru.fiarr4ik.ocean_block.Fiarr4ikOneBlock;
import ru.fiarr4ik.ocean_block.tile.OneBlockGeneratorTile;

public class ModBlocks {

    public static void register() {

        for (ModBlocksEnum block : ModBlocksEnum.values()) {
            GameRegistry.registerBlock(block.getBlock(), block.getBlock().getUnlocalizedName());
        }

        GameRegistry.registerTileEntity(OneBlockGeneratorTile.class, Fiarr4ikOneBlock.MOD_ID + ":one_block_generator");
    }

}
