package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-consecutive-floors-without-special-floors/
public final class MaxConseqFloors {

    public int maxConsecutive(
        final int bottom,
        final int top,
        final int[] special
    ) {
        Arrays.sort(special);
        int previousFloor = bottom - 1;
        int max = 0;
        for (final int specialFloor : special) {
            max = Math.max(
                max,
                specialFloor - previousFloor - 1
            );
            previousFloor = specialFloor;
        }
        return Math.max(
            max,
            top - special[special.length - 1]
        );
    }
}
