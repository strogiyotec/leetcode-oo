package leetcode.oo.pointers;

/**
 * Reverse String.
 * See {@link <a href ="https://leetcode.com/problems/reverse-string/">https://leetcode.com/problems/reverse-string/</a>}
 */
final class ReverseString {

    void reverseString(final char[] word) {
        if (word.length == 0) {
            return;
        }
        int left = 0;
        int right = word.length - 1;
        while (left <= right) {
            final char temp = word[left];
            word[left++] = word[right];
            word[right--] = temp;
        }
    }

}
