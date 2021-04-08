package leetcode.oo.arrays;

//https://leetcode.com/problems/maximum-average-subarray-i/
final class MaxAverage1 {

    double findMaxAverage(final int[] nums, final int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum / k;
        for (int right = k, left = 0; right < nums.length; left++, right++) {
            sum -= nums[left];
            sum += nums[right];
            max = Math.max(max, sum / k);
        }
        return max;
    }
}
