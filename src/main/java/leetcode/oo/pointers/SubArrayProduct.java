package leetcode.oo.pointers;

/**
 * Subarray Product Less Than K.
 * See {@link <a href ="https://leetcode.com/problems/subarray-product-less-than-k/">https://leetcode.com/problems/subarray-product-less-than-k/</a>}
 */
final class SubArrayProduct {

    int numSubarrayProductLessThanK(final int[] nums, final int sum) {
        if (sum <= 1) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int cnt = 0;
        int total = 1;
        while (right < nums.length) {
            total *= nums[right++];
            while (total >= sum) {
                total /= nums[left++];
            }
            cnt += right - left;
        }
        return cnt;
    }
}
