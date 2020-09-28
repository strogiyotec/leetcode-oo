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
        while (left <= nums.length) {
            if (currentSum >= sum) {
                length = Math.min(length, right - left );
                currentSum -= nums[left++];
            } else {
                if(right == nums.length){
                    break;
                }
                currentSum += nums[right++];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
