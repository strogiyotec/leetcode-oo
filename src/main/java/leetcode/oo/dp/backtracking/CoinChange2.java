package leetcode.oo.dp.backtracking;

import java.util.Arrays;

/**
 * Coin Change 2.
 * See {@link <a href ="https://leetcode.com/problems/coin-change-2/">https://leetcode.com/problems/coin-change-2/</a>}
 */
final class CoinChange2 {

    int change(final int amount, final int[] coins) {
        final int[][] dp = new int[amount + 1][coins.length + 1];
        for (final int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return helper(coins, amount, dp, 0);
    }

    private int helper(final int[] coins, final int amount, int[][] dp, final int index) {
        if (dp[amount][index] != -1) {
            return dp[amount][index];
        }
        if (amount == 0) {
            return 1;
        }
        int cnt = 0;
        for (int i = index; i < coins.length; i++) {
            if (coins[i] <= amount) {
                cnt += this.helper(coins, amount - coins[i], dp, i);
            }
        }
        dp[amount][index] = cnt;
        return cnt;
    }

}
