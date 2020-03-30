package leetcode.oo.duplicates;

/**
 * Remove Duplicates from Sorted Array.
 * See {@link <a href ="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">https://leetcode.com/problems/remove-duplicates-from-sorted-array/</a>}.
 */
public final class SortedArrayDuplicates {

    /**
     * Count amount of unique numbers in array.
     * Original array should be modified
     * so all unique sorted numbers should be in the left
     * Solution doesn't care about other parts of array
     * Eg.
     * Original array = 1,2,2,3,4
     * Modified = 1,2,3,4,4
     * As you can see all unique sorted parts are in the left
     *
     * @param nums Array of sorted numbers
     * @return Amount of unique numbers
     */
    public int removeDuplicates(final int[] nums) {
        final int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return 1;
        }
        int uniqueCnt = 0;
        for (int i = 1; i < length; i++) {
            if (nums[uniqueCnt] != nums[i]) {
                nums[++uniqueCnt] = nums[i];
            }
        }
        return uniqueCnt + 1;
    }
}
