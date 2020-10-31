package leetcode.oo.dp;

/**
 * Longest Increasing Subsequence.
 * See {@link <a href ="https://leetcode.com/problems/longest-increasing-subsequence/">https://leetcode.com/problems/longest-increasing-subsequence/</a>}
 */
final class IncreasingSequence {

    int lengthOfLIS(final int[] nums) {
        final int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i],dp[j]);
                }
            }
            max = Math.max(++dp[i], max);
        }
        return max;
    }
}
