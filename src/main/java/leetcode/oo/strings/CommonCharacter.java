package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-common-characters/
final class CommonCharacter {

    List<String> commonChars(final String[] words) {
        final List<Map<Character, Integer>> counters = new ArrayList<>(words.length);
        Map<Character, Integer> longestWordCnt = null;
        for (final String word : words) {
            final Map<Character, Integer> cnt = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                cnt.merge(word.charAt(i), 1, Integer::sum);
            }
            if (longestWordCnt == null) {
                longestWordCnt = cnt;
            } else {
                if (longestWordCnt.size() < cnt.size()) {
                    longestWordCnt = cnt;
                }
            }
            counters.add(cnt);
        }
        final List<String> solution = new ArrayList<>();
        for (final Character character : longestWordCnt.keySet()) {
            int min = Integer.MAX_VALUE;
            for (final Map<Character, Integer> counter : counters) {
                min = Math.min(min, counter.getOrDefault(character, 0));
            }
            for (int i = 0; i < min; i++) {
                solution.add(Character.toString(character));
            }
        }
        return solution;
    }
}
