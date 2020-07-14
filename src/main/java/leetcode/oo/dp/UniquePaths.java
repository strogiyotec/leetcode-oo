package leetcode.oo.dp;

/**
 * Unique Paths.
 * See {@link <a href ="https://leetcode.com/problems/unique-paths/">https://leetcode.com/problems/unique-paths/</a>}
 */
final class UniquePaths {

    int uniquePaths(int length, int width) {
        if (length == 1 && width == 1) {
            return 1;
        }
        final int[][] dp = new int[length][width];
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[length - 1][width - 1];
    }
}
