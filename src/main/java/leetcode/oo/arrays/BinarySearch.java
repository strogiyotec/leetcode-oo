package leetcode.oo.arrays;

/**
 * Binary Search.
 * See {@link <a href ="https://leetcode.com/problems/binary-search/">https://leetcode.com/problems/binary-search/</a>}
 */
public final class BinarySearch {

    public int search(final int[] nums, final int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            final int middle = (right + left) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] == target) {
                return middle;
            }
        }
        return -1;
    }
}
