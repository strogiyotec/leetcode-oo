package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * First unique character.
 * See {@link <a href ="https://leetcode.com/problems/first-unique-character-in-a-string/">https://leetcode.com/problems/first-unique-character-in-a-string/</a>}
 */
@SuppressWarnings("ALL")
public final class FirstUniqueCharacter {
    public int firstUniqChar(final String word) {
        final Map<Character, Integer> count = new HashMap<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            count.merge(word.charAt(i), 1, Integer::sum);
        }

        // find the index
        for (int i = 0; i < word.length(); i++) {
            if (count.get(word.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
