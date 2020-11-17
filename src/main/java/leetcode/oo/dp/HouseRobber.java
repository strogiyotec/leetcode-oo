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
        dp[0] = 0;
        dp[1] = nums[0];
        dp[2] = nums[1];
        int max = Math.max(dp[1], dp[2]);
        for (int i = 2; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i - 1], dp[i - 2]) + nums[i];
            max = Math.max(dp[i + 1], max);
        }
        return max;
    }

}
