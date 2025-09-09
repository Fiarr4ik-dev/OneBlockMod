package ru.fiarr4ik.ocean_block.dto;

import lombok.Getter;
import net.minecraft.block.Block;

/**
 * DTO для определения блока и его шанса появления.
 */
@Getter
public class BlockChance {

    private final Block block;
    private final double chance;

    public BlockChance(Block block, double chance) {
        this.block = block;
        this.chance = chance;
    }

}
