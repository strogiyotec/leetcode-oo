package leetcode.oo.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/group-anagrams/
final class GroupAnagrams {

    List<List<String>> groupAnagrams(final String[] strs) {
        final Map<Map<Character, Integer>, Integer> cache = new HashMap<>();
        final List<List<String>> solution = new ArrayList<>(strs.length);
        int index = 0;
        for (final String str : strs) {
            final Map<Character, Integer> cnt = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                cnt.merge(str.charAt(i), 1, Integer::sum);
            }
            final Integer position = cache.getOrDefault(cnt, -1);
            if (position == -1) {
                solution.add(new ArrayList<>());
                solution.get(index).add(str);
                cache.put(cnt, index);
                index++;
            } else {
                solution.get(position).add(str);
            }

        }
        return solution;
    }
}
