package leetcode.oo.binarysearch;

import java.util.Arrays;

//https://leetcode.com/problems/split-array-largest-sum/
final class SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        final int[][] dp = new int[nums.length][m + 1];

        for (final int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        return this.walk(nums, dp, 0, m);
    }

    private int walk(int[] nums, int[][] memo, int index, int parts) {
        // base case
        if (index == nums.length && parts == 0) {
            return 0;
        }
        if (index == nums.length || parts == 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[index][parts] != -1) {
            return memo[index][parts];
        }
        int maxSum = Integer.MAX_VALUE;
        int leftSum = 0;
        for (int i = index; i < nums.length; i++) {
            leftSum += nums[i];
            final int rightSum = this.walk(nums, memo, i + 1, parts - 1);
            maxSum = Math.min(maxSum, Math.max(leftSum, rightSum));
        }
        memo[index][parts] = maxSum;
        return maxSum;
    }
}
