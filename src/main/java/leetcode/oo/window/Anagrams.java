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
        final Map<Character, Integer> wordCnt = new HashMap<>(word.length() << 1);
        for (int i = 0; i < word.length(); i++) {
            wordCnt.merge(word.charAt(i), 1, Integer::sum);
        }
        int right = 0;
        int left = 0;
        final List<Integer> solution = new ArrayList<>();
        final Map<Character, Integer> lineCnt = new HashMap<>();
        while (right < line.length()) {
            lineCnt.merge(line.charAt(right), 1, Integer::sum);
            if (right - left == word.length() - 1) {
                if (lineCnt.equals(wordCnt)) {
                    solution.add(left);
                }
                if (lineCnt.computeIfPresent(line.charAt(left), (key, value) -> value - 1) == 0) {
                    lineCnt.remove(line.charAt(left));
                }
                left++;
            }
            right++;
        }
        return solution;
    }
}
