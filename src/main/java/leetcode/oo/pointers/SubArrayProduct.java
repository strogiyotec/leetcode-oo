package leetcode.oo.pointers;

/**
 * Subarray Product Less Than K.
 * See {@link <a href ="https://leetcode.com/problems/subarray-product-less-than-k/">https://leetcode.com/problems/subarray-product-less-than-k/</a>}
 */
final class SubArrayProduct {

    int numSubarrayProductLessThanK(final int[] nums, final int sum) {
        int left = 0;
        int ans = 0;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            while (product >= sum) {
                product /= nums[left++];
            }
            ans += i - left + 1;
        }
        return ans;
    }
}
