package leetcode.oo.window;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Repeating Character Replacement.
 * See {@link <a href ="https://leetcode.com/problems/longest-repeating-character-replacement/">https://leetcode.com/problems/longest-repeating-character-replacement/</a>}.
 */
final class LongestRepCharRepl {

    int characterReplacement(final String word, final int replacement) {
        final Map<Character, Integer> counter = new HashMap<>(26);
        int max = 0;
        int left = 0;
        int maxCnt = 0;
        for (int right = 0; right < word.length(); right++) {
            maxCnt = Math.max(
                maxCnt,
                counter.merge(word.charAt(right), 1, Integer::sum)
            );
            if (right - left + 1 - maxCnt > replacement) {
                counter.computeIfPresent(word.charAt(left++), (c, val) -> val - 1);
            }
            max = Math.max(right - left + 1, max);
        }
        return max;
    }
}
