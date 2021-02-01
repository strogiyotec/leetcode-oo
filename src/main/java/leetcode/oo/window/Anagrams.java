package leetcode.oo.window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/
final class Anagrams {

    List<Integer> findAnagrams(final String line, final String word) {
        if (line.length() < word.length()) {
            return Collections.emptyList();
        }
        final Map<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            cnt.merge(word.charAt(i), 1, Integer::sum);
        }
        final Map<Character, Integer> lineCnt = new HashMap<>();
        int index = 0;
        int length = 0;
        final List<Integer> solution = new ArrayList<>();
        while (index <= line.length()) {
            if (length == word.length()) {
                if (lineCnt.equals(cnt)) {
                    solution.add(index - word.length());
                }
                length--;
                final char key = line.charAt(index - word.length());
                if (lineCnt.computeIfPresent(key, (character, integer) -> integer - 1).equals(0)) {
                    lineCnt.remove(key);
                }
            } else {
                if (index < line.length()) {
                    lineCnt.merge(line.charAt(index), 1, Integer::sum);
                    length++;
                }
                index++;
            }
        }
        return solution;
    }
}
