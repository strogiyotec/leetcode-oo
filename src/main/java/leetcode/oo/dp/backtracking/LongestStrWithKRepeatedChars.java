package leetcode.oo.dp.backtracking;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
final class LongestStrWithKRepeatedChars {

    int longestSubstring(final String line, int k) {
        return this.divideAndConq(line, 0, line.length(), k);
    }

    private int divideAndConq(final String line, final int from, final int to, final int k) {
        if (from > to) {
            return 0;
        }
        final Map<Character, Integer> cnt = new HashMap<>(26);
        for (int i = from; i < to; i++) {
            cnt.merge(line.charAt(i), 1, Integer::sum);
        }
        for (int i = from; i < to; i++) {
            if (!(cnt.get(line.charAt(i)) >= k)) {
                int next = i + 1;
                while (next < to && cnt.get(line.charAt(next)) < k) {
                    next++;
                }
                return Math.max(
                    this.divideAndConq(line, from, i, k),
                    this.divideAndConq(line, next, to, k)
                );
            }
        }
        return to - from;
    }
}
