package leetcode.oo.dp;


/**
 * Climbing stairs.
 * See {@link <a href ="https://leetcode.com/problems/climbing-stairs/">https://leetcode.com/problems/climbing-stairs/</a>}
 */
final class ClimbStairs {

    int climbStairs(int amount) {
        if (amount == 1 || amount == 2) {
            return amount;
        }
        final int[] dp = new int[amount + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= amount; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[amount];
    }
}
