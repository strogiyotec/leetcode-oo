package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/
public final class NumberOfRectangles {

    public static void main(String[] args) {
        System.out.println(
            new NumberOfRectangles().countGoodRectangles(
                new int[][]{
                    {5, 8}, {3, 9}, {5, 12}, {16, 5}
                }
            )
        );

    }

    public int countGoodRectangles(int[][] rectangles) {
        final Map<Integer, Integer> count = new HashMap<>();
        int max = 0;
        for (final int[] rectangle : rectangles) {
            final int min = Math.min(rectangle[0], rectangle[1]);
            count.merge(min, 1, Integer::sum);
            max = Math.max(max, min);
        }
        return count.get(max);
    }
}
