package leetcode.oo.dp;

/**
 * House Robber.
 * See {@link <a href ="https://leetcode.com/problems/house-robber/">https://leetcode.com/problems/house-robber/</a>}
 */
final class HouseRobber {

    int rob(final int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        final int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }

}
