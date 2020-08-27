package leetcode.oo.dp;

/**
 * Longest Increasing Subsequence.
 * See {@link <a href ="https://leetcode.com/problems/longest-increasing-subsequence/">https://leetcode.com/problems/longest-increasing-subsequence/</a>}
 */
final class IncreasingSequence {

    int lengthOfLIS(final int[] nums) {
        final int[] dp = new int[nums.length];
        dp[0] = 1;
        int longest = 0;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            longest = Math.max(dp[i], longest);
        }
        return longest;
    }
}
