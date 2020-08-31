package leetcode.oo.pointers;


/**
 * Compress string.
 * See {@link <a href ="https://leetcode.com/problems/string-compression/">https://leetcode.com/problems/string-compression/</a>}.
 */
final class CompressString {

    int compress(final char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int left = 0;
        int index = 0;
        while (left < chars.length) {
            int right = left;
            final char c = chars[left];
            while (right < chars.length && chars[left] == chars[right]) right++;
            final int diff = right - left;
            chars[index++] = c;
            if (diff != 1) {
                final String number = String.valueOf(diff);
                for (int i = 0; i < number.length(); i++) {
                    chars[index++] = number.charAt(i);
                }
            }
            left = right;
        }
        return index;
    }
}

