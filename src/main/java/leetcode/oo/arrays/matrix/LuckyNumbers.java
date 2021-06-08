package leetcode.oo.arrays.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class LuckyNumbers {

    public static void main(String[] args) {
        System.out.println(new LuckyNumbers().luckyNumbers(
            new int[][]{
                {3, 7, 8}, {9, 11, 13}, {15, 16, 17}
            }
        ));
    }

    public List<Integer> luckyNumbers(final int[][] matrix) {
        final int[] mins = new int[matrix.length];
        final int[] maxs = new int[matrix[0].length];
        Arrays.fill(mins, Integer.MAX_VALUE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                mins[i] = Math.min(mins[i], matrix[i][j]);
                maxs[j] = Math.max(maxs[j], matrix[i][j]);
            }
        }
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (mins[i] == maxs[j]) {
                    list.add(mins[i]);
                    break;
                }
            }
        }
        return list;
    }
}
