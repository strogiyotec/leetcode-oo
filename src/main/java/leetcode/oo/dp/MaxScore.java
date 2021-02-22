package leetcode.oo.dp;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/
final class MaxScore {

    int maximumScore(int[] nums, int[] multipliers) {
        final int[][] dp = new int[multipliers.length][multipliers.length];
        for (final int[] ar : dp) {
            Arrays.fill(ar, -1);
        }
        return this.maximumScore(nums, multipliers, 0, 0, dp);
    }

    private int maximumScore(
        final int[] nums,
        final int[] multipliers,
        final int left,
        final int peekedCnt,
        final int[][] dp
    ) {
        if (peekedCnt == multipliers.length) {
            return 0;
        }
        if (dp[left][peekedCnt] != -1) {
            return dp[left][peekedCnt];
        }
        final int fromLeft = multipliers[peekedCnt] * nums[left] + this.maximumScore(nums, multipliers, left + 1, peekedCnt + 1, dp);
        final int fromRight = multipliers[peekedCnt] * nums[nums.length - (peekedCnt - left) - 1] + this.maximumScore(nums, multipliers, left, peekedCnt + 1, dp);
        dp[left][peekedCnt] = Math.max(
            fromLeft,
            fromRight
        );
        return dp[left][peekedCnt];
    }
}
