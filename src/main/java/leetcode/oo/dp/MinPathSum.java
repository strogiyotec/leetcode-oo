package leetcode.oo.dp;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Minimum Path Sum.
 * See {@link <a href ="https://leetcode.com/problems/minimum-path-sum/">https://leetcode.com/problems/minimum-path-sum/</a>}
 */
final class MinPathSum {

    int minPathSum(int[][] grid) {
        final Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(value -> value[2]));
        queue.add(new int[]{0, 0, grid[0][0]});
        final boolean[][] cache = new boolean[grid.length][grid[0].length];
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int row = poll[0];
            final int col = poll[1];
            final int cost = poll[2];
            if (row == grid.length - 1 && col == grid[0].length - 1) {
                return cost;
            }
            if (row + 1 < grid.length && !cache[row + 1][col]) {
                queue.add(new int[]{row + 1, col, cost + grid[row + 1][col]});
                cache[row+1][col] = true;
            }
            if (col + 1 < grid[0].length && !cache[row][col + 1]) {
                cache[row][col+1] = true;
                queue.add(new int[]{row, col + 1, cost + grid[row][col + 1]});
            }
        }
        return -1;
    }
}
