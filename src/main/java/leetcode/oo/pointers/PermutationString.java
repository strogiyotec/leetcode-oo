package leetcode.oo.pointers;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/permutation-in-string/
final class PermutationString {

    boolean checkInclusion(final String s1, final String s2) {
        final Map<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            cnt.merge(s1.charAt(i), 1, Integer::sum);
        }
        int matched = 0;
        for (int i = 0; i < s2.length(); i++) {
            final char c = s2.charAt(i);
            if (cnt.containsKey(c)) {
                if (cnt.computeIfPresent(c, (character, integer) -> integer - 1) == 0) {
                    matched++;
                }
            }
            if (i >= s1.length()) {
                final int mode = i - s1.length();
                if (cnt.containsKey(s2.charAt(mode))) {
                    if (cnt.get(s2.charAt(mode)) == 0) {
                        matched--;
                    }
                    cnt.merge(s2.charAt(mode), 1, Integer::sum);
                }
            }
            if (matched == cnt.size()) {
                return true;
            }
        }
        return false;
    }
}
