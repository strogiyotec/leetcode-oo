package leetcode.oo.dp;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/
final class MaxScore {

    int maximumScore(int[] nums, int[] multipliers) {
        final int[][] dp = new int[multipliers.length][multipliers.length];
        for (final int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return this.dp(dp, nums, multipliers, 0, 0, nums.length - 1);
    }

    private int dp(final int[][] dp, final int[] nums, final int[] multipliers, final int numStartIndex, final int mIndex, final int numEndIndex) {
        if (mIndex >= multipliers.length) {
            return 0;
        }
        if (dp[mIndex][numStartIndex] != -1) {
            return dp[mIndex][numStartIndex];
        }
        final int left = nums[numStartIndex] * multipliers[mIndex] + this.dp(dp, nums, multipliers, numStartIndex + 1, mIndex + 1, numEndIndex);
        final int right = nums[numEndIndex] * multipliers[mIndex] + this.dp(dp, nums, multipliers, numStartIndex, mIndex + 1, numEndIndex - 1);
        final int max = Math.max(left, right);
        dp[mIndex][numStartIndex] = max;
        return max;
    }

}
