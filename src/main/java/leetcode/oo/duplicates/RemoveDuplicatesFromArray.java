package leetcode.oo.duplicates;

/**
 * Remove Duplicates from Sorted Array.
 * See {@link <a href ="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">https://leetcode.com/problems/remove-duplicates-from-sorted-array/</a>}.
 */
final class RemoveDuplicatesFromArray {

    /**
     * Count amount of unique numbers in array.
     * Original array should be modified
     * so all unique sorted numbers should be in the left
     * Solution doesn't care about other parts of array
     * Eg.
     * Original array = 1,2,2,3,4
     * Modified = 1,2,3,4,4
     * As you can see all unique sorted parts are in the left
     * @param nums Array of sorted numbers
     * @return Amount of unique numbers
     */
    int removeDuplicates(final int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return left == 0 ? 0 : left + 1;
    }
}
