package leetcode.oo.dp;

import java.util.Arrays;

//https://leetcode.com/problems/stone-game-iii/
final class StoneGame3 {

    String stoneGameIII(final int[] stoneValue) {
        final int[] dp = new int[stoneValue.length];
        Arrays.fill(dp, -1);
        int result = this.search(stoneValue, 0, dp);
        if (result > 0) {
            return "Alice";
        } else if (result < 0) {
            return "Bob";
        }
        return "Tie";
    }

    private int search(final int[] stoneValue, final int index, final int[] dp) {
        if (index >= stoneValue.length) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int result = stoneValue[index] - this.search(stoneValue, index + 1, dp);
        if (index + 1 < stoneValue.length) {
            result = Math.max(
                result,
                stoneValue[index] + stoneValue[index + 1] - this.search(stoneValue, index + 2, dp)
            );
        }
        if (index + 2 < stoneValue.length) {
            result = Math.max(
                result,
                stoneValue[index] + stoneValue[index + 1] + stoneValue[index + 2] - this.search(stoneValue, index + 3, dp)
            );
        }
        dp[index] = result;
        return result;
    }

}
