package leetcode.oo.window;

import java.util.HashMap;
import java.util.Map;

/**
 * Minimum Window Substring.
 * See {@link <a href ="https://leetcode.com/problems/minimum-window-substring/">https://leetcode.com/problems/minimum-window-substring/</a>}
 */
public final class MinWindowSubstring {

    /**
     * Find min window string.
     *
     * @param text    Whole text
     * @param pattern Pattern
     * @return Min substring
     */
    @SuppressWarnings({"LineLength", "ExecutableStatementCount"})
    public String minWindow(final String text, final String pattern) {
        final Map<Character, Integer> patternCnt = new HashMap<>(pattern.length() << 1);
        for (int i = 0; i < pattern.length(); i++) {
            patternCnt.merge(pattern.charAt(i), 1, Integer::sum);
        }
        int left = 0;
        int minLeft = -1;
        int minRight = -1;
        int result = Integer.MAX_VALUE;
        int matchedCnt = 0;
        final Map<Character, Integer> textCnt = new HashMap<>(text.length() << 1);
        for (int right = 0; right < text.length(); right++) {
            final Integer cnt = textCnt.merge(text.charAt(right), 1, Integer::sum);
            if (cnt.equals(patternCnt.getOrDefault(text.charAt(right), 0))) {
                matchedCnt++;
            }
            while (matchedCnt == patternCnt.size() && left <= right) {
                if (right - left + 1 < result) {
                    minRight = right;
                    minLeft = left;
                    result = right - left + 1;
                }
                final Integer leftCnt = textCnt.computeIfPresent(text.charAt(left), (character, integer) -> integer - 1);
                if (leftCnt < patternCnt.getOrDefault(text.charAt(left), 0)) {
                    matchedCnt--;
                }
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? "" : text.substring(minLeft, minRight+1);
    }
}
