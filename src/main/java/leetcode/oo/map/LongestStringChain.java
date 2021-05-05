package leetcode.oo.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-string-chain/
final class LongestStringChain {

    int longestStrChain(final String[] words) {
        final Map<String, Integer> map = new HashMap<>(words.length);
        Arrays.sort(words, Comparator.comparingInt(String::length));
        int res = 0;
        for (final String word : words) {
            map.put(word, 1);
            for (int i = 0; i < word.length(); i++) {
                final String sub = word.substring(0, i) + word.substring(i + 1);
                if (map.containsKey(sub) && map.get(sub) + 1 > map.get(word)) {
                    map.put(word, map.get(sub) + 1);
                }
            }
            res = Math.max(res, map.get(word));
        }
        return res;
    }
}
