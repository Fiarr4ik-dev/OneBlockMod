package ru.fiarr4ik.ocean_block.util;

import net.minecraft.init.Blocks;
import ru.fiarr4ik.ocean_block.dto.BlockChance;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, который нужен чтобы статически вернуть {@link List<BlockChance>}.
 */
public class OneBlockLoader {

    public static List<BlockChance> returnOneBlockType(String type) {
        List<BlockChance> blocks = new ArrayList<>();

        switch (type.toLowerCase()) {
            case "plains":
                blocks.add(new BlockChance(Blocks.grass, 0.4));
                blocks.add(new BlockChance(Blocks.dirt, 0.2));
                blocks.add(new BlockChance(Blocks.log, 0.05));
                blocks.add(new BlockChance(Blocks.leaves, 0.05));
                blocks.add(new BlockChance(Blocks.gravel, 0.1));
                blocks.add(new BlockChance(Blocks.sand, 0.1));
                blocks.add(new BlockChance(Blocks.clay, 0.1));
                break;

            case "caves":
                blocks.add(new BlockChance(Blocks.stone, 0.5));
                blocks.add(new BlockChance(Blocks.cobblestone, 0.2));
                blocks.add(new BlockChance(Blocks.coal_ore, 0.07));
                blocks.add(new BlockChance(Blocks.iron_ore, 0.07));
                blocks.add(new BlockChance(Blocks.gold_ore, 0.03));
                blocks.add(new BlockChance(Blocks.redstone_ore, 0.05));
                blocks.add(new BlockChance(Blocks.lapis_ore, 0.02));
                blocks.add(new BlockChance(Blocks.diamond_ore, 0.005));
                blocks.add(new BlockChance(Blocks.emerald_ore, 0.002));
                break;

            case "nether":
                blocks.add(new BlockChance(Blocks.netherrack, 0.7));
                blocks.add(new BlockChance(Blocks.soul_sand, 0.15));
                blocks.add(new BlockChance(Blocks.glowstone, 0.1));
                blocks.add(new BlockChance(Blocks.quartz_ore, 0.05));
                break;

            case "end":
                blocks.add(new BlockChance(Blocks.end_stone, 0.85));
                blocks.add(new BlockChance(Blocks.obsidian, 0.15));
                break;

            default:
                return returnOneBlockType(OneBlockTypes.plains);
        }

        return blocks;
    }
}