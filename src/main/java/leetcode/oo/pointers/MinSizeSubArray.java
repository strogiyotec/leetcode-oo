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
        int minIter = Integer.MAX_VALUE;
        while (true) {
            if (currentSum >= sum) {
                minIter = Math.min(minIter, right - left);
                currentSum -= nums[left++];
            } else {
                if (right < nums.length) {
                    currentSum += nums[right++];
                } else {
                    break;
                }
            }
        }
        return minIter == Integer.MAX_VALUE ? 0 : minIter;
    }
}
