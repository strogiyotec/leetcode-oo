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
        final Map<Character, Integer> cache = new HashMap<>(pattern.length() + 2, 1);
        for (int i = 0; i < pattern.length(); i++) {
            cache.merge(pattern.charAt(i), 1, Integer::sum);
        }
        String minWindow = null;
        final Map<Character, Integer> window = new HashMap<>(text.length() + 2, 1);
        int windowPos = 0;
        int minSize = Integer.MAX_VALUE;
        int windowSize = 0;
        int matchedCnt = 0;
        for (int i = 0; i < text.length(); i++) {
            final Character c = text.charAt(i);
            if (cache.getOrDefault(c, 0).equals(window.merge(c, 1, Integer::sum))) {
                matchedCnt++;
            }
            windowSize++;
            while (matchedCnt == cache.size()) {
                if (minSize >= windowSize) {
                    minSize = windowSize;
                    minWindow = text.substring(windowPos, i + 1);
                }
                final Character leftChar = text.charAt(windowPos++);
                final Integer cacheValue = cache.getOrDefault(leftChar, -1);
                if (cacheValue != -1 && window.computeIfPresent(leftChar, (key, val) -> val - 1) < cacheValue) {
                    matchedCnt--;
                }
                windowSize--;
            }
        }
        return minWindow == null ? "" : minWindow;
    }
}
