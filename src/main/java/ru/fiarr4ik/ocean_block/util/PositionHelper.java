package ru.fiarr4ik.ocean_block.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PositionHelper {

    private final int x;
    private final int y;
    private final int z;

    /**
     * @param pos экземпляр класса {@link PositionHelper}
     * @return экземпляр класса {@link PositionHelper} координат x, y + 1, z.
     */
    public static PositionHelper returnAbove(PositionHelper pos) {
        return new PositionHelper(pos.x, pos.y + 1, pos.z);
    }

    /**
     * @param pos экземпляр класса {@link PositionHelper}
     * @return экземпляр класса {@link PositionHelper} координат x, y - 1, z.
     */
    public static PositionHelper returnBelow(PositionHelper pos) {
        return new PositionHelper(pos.x, pos.y - 1, pos.z);
    }

}
