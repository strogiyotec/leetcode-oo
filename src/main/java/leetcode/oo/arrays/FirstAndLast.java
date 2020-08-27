package leetcode.oo.arrays;

/**
 * Find First and Last Position of Element in Sorted Array.
 * See {@link <a href ="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/</a>}
 */
final class FirstAndLast {

    int[] searchRange(final int[] nums, final int target) {
        final int[] solution = new int[]{-1, -1};
        solution[0] = this.findFirst(nums, target);
        solution[1] = this.findLast(nums, target, solution[0] == -1 ? 0 : solution[0]);
        return solution;
    }

    private int findLast(final int[] nums, final int target, int start) {
        int index = -1;
        int end = nums.length - 1;
        while (start <= end) {
            final int mid = (end + start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

    private int findFirst(final int[] nums, final int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            final int mid = (end + start) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
