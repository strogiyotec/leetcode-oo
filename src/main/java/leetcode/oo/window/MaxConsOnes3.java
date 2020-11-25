package leetcode.oo.window;

/**
 * Max Consecutive Ones III.
 * See {@link <a href ="https://leetcode.com/problems/max-consecutive-ones-iii/">https://leetcode.com/problems/max-consecutive-ones-iii/</a>}.
 */
final class MaxConsOnes3 {

    int longestOnes(final int[] array, int limit) {
        int left = 0;
        for (final int value : array) {
            if (value == 0) {
                limit--;
            }
            if (limit < 0) {
                if (array[left++] == 0) {
                    limit++;
                }
            }
        }
        return array.length - left;
    }
}
