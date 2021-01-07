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
        final int[] memo = new int[amount];
        memo[0] = 1;
        memo[1] = 2;
        for (int i = 2; i < amount; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[amount-1];
    }
}
