package leetcode.oo.dp.backtracking;

import java.util.Arrays;

/**
 * Coin Change.
 * See {@link <a href ="https://leetcode.com/problems/coin-change/">https://leetcode.com/problems/coin-change/</a>}
 */
final class CoinChange {

    int count(final int[] coins, final int sum) {
        Arrays.sort(coins);
        final int length = sum + 1;
        final int[] dp = new int[length];
        Arrays.fill(dp, sum+1);
        dp[0] = 0;
        for (int currentSum = 1; currentSum <= sum; currentSum++) {
            for (final int coin : coins) {
                int diff = currentSum - coin;
                if (diff >= 0) {
                    dp[currentSum] = Math.min(dp[currentSum], 1 + dp[diff]);
                }
            }
        }
        if (dp[sum] == sum+1) {
            return -1;
        }
        return dp[sum];
    }
}
