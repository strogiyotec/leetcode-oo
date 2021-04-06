package leetcode.oo.dp;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/stone-game-iii/
final class StoneGame3 {

    String stoneGameIII(final int[] stoneValue) {
        final int sum = IntStream.of(stoneValue).sum();
        final int[] dp = new int[stoneValue.length];
        Arrays.fill(dp, Integer.MIN_VALUE);
        this.search(sum, stoneValue, dp, 0);
        final int alice = dp[0];
        final int bob = sum - alice;
        if (alice > bob) {
            return "Alice";
        }
        if (bob > alice) {
            return "Bob";
        }
        return "Tie";
    }

    private int search(final int sum, final int[] stoneValue, final int[] dp, final int index) {
        if (index >= stoneValue.length) {
            return 0;
        }
        if (dp[index] != Integer.MIN_VALUE) {
            return dp[index];
        }
        int max = Integer.MIN_VALUE;
        max = Math.max(max, sum - this.search(sum - stoneValue[index], stoneValue, dp, index + 1));
        if (index + 1 < stoneValue.length) {
            max = Math.max(max, sum - this.search(sum - stoneValue[index] - stoneValue[index + 1], stoneValue, dp, index + 2));
        }
        if (index + 2 < stoneValue.length) {
            max = Math.max(max, sum - this.search(sum - stoneValue[index] - stoneValue[index + 1] - stoneValue[index + 2], stoneValue, dp, index + 3));
        }
        dp[index] = max == Integer.MIN_VALUE ? 0 : max;
        return dp[index];
    }

}
