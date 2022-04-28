package leetcode.oo.arrays;

import java.util.stream.IntStream;

//https://leetcode.com/problems/maximum-sum-circular-subarray/
final class MaxSumCircularSubArray {

    public int maxSubarraySumCircular(final int[] nums) {
        final int nonOverlapMax = findMaxSub(nums);
        final int min = findMinSub(nums);
        final int totalSum = IntStream.of(nums).sum();
        if(totalSum == min){
            return nonOverlapMax;
        }
        return Math.max(nonOverlapMax, totalSum - min);
    }

    private static int findMaxSub(final int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }

    private static int findMinSub(final int[] nums) {
        int min = nums[0];
        int currentMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMin = Math.min(currentMin + nums[i], nums[i]);
            min = Math.min(min, currentMin);
        }
        return min;
    }
}
