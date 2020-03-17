package leetcode.oo.sliding.window;

import java.util.HashMap;
import java.util.Map;

/**
 * Minimum Window Substring.
 * See {@link <a href ="https://leetcode.com/problems/minimum-window-substring/">https://leetcode.com/problems/minimum-window-substring/</a>}
 */
public final class LongestUniqueSubString {

    /**
     * Find min window string.
     *
     * @param text    Whole text
     * @param pattern Pattern
     * @return Min substring
     */
    @SuppressWarnings({"LineLength", "ExecutableStatementCount"})
    public String minWindow(final String text, final String pattern) {
        final Map<Character, Integer> patternCounter = new HashMap<>(pattern.length(), 1);
        final Map<Character, Integer> windowCounter = new HashMap<>(text.length(), 1);
        this.countChars(patternCounter, pattern);
        String minSubstring = null;
        int left = 0;
        int right = 0;
        int matchedSize = 0;
        int minWindowSize = Integer.MAX_VALUE;
        while (right < text.length()) {
            final Character rightChar = text.charAt(right);
            final Integer rightCharCnt = this.incrementCntForChar(windowCounter, rightChar);
            if (rightCharCnt.equals(patternCounter.get(rightChar))) {
                matchedSize++;
            }
            while (matchedSize == patternCounter.size()) {
                final Character leftChar = text.charAt(left);
                final int currentWindowSize = right - left;
                if (currentWindowSize < minWindowSize) {
                    minWindowSize = currentWindowSize;
                    minSubstring = text.substring(left, right + 1);
                }
                final Integer leftCharCnt = this.decrementCntForChar(windowCounter, leftChar);
                final Integer patternLeftCnt = patternCounter.getOrDefault(leftChar, -1);
                if (patternLeftCnt != -1 && leftCharCnt < patternLeftCnt) {
                    matchedSize--;
                }
                left++;
            }
            right++;
        }
        return minSubstring == null ? "" : minSubstring;
    }


    /**
     * Count appearance of each char.
     * Count appearance of each char from text
     * and storage counter for char in given storage
     *
     * @param storage Storage to store counts
     * @param text    Text
     */
    private void countChars(
            final Map<Character, Integer> storage,
            final String text
    ) {
        for (int i = 0; i < text.length(); i++) {
            this.incrementCntForChar(storage, text.charAt(i));
        }
    }

    /**
     * Increment counter for given char.
     * If storage doesn't have this char
     * then put 1 , otherwise increment
     * existing counter
     *
     * @param storage   Storage to store counts
     * @param character Character
     * @return Incremented counter for given char
     */
    private Integer incrementCntForChar(
            final Map<Character, Integer> storage,
            final Character character
    ) {
        storage.putIfAbsent(character, 0);
        return storage.computeIfPresent(
                character,
                (key, count) -> ++count
        );
    }

    /**
     * Decrement counter for character in storage.
     *
     * @param storage   Storage
     * @param character Character
     * @return Decremented counter for given char
     */
    private Integer decrementCntForChar(
            final Map<Character, Integer> storage,
            final Character character
    ) {
        return storage.computeIfPresent(
                character,
                (key, count) -> --count
        );
    }
}
