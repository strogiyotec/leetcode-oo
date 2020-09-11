package leetcode.oo.arrays;

/**
 * Remove element.
 * See {@link <a href ="https://leetcode.com/problems/remove-element/">https://leetcode.com/problems/remove-element/</a>}
 */
final class RemoveElement {

    int removeElement(final int[] nums, final int val) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left++] = nums[i];
            }
        }
        return left;
    }
}
