package leetcode.oo.dp;

import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/max-area-of-island/
final class MaxAreadOfIslands {

    private int max;

    int maxAreaOfIsland(final int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    this.markNeigbours(grid, i, j, new AtomicInteger(0));
                }
            }
        }
        return this.max;
    }

    private void markNeigbours(final int[][] grid, int i, int j, AtomicInteger cnt) {
        cnt.incrementAndGet();
        this.max = Math.max(cnt.get(), this.max);
        if (this.invalidRange(grid, i, j)) {
            return;
        } else {
            if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                grid[i - 1][j] = 0;
                this.markNeigbours(grid, i - 1, j, cnt);
            }
            if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                grid[i][j - 1] = 0;
                this.markNeigbours(grid, i, j - 1, cnt);
            }
            if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                grid[i + 1][j] = 0;
                this.markNeigbours(grid, i + 1, j, cnt);
            }
            if (j + 1 < grid[0].length && grid[i][j + 1] == 1) {
                grid[i][j + 1] = 0;
                this.markNeigbours(grid, i, j + 1, cnt);
            }
        }
    }

    private boolean invalidRange(final int[][] grid, final int i, final int j) {
        return i < 0 || j < 0 || i >= grid.length || j >= grid[0].length;
    }

}
