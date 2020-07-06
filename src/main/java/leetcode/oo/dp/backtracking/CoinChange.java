package leetcode.oo.dp.backtracking;

import java.util.Arrays;


/**
 * Coin Change.
 * See {@link <a href ="https://leetcode.com/problems/coin-change/">https://leetcode.com/problems/coin-change/</a>}
 */
final class CoinChange {


    int count(final int[] coins, final int sum) {
        final int[] dp = new int[sum + 1];
        Arrays.fill(dp, sum + 1);
        dp[0] = 0;
        for (int i = 1; i <= sum; i++) {
            for (final int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[sum];
    }
}
