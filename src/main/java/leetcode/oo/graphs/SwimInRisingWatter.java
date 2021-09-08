package leetcode.oo.graphs;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/swim-in-rising-water/
final class SwimInRisingWatter {

    public int swimInWater(final int[][] grid) {
        final boolean[][] cache = new boolean[grid.length][grid[0].length];
        cache[0][0] = true;
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        queue.add(new int[]{grid[0][0], 0, 0});
        final int[][] dirs = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        };
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int row = poll[1];
            final int col = poll[2];
            final int cost = poll[0];
            cache[row][col] = true;
            if (row == grid.length - 1 && col == grid[0].length - 1) {
                return cost;
            }
            for (final int[] dir : dirs) {
                final int nextRow = row + dir[0];
                final int nextCol = col + dir[1];
                if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length || cache[nextRow][nextCol]) {
                    continue;
                }
                queue.add(
                    new int[]{
                        Math.max(grid[nextRow][nextCol], cost),
                        nextRow,
                        nextCol
                    }
                );
            }
        }
        return -1;
    }
}
