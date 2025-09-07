package ru.fiarr4ik.ocean_block.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import ru.fiarr4ik.ocean_block.Fiarr4ikOneBlock;
import ru.fiarr4ik.ocean_block.tile.OneBlockGeneratorTile;

public class ModBlocks {

    public static Block oneBlockGenerator;

    public static void register() {

        oneBlockGenerator = new OneBlockGenerator().setBlockName("one_block_generator").setBlockTextureName(Fiarr4ikOneBlock.MOD_ID + ":one_block_generator");

        GameRegistry.registerBlock(oneBlockGenerator, ItemBlock.class, "one_block_generator");

        GameRegistry.registerTileEntity(OneBlockGeneratorTile.class, Fiarr4ikOneBlock.MOD_ID + ":one_block_generator");
    }

}
