package ru.fiarr4ik.ocean_block.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import ru.fiarr4ik.ocean_block.Fiarr4ikOneBlock;
import ru.fiarr4ik.ocean_block.tile.OneBlockGeneratorTile;
import ru.fiarr4ik.ocean_block.util.OneBlockTypes;

public class ModBlocks {

    public static Block plainsOneBlockGenerator;
    public static Block cavesOneBlockGenerator;
    public static Block netherOneBlockGenerator;
    public static Block endOneBlockGenerator;

    public static void register() {

        plainsOneBlockGenerator = new OneBlockGenerator("plains_one_block_generator", OneBlockTypes.plains);
        cavesOneBlockGenerator = new OneBlockGenerator("caves_one_block_generator", OneBlockTypes.caves);
        netherOneBlockGenerator = new OneBlockGenerator("nether_one_block_generator", OneBlockTypes.nether);
        endOneBlockGenerator = new OneBlockGenerator("end_one_block_generator", OneBlockTypes.end);

        GameRegistry.registerBlock(plainsOneBlockGenerator, "plains_one_block_generator");
        GameRegistry.registerBlock(cavesOneBlockGenerator, "caves_one_block_generator");
        GameRegistry.registerBlock(netherOneBlockGenerator, "nether_one_block_generator");
        GameRegistry.registerBlock(endOneBlockGenerator, "end_one_block_generator");

        GameRegistry.registerTileEntity(OneBlockGeneratorTile.class, Fiarr4ikOneBlock.MOD_ID + ":one_block_generator");
    }

}
