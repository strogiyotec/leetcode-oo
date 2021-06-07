package leetcode.oo.dp.greedy;

import java.util.Arrays;
import java.util.LinkedList;

//https://leetcode.com/problems/insert-interval/
public final class InsertInterval {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new InsertInterval().insert(
            new int[][]{
                {1, 5}
            },
            new int[]{6, 8}
        )));
        System.out.println(Arrays.deepToString(new InsertInterval().insert(
            new int[][]{
                {1, 5}
            },
            new int[]{0, 0}
        )));
        System.out.println(Arrays.deepToString(new InsertInterval().insert(
            new int[][]{},
            new int[]{4, 8}
        )));
        System.out.println(Arrays.deepToString(new InsertInterval().insert(
            new int[][]{
                {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}
            },
            new int[]{4, 8}
        )));
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        final LinkedList<int[]> merged = new LinkedList<>();
        if (intervals.length == 0) {
            return new int[][]{{newInterval[0], newInterval[1]}};
        }
        boolean inserted = false;
        for (final int[] current : intervals) {
            if (inserted) {
                final int[] mergedInterval = merged.getLast();
                if (mergedInterval[1] < current[0]) {
                    merged.add(current);
                } else {
                    mergedInterval[0] = Math.min(mergedInterval[0], current[0]);
                    mergedInterval[1] = Math.max(mergedInterval[1], current[1]);
                }
            } else {
                if (newInterval[1] < current[0]) {
                    merged.add(newInterval);
                    merged.add(current);
                    inserted = true;
                } else if (current[1] < newInterval[0]) {
                    merged.add(current);
                } else {
                    merged.add(
                        new int[]{
                            Math.min(current[0], newInterval[0]),
                            Math.max(current[1], newInterval[1])
                        }
                    );
                    inserted = true;
                }
            }
        }
        if(!inserted){
            merged.add(newInterval);
        }
        final int[][] matrix = new int[merged.size()][2];
        for (int i = 0; i < merged.size(); i++) {
            matrix[i] = merged.get(i);
        }
        return matrix;
    }
}
