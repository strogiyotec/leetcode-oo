package leetcode.oo.pointers;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/permutation-in-string/
final class PermutationString {

    boolean checkInclusion(final String s1, final String s2) {
        final Map<Character, Integer> originalCnt = new HashMap<>(s1.length());
        final Map<Character, Integer> permutationCnt = new HashMap<>(s2.length());
        for (int i = 0; i < s1.length(); i++) {
            originalCnt.merge(s1.charAt(i), 1, Integer::sum);
        }
        int left = 0;
        int right = 0;
        while (right <= s2.length()) {
            if (right - left == s1.length()) {
                if (originalCnt.equals(permutationCnt)) {
                    return true;
                } else {
                    if (permutationCnt.computeIfPresent(s2.charAt(left), (key, val) -> val - 1) == 0) {
                        permutationCnt.remove(s2.charAt(left));
                    }
                    left++;
                    if (right < s2.length()) {
                        permutationCnt.merge(s2.charAt(right), 1, Integer::sum);
                    }
                }
            } else {
                if (right == s2.length()) {
                    break;
                }
                permutationCnt.merge(s2.charAt(right), 1, Integer::sum);
            }
            right++;
        }
        return false;
    }
}
