package leetcode.oo.pointers;

/**
 * Minimum Size Subarray Sum.
 * See {@link <a href ="https://leetcode.com/problems/minimum-size-subarray-sum/">https://leetcode.com/problems/minimum-size-subarray-sum/</a>}
 */
final class MinSizeSubArray {

    int minSubArrayLen(final int sum, final int[] nums) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int length = Integer.MAX_VALUE;
        do {
            while (currentSum >= sum) {
                length = Math.min(length, right - left);
                currentSum -= nums[left];
                left++;
            }
            if (right < nums.length) {
                currentSum += nums[right];
                right++;
            } else{
                break;
            }
        } while (right <= nums.length);
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
