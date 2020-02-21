package leetcode.oo.sliding.window;

import java.util.*;

/**
 * Substring with Concatenation of All Words.
 * See {@link <a href ="https://leetcode.com/problems/substring-with-concatenation-of-all-words/">https://leetcode.com/problems/substring-with-concatenation-of-all-words/</a>}
 */
public final class AllWordsSubstring {

    /**
     * Find begin indexes of all matched substrings.
     *
     * @param text  Text
     * @param words Array of words
     * @return Begin indexes
     */
    public List<Integer> findSubstring(
            final String text,
            final String[] words
    ) {
        final int amountOfWords = words.length;
        if (amountOfWords == 0) {
            return Collections.emptyList();
        }
        final Map<String, Integer> wordsCnt =
                new HashMap<>(amountOfWords + 1, 1);
        this.increment(wordsCnt, words);
        final int wordLength = words[0].length();
        final int textLength = text.length();
        final List<Integer> indexes = new ArrayList<>(textLength + 1);
        for (int i = 0;
             i < (textLength + 1) - (amountOfWords * wordLength);
             i++) {
            final String window =
                    text.substring(
                            i,
                            i + (amountOfWords * wordLength)
                    );
            final Map<String, Integer> windowCnt =
                    this.windowCount(wordLength, window);
            if (windowCnt.equals(wordsCnt)) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    /**
     * Count amount of words from given window.
     *
     * @param wordLength Length of single word
     * @param window     Text
     * @return Map where key is word and value is
     * amount of times this word appeared in window
     */
    private Map<String, Integer> windowCount(
            final int wordLength,
            final String window
    ) {
        final Map<String, Integer> windowCnt = new HashMap<>();
        for (int i = 0; i < window.length(); i += wordLength) {
            final String word = window.substring(i, i + wordLength);
            this.increment(windowCnt, word);
        }
        return windowCnt;
    }

    /**
     * Increment counter for each word in given map.
     *
     * @param wordsCnt Map where key is word and value is counter
     * @param words    Array of words
     */
    private void increment(
            final Map<String, Integer> wordsCnt,
            final String[] words
    ) {
        for (int i = 0; i < words.length; i++) {
            this.increment(wordsCnt, words[i]);
        }
    }

    /**
     * Increment counter for given word in given map.
     *
     * @param wordsCnt Map where key is word and value is counter
     * @param word     Increment counter for this word
     */
    private void increment(
            final Map<String, Integer> wordsCnt,
            final String word
    ) {
        wordsCnt.putIfAbsent(word, 0);
        wordsCnt.computeIfPresent(word, (key, value) -> ++value);
    }


}
