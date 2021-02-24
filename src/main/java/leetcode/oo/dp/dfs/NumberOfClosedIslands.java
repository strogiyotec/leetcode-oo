package leetcode.oo.dp.dfs;

public class NumberOfClosedIslands {

    int closedIsland(final int[][] grid) {
        //count the number
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0 && this.isPerimeter(grid, i, j)) {
                    this.dfs(grid, i, j);
                }
            }
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    this.dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPerimeter(final int[][] grid, final int row, final int column) {
        return row == 0 || row == grid.length - 1 || column == 0 || column == grid[0].length - 1;
    }

    private void dfs(final int[][] grid, final int row, final int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return;
        }
        if (grid[row][col] == 1) {
            return;
        }
        grid[row][col] = 1;
        this.dfs(grid, row - 1, col);
        this.dfs(grid, row + 1, col);
        this.dfs(grid, row, col - 1);
        this.dfs(grid, row, col + 1);
    }
}
