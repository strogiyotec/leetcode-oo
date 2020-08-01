package leetcode.oo.pointers;

/**
 * Squares of a Sorted Array.
 * See {@link <a href ="https://leetcode.com/problems/squares-of-a-sorted-array/">https://leetcode.com/problems/squares-of-a-sorted-array/</a>}
 */
final class SquaresSortedArray {

    int[] sortedSquares(final int[] sorted) {
        final int[] temp = new int[sorted.length];
        int left = 0;
        int right = sorted.length - 1;
        int index = sorted.length - 1;
        while (index >= 0) {
            final int leftElement = sorted[left] * sorted[left];
            final int rightElement = sorted[right] * sorted[right];
            if (rightElement > leftElement) {
                temp[index--] = rightElement;
                right--;
            } else {
                temp[index--] = leftElement;
                left++;
            }
        }
        return temp;
    }
}
