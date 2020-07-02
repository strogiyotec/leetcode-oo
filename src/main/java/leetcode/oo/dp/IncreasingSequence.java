package leetcode.oo.dp;

/**
 * Longest Increasing Subsequence.
 * See {@link <a href ="https://leetcode.com/problems/longest-increasing-subsequence/">https://leetcode.com/problems/longest-increasing-subsequence/</a>}
 */
final class IncreasingSequence {

    int lengthOfLIS(int[] nums) {
        final int[] dp = new int[nums.length];
        dp[0] = 1;
        int length = 0;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max + 1;
            length = Math.max(length, dp[i]);
        }
        return length;
    }
}
