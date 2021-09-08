package leetcode.oo.graphs;

//https://leetcode.com/problems/maximum-non-negative-product-in-a-matrix/
public final class MaxNonNegativeProduct {

    public static void main(String[] args) {
        System.out.println(new MaxNonNegativeProduct().maxProductPath(
            new int[][]{
                {1, -2, 1},
                {1, -2, 1},
                {3, -4, 1}
            }
        ));
    }

    private long max = -1;

    public int maxProductPath(final int[][] grid) {
        this.dfs(grid, 0, 0, grid[0][0]);
        return (int) (this.max % 1000000007);
    }

    private void dfs(final int[][] grid, final int row, final int col, final int currentProd) {
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            this.max = Math.max(
                this.max,
                currentProd
            );
            return;
        }
        if(grid[row][col]==0){
            this.max=Math.max(this.max,0);
            return;
        }
        if (row + 1 < grid.length ) {
            this.dfs(grid, row + 1, col, currentProd * grid[row + 1][col]);
        }
        if (col + 1 < grid[0].length) {
            this.dfs(grid, row , col+1, currentProd * grid[row][col + 1]);
        }
    }
}
