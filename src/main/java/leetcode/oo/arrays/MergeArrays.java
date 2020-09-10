package leetcode.oo.arrays;

/**
 * Merge sorted arrays.
 * See {@link <a href ="https://leetcode.com/problems/merge-sorted-array/">https://leetcode.com/problems/merge-sorted-array/</a>}.
 */
public final class MergeArrays {

    public void merge(final int[] first, final int firstLength, final int[] second, final int secondLength) {
        int left = 0;
        int right = 0;
        int pos = 0;
        final int[] temp = new int[first.length];
        while (left < firstLength && right < secondLength) {
            if (first[left] < second[right]) {
                temp[pos++] = first[left++];
            } else {
                temp[pos++] = second[right++];
            }
        }
        while (left < firstLength) {
            temp[pos++] = first[left++];
        }
        while (right < secondLength) {
            temp[pos++] = second[right++];
        }

        System.arraycopy(temp, 0, first, 0, first.length);
    }
}
