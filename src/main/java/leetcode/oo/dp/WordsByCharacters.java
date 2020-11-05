package leetcode.oo.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Find Words That Can Be Formed by Characters.
 * See {@link <a href ="https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/">https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/</a>}
 */
final class WordsByCharacters {

    int countCharacters(final String[] words, final String chars) {
        final Map<Character, Integer> charsCnt = new HashMap<>(chars.length());
        for (int i = 0; i < chars.length(); i++) {
            charsCnt.merge(chars.charAt(i), 1, Integer::sum);
        }
        int length = 0;
        for (final String word : words) {
            if (this.canBuild(word, charsCnt)) {
                length += word.length();
            }
        }
        return length;
    }

    private boolean canBuild(final String word, final Map<Character, Integer> cnt) {
        final Map<Character, Integer> wordCnt = new HashMap<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            wordCnt.merge(word.charAt(i), 1, Integer::sum);
        }
        return wordCnt.entrySet()
            .stream()
            .allMatch(entry -> entry.getValue() <= cnt.getOrDefault(entry.getKey(), -1));
    }
}
