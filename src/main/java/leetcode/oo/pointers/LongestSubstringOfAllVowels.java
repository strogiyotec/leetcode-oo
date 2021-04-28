package leetcode.oo.pointers;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-of-all-vowels-in-order/
final class LongestSubstringOfAllVowels {

    int longestBeautifulSubstring(final String word) {
        final Set<Character> set = new HashSet<>(6, 1.0f);
        int startIndex = 0;
        int maxLength = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i != 0 && word.charAt(i) < word.charAt(i - 1)) {
                set.clear();
                startIndex = i;
            }
            set.add(word.charAt(i));
            if (set.size() == 5) {
                maxLength = Math.max(maxLength, i - startIndex + 1);
            }
        }
        return maxLength;
    }
}
