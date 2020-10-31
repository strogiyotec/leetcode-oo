package leetcode.oo.dp;

import java.util.Arrays;


/**
 * Number of Longest Increasing Subsequence
 * See {@link <a href ="https://leetcode.com/problems/number-of-longest-increasing-subsequence/">https://leetcode.com/problems/number-of-longest-increasing-subsequence/</a>}
 */
final class IncSequences {

    @SuppressWarnings("ALL")
    int findNumberOfLIS(final int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        final int[] dp = new int[nums.length];
        final int[] count = new int[nums.length];
        Arrays.fill(count, 1);
        int max = -1;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] >= dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
            }
            if (max < dp[i]) {
                max = dp[i];
                res = count[i];
            } else if (max == dp[i]) {
                res += count[i];
            }
        }
        return res;
    }
}
