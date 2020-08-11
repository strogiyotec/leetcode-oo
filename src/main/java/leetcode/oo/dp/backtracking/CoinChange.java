package leetcode.oo.dp.backtracking;

import java.util.Arrays;

/**
 * Coin Change.
 * See {@link <a href ="https://leetcode.com/problems/coin-change/">https://leetcode.com/problems/coin-change/</a>}
 */
final class CoinChange {


    int count(final int[] coins, final int sum) {
        final int max = sum + 1;
        final int[] dp = new int[max];
        Arrays.sort(coins);
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i < max; i++) {
            for (final int coin : coins) {
                final int diff = i - coin;
                if (diff >= 0) {
                    dp[i] = Math.min(dp[i], dp[diff] + 1);
                }
            }
        }
        return dp[sum];
    }
}
