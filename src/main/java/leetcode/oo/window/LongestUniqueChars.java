package leetcode.oo.window;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest unique chars sequence using sliding window.
 * See {@link <a href ="https://leetcode.com/problems/longest-substring-without-repeating-characters/">https://leetcode.com/problems/longest-substring-without-repeating-characters/</a>}
 */
final class LongestUniqueChars {

    /**
     * Find longest unique sequence length.
     *
     * @param text Given string
     * @return Length
     */
    int lengthOfLongestSubstring(final String text) {
        final Set<Character> set = new HashSet<>(text.length());
        int maxSize = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        while (rightPointer < text.length()) {
            final Character c = text.charAt(rightPointer);
            if (set.add(c)) {
                rightPointer++;
                maxSize = Math.max(maxSize, set.size());
            } else {
                set.remove(text.charAt(leftPointer++));
            }
        }
        return maxSize;
    }
}