package leetcode.oo.dp.backtracking;

/**
 * Coin Change 2.
 * See {@link <a href ="https://leetcode.com/problems/coin-change-2/">https://leetcode.com/problems/coin-change-2/</a>}
 */
final class CoinChange2 {

    int change(final int amount, final int[] coins) {
        final int[][] dp = new int[coins.length + 1][amount + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= coins.length; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= amount; j++) {
                dp[i][j] += dp[i - 1][j];
                final int diff = j - coins[i - 1];
                if (diff >= 0) {
                    dp[i][j] += dp[i][diff];
                }
            }
        }
        return dp[coins.length][amount];
    }

}
