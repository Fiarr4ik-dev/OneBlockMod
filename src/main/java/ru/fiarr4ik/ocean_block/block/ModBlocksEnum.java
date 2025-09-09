package ru.fiarr4ik.ocean_block.block;

import net.minecraft.block.Block;
import ru.fiarr4ik.ocean_block.util.OneBlockTypes;

import java.util.function.Supplier;

public enum ModBlocksEnum {
    PLAINS_ONE_BLOCK_GENERATOR(() -> new OneBlockGenerator("plains_one_block_generator", OneBlockTypes.plains)),
    CAVES_ONE_BLOCK_GENERATOR(() -> new OneBlockGenerator("caves_one_block_generator", OneBlockTypes.plains)),
    NETHER_ONE_BLOCK_GENERATOR(() -> new OneBlockGenerator("nether_one_block_generator", OneBlockTypes.plains)),
    END_ONE_BLOCK_GENERATOR(() -> new OneBlockGenerator("end_one_block_generator", OneBlockTypes.plains)),
    ;

    private final Supplier<Block> blockSupplier;

    ModBlocksEnum(Supplier<Block> blockSupplier) {
        this.blockSupplier = blockSupplier;
    }

    public Block getBlock() {
        return blockSupplier.get();
    }
}
