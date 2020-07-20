package leetcode.oo.dp;


/**
 * Minimum Path Sum.
 * See {@link <a href ="https://leetcode.com/problems/minimum-path-sum/">https://leetcode.com/problems/minimum-path-sum/</a>}
 */
final class MinPathSum {

    int minPathSum(int[][] grid) {
        final int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = grid[0][j] + dp[0][j - 1];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = grid[i][j];
                dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
