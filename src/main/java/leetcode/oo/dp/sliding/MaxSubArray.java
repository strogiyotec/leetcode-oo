package leetcode.oo.dp.sliding;


/**
 * Maximum Subarray.
 * See {@link <a href ="https://leetcode.com/problems/maximum-subarray/">https://leetcode.com/problems/maximum-subarray/</a>}
 */
final class MaxSubArray {

    int maxSubArray(final int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            max = Math.max(currentMax, max);
        }
        return max;
    }

    int bruteForce(final int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

}
