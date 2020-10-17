package leetcode.oo.arrays;

/**
 * Rotate array.
 * See {@link <a href ="https://leetcode.com/problems/rotate-array/">https://leetcode.com/problems/rotate-array/</a>}
 */
final class RotateArray {

    void rotate(final int[] nums, final int steps) {
        final int[] tmp = new int[nums.length];
        final int length = nums.length;
        for (int i = 0; i < length; i++) {
            tmp[(i + steps) % length] = nums[i];
        }
        System.arraycopy(tmp, 0, nums, 0, length);
    }
}
