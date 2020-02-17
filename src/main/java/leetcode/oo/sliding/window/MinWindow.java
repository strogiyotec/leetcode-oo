package leetcode.oo.sliding.window;

import java.util.HashMap;
import java.util.Map;

/**
 * Minimum Window Substring.
 * See {@link <a href ="https://leetcode.com/problems/longest-substring-without-repeating-characters/">https://leetcode.com/problems/minimum-window-substring/</a>}
 */
public final class MinWindow {

    /**
     * Find min window string.
     *
     * @param text    Whole text
     * @param pattern Pattern
     * @return Min substring
     */
    public String minWindow(final String text, final String pattern) {
        final Map<Character, Integer> patternCounter =
                new HashMap<>(pattern.length(), 1);
        final Map<Character, Integer> windowCounter =
                new HashMap<>(text.length(), 1);
        final StringBuilder minWindowValue = new StringBuilder(text.length());
        this.incrementCharCounter(patternCounter, pattern);
        int left = 0;
        int right = 0;
        int matchedSize = 0;
        int minWindowSize = Integer.MAX_VALUE;
        while (right < text.length()) {
            final Character rightChar = text.charAt(right);
            if (this.patternHasChar(rightChar, windowCounter, patternCounter)) {
                matchedSize++;
            }
            while (matchedSize == patternCounter.size()) {
                final Character leftChar = text.charAt(left);
                final int currentWindowSize = right - left;
                if (currentWindowSize < minWindowSize) {
                    minWindowSize = currentWindowSize;
                    this.updateWindowValue(text, minWindowValue, left, right);
                }
                if (this.windowCounterIsLower(leftChar, windowCounter, patternCounter)) {
                    matchedSize--;
                }
                left++;

            }
            right++;
        }
        return minWindowValue.toString();
    }

    /**
     * Check that given char is present in pattern.
     * Add char to window and check that counters
     * from window and pattern are the same
     *
     * @param character    Character to check
     * @param windowChars  Window chars counter
     * @param patternChars Pattern chars counter
     * @return True if counters are the same
     */
    private boolean patternHasChar(
            final Character character,
            final Map<Character, Integer> windowChars,
            final Map<Character, Integer> patternChars
    ) {
        this.incrementCharCounter(windowChars, character);
        return windowChars.get(character).equals(patternChars.get(character));
    }

    /**
     * Check if window misses character from pattern.
     * Decrement counter of character
     * from window and then check that counters
     * im window and pattern are the same for
     * given char
     *
     * @param character    Character to check
     * @param windowChars  Window chars counter
     * @param patternChars Pattern chars counter
     * @return True if counters are the same
     */
    private boolean windowCounterIsLower(
            final Character character,
            final Map<Character, Integer> windowChars,
            final Map<Character, Integer> patternChars
    ) {
        windowChars.computeIfPresent(
                character,
                (key, counter) -> --counter
        );
        final Integer patternCount = patternChars.getOrDefault(character, -1);
        return patternCount != -1 && windowChars.get(character) < patternCount;
    }

    /**
     * Update min sub window value.
     *
     * @param text      Original text
     * @param minWindow Min window storage
     * @param left      Left index
     * @param right     Right index
     */
    private void updateWindowValue(
            final String text,
            final StringBuilder minWindow,
            final int left,
            final int right
    ) {
        minWindow.delete(0, minWindow.length());
        minWindow.append(text.substring(left, right + 1));
    }

    /**
     * Increment chars appearance from text in given counter.
     * Counter is the map where key is char
     * and value is amount times this character appears in text
     *
     * @param counter Counter to store chars
     * @param text    Text
     */
    private void incrementCharCounter(
            final Map<Character, Integer> counter,
            final String text
    ) {
        for (int i = 0; i < text.length(); i++) {
            final Character character = text.charAt(i);
            this.incrementCharCounter(counter, character);
        }
    }

    /**
     * Increment counter for given character.
     * Counter is the map where key is char
     * and value is amount times this character appears in text
     *
     * @param counter   Counter to store chars
     * @param character Character
     */
    private void incrementCharCounter(
            final Map<Character, Integer> counter,
            final Character character
    ) {
        counter.putIfAbsent(character, 0);
        counter.computeIfPresent(character, (key, count) -> ++count);
    }
}
