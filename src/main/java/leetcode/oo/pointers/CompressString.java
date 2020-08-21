package leetcode.oo.pointers;


/**
 * Compress string.
 * See {@link <a href ="https://leetcode.com/problems/string-compression/">https://leetcode.com/problems/string-compression/</a>}.
 */
final class CompressString {

    int compress(final char[] chars) {
        int left = 0;
        int index = 0;
        while (left < chars.length) {
            int right = left;
            while (right < chars.length && chars[left] == chars[right]) {
                right++;
            }
            chars[index++] = chars[left];
            if (right - left > 1) {
                final String number = String.valueOf(right - left);
                for (int i = 0; i < number.length(); i++) {
                    chars[index++] = number.charAt(i);
                }
            }
            left = right;
        }
        return index;
    }
}

