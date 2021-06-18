package leetcode.oo.sort;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/maximum-units-on-a-truck/
public final class MaxUnitsTrack {

    public static void main(final String[] args) {
        System.out.println(
            new MaxUnitsTrack().maximumUnits(
                new int[][]{
                    {5, 10}, {2, 5}, {4, 7}, {3, 9}
                },
                10
            )
        );
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.<int[]>comparingInt(value -> value[1]).reversed());
        int max = 0;
        int currentCapacity = 0;
        int index = 0;
        while (index < boxTypes.length && currentCapacity < truckSize) {
            final int[] boxType = boxTypes[index];
            if (boxType[0] == 0) {
                index++;
            } else {
                max += boxType[1];
                currentCapacity++;
                boxType[0] -= 1;
            }
        }
        return max;
    }
}
