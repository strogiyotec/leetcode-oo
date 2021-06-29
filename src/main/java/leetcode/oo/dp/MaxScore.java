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

    private int dp(final int[][] dp, final int[] nums, final int[] multipliers, final int left, final int cnt, final int right) {
        if (cnt >= multipliers.length) {
            return 0;
        }
        if (dp[left][cnt] != -1) {
            return dp[left][cnt];
        }
        int leftScore = multipliers[cnt] * nums[left] + this.dp(dp, nums, multipliers, left + 1, cnt + 1, right);
        int rightScore = multipliers[cnt] * nums[right] + this.dp(dp, nums, multipliers, left, cnt + 1, right - 1);
        dp[left][cnt] = Math.max(leftScore,rightScore);
        return dp[left][cnt];
    }

}
