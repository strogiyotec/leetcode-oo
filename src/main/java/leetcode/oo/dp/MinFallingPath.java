package leetcode.oo.dp;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-falling-path-sum/
final class MinFallingPath {

    public int minFallingPathSum(final int[][] matrix) {
        final int[][] dp = new int[matrix.length][matrix[0].length];
        for (final int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int min = Integer.MAX_VALUE;
        for (int col = 0; col < matrix[0].length; col++) {
            min = Math.min(
                min,
                this.dfs(dp, matrix, 0, col)
            );
        }
        return min;
    }

    private int dfs(final int[][] dp, final int[][] matrix, final int row, final int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if(row == matrix.length-1){
            return matrix[row][col];
        }
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        int left = this.dfs(dp, matrix, row + 1, col - 1);
        if (left != Integer.MAX_VALUE) {
            left += matrix[row][col];
        }
        int right = this.dfs(dp, matrix, row + 1, col + 1);
        if (right != Integer.MAX_VALUE) {
            right += matrix[row][col];
        }
        int down = this.dfs(dp, matrix, row + 1, col);
        if (down != Integer.MAX_VALUE) {
            down += matrix[row][col];
        }
        int min = Math.min(
            left,
            Math.min(
                right,
                down
            )
        );
        dp[row][col] = min;
        return min;
    }
}
