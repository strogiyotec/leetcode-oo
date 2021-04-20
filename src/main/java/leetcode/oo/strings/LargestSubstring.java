package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/largest-substring-between-two-equal-characters/
final class LargestSubstring {

    int maxLengthBetweenEqualCharacters(final String word) {
        final Map<Character, Integer> positions = new HashMap<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            positions.put(word.charAt(i), i);
        }
        int max = -1;
        for (int i = 0; i < word.length(); i++) {
            max = Math.max(max, positions.get(word.charAt(i)) - i - 1);
        }
        return max;
    }
}
