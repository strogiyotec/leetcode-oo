package leetcode.oo.arrays;


/**
 * Plus one.
 * See {@link <a href ="https://leetcode.com/problems/plus-one/">https://leetcode.com/problems/plus-one/</a>}
 */
final class PlusOne {

    int[] plusOne(final int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        final int[] allocated = new int[digits.length + 1];
        allocated[0] = 1;
        return allocated;
    }
}
