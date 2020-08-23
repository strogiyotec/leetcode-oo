package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Uncommon words.
 * see {@link <a href ="https://leetcode.com/problems/uncommon-words-from-two-sentences/">https://leetcode.com/problems/uncommon-words-from-two-sentences/</a>}.
 */
final class UncommonWords {

    String[] uncommonFromSentences(final String first, final String second) {
        final Map<String, Integer> counts = new HashMap<>(first.length() + second.length());
        for (final String word : first.split(" ")) {
            counts.merge(word, 1, Integer::sum);
        }
        for (final String word : second.split(" ")) {
            counts.merge(word, 1, Integer::sum);
        }
        return counts.entrySet()
                .parallelStream()
                .filter(entry -> entry.getValue().equals(1))
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }
}
