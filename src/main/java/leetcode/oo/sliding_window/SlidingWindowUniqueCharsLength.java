package leetcode.oo.sliding_window;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest unique chars sequence using sliding window.
 * See {@link <a href ="https://leetcode.com/problems/longest-substring-without-repeating-characters/">https://leetcode.com/problems/longest-substring-without-repeating-characters/</a>}
 */
public final class SlidingWindowUniqueCharsLength {

    /**
     * Find longest unique sequence length.
     *
     * @param text Given string
     * @return Length
     */
    public int lengthOfLongestSubstring(final String text) {
        final int textLength = text.length();
        final Set<Character> window = new HashSet<>(textLength);
        int longestLength = 0;
        int leftPosition = 0;
        int rightPosition = 0;
        while (rightPosition < textLength) {
            final char character = text.charAt(rightPosition);
            if (window.add(character)) {
                longestLength =
                        Math.max(
                                longestLength,
                                ++rightPosition - leftPosition
                        );
            } else {
                window.remove(text.charAt(leftPosition++));
            }
        }
        return longestLength;
    }
}