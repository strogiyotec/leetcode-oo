package leetcode.oo.dp;

/**
 * House Robber.
 * See {@link <a href ="https://leetcode.com/problems/house-robber/">https://leetcode.com/problems/house-robber/</a>}
 */
final class HouseRobber {
    int rob(final int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            return this.dpApproach(nums);
        }
    }


    private int dpApproach(final int[] nums) {
        final int[] dp = new int[nums.length + 1];
        int max = 0;
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            final int dpIndex = i + 1;
            if (i == 1) {
                dp[dpIndex] = nums[i] + dp[0];
            } else {
                dp[dpIndex] = nums[i] + Math.max(dp[dpIndex - 2], dp[dpIndex - 3]);
            }
            max = Math.max(dp[dpIndex], max);
        }
        return max;
    }

}
