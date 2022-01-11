package leetcode.oo.dp.dfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/map-of-highest-peak/
public final class MapHighestPeek {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new MapHighestPeek().highestPeak(
            new int[][]{
                {0, 1},
                {0, 0},
            }
        )));
    }

    public int[][] highestPeak(final int[][] isWater) {
        final int[][] solution = new int[isWater.length][isWater[0].length];
        for (final int[] ints : solution) {
            Arrays.fill(ints, -1);
        }
        final Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[0].length; j++) {
                if (isWater[i][j] == 1) {
                    queue.add(new int[]{i, j, 0});
                }
            }
        }
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int row = poll[0];
            final int col = poll[1];
            final int height = poll[2];
            if (row < 0 || row >= solution.length || col < 0 || col >= solution[0].length || solution[row][col] != -1) {
                continue;
            }
            solution[row][col] = height;
            queue.add(new int[]{row + 1, col, height + 1});
            queue.add(new int[]{row - 1, col, height + 1});
            queue.add(new int[]{row, col + 1, height + 1});
            queue.add(new int[]{row, col - 1, height + 1});
        }
        return solution;
    }
}
