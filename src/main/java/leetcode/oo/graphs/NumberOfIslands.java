package leetcode.oo.graphs;

/**
 * Number of islands.
 * See {@link <a href ="https://leetcode.com/problems/number-of-islands/">https://leetcode.com/problems/number-of-islands/</a>}
 */
final class NumberOfIslands {

    int numIslands(final char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    grid[i][j] = '0';
                    this.markNeigbours(grid, i, j);
                }
            }
        }
        return cnt;
    }

    private void markNeigbours(final char[][] grid, int i, int j) {
        if (this.invalidRange(grid, i, j)) {
            return;
        } else {
            if (i-1 >=0 && grid[i - 1][j] == '1') {
                grid[i - 1][j] = '0';
                this.markNeigbours(grid, i - 1, j);
            }
            if (j-1 >=0 &&grid[i][j - 1] == '1') {
                grid[i][j - 1] = '0';
                this.markNeigbours(grid, i, j - 1);
            }
            if (i+1<grid[0].length && grid[i+1][j] == '1') {
                grid[i+1][j] = '0';
                this.markNeigbours(grid, i+1, j);
            }
            if (j+1<grid[0].length && grid[i][j + 1] == '1') {
                grid[i][j + 1] = '0';
                this.markNeigbours(grid, i, j + 1);
            }
        }
    }

    private boolean invalidRange(final char[][] grid, final int i, final int j) {
        return i < 0 || j < 0 || i >= grid.length || j >= grid[0].length;
    }

}
