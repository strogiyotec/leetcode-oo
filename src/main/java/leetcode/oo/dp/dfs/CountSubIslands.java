package leetcode.oo.dp.dfs;

//https://leetcode.com/problems/count-sub-islands/
final class CountSubIslands {

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int cnt = 0;
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[0].length; j++) {
                if (grid2[i][j] == 1 && this.dfs(grid1, grid2, i, j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private boolean dfs(final int[][] grid1, final int[][] grid2, final int row, final int col) {
        boolean result = true;
        if (row >= 0 && row < grid1.length && col >= 0 && col < grid1[0].length && grid2[row][col] == 1) {
            if (grid1[row][col] != grid2[row][col]) {
                return false;
            }
            grid2[row][col] = -1;
            final boolean down = this.dfs(grid1, grid2, row + 1, col);
            final boolean up = this.dfs(grid1, grid2, row - 1, col);
            final boolean right = this.dfs(grid1, grid2, row, col + 1);
            final boolean left = this.dfs(grid1, grid2, row, col - 1);
            if (!left || !right || !down || !up) {
                return false;
            }
        }
        return result;
    }
}
