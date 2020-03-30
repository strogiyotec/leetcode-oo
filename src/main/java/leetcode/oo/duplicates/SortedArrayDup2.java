package leetcode.oo.duplicates;

/**
 * Remove Duplicates from Sorted Array.
 * See {@link <a href ="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/">https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/</a>}.
 */
public final class SortedArrayDup2 {

    /**
     * Max allowed duplicates.
     */
    private static final int ALLOWED_DUP = 2;


    /**
     * Count amount of unique numbers in array.
     * Max two the same numbers are allowed
     * Original array should be modified
     * so all unique sorted numbers should be in the left
     * Solution doesn't care about other parts of array
     * Eg.
     * Original array = 1,2,2,2,3,4
     * Modified = [1,2,2,3],3
     * As you can see all unique sorted parts are in the left
     *
     * @param array Array of sorted numbers
     * @return Amount of unique numbers
     */
    public int removeDuplicates(final int[] array) {
        final int length = array.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return 1;
        }
        int uniqueCnt = ALLOWED_DUP;
        for (int i = ALLOWED_DUP; i < length; i++) {
            if (array[uniqueCnt - ALLOWED_DUP] != array[i]) {
                array[uniqueCnt++] = array[i];
            }
        }
        return uniqueCnt;
    }
}
