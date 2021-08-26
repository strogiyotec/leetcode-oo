package leetcode.oo.arrays;

/**
 * Kth largest element.
 * See {@link <a href ="https://leetcode.com/problems/kth-largest-element-in-an-array/">https://leetcode.com/problems/kth-largest-element-in-an-array/</a>}
 */
final class KthLargest {

    int findKthLargest(final int[] nums, final int position) {
        return this.quickSelect(
            nums,
            0,
            nums.length - 1,
            nums.length - position
        );
    }

    private int quickSelect(final int[] nums, final int left, final int right, final int k) {
        int pivot = nums[right];
        int index = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivot) {
                final int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        final int temp = nums[right];
        nums[right] = nums[index];
        nums[index] = temp;
        if (index > k) {
            return this.quickSelect(nums, left, index - 1, k);
        } else if (index < k) {
            return this.quickSelect(nums, index + 1, right, k);
        } else {
            return nums[index];
        }
    }
}
