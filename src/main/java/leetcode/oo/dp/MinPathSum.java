package leetcode.oo.dp;


/**
 * Minimum Path Sum.
 * See {@link <a href ="https://leetcode.com/problems/minimum-path-sum/">https://leetcode.com/problems/minimum-path-sum/</a>}
 */
final class MinPathSum {

    int minPathSum(int[][] grid) {
        final int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                dp[i][j] = grid[i][j];
                //then check left and top
                if (i > 0 && j > 0) {
                    dp[i][j] += Math.min(dp[i][j - 1], dp[i - 1][j]);
                } else if (i >= 1) {
                    dp[i][j] += dp[i - 1][j];
                } else if (j >= 1) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
