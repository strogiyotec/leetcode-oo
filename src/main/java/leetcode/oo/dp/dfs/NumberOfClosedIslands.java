package leetcode.oo.dp.dfs;

public class NumberOfClosedIslands {

    int closedIsland(final int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0 && this.isPerimeter(i, j, grid)) {
                    this.dfs(i, j, grid);
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    this.dfs(i, j, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dfs(final int row, final int col, final int[][] grid) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 1) {
            return;
        }
        grid[row][col] = 1;
        this.dfs(row + 1, col, grid);
        this.dfs(row - 1, col, grid);
        this.dfs(row, col + 1, grid);
        this.dfs(row, col - 1, grid);
    }

    private boolean isPerimeter(final int row, final int col, final int[][] grid) {
        return row == 0 || row == grid.length - 1 || col == 0 || col == grid[0].length - 1;
    }

}
