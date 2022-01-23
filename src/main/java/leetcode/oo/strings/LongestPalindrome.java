package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-palindrome/
final class LongestPalindrome {

    public int longestPalindrome(final String input) {
        final Map<Character, Integer> counters = new HashMap<>(input.length() << 1);
        for (int i = 0; i < input.length(); i++) {
            counters.merge(input.charAt(i), 1, Integer::sum);
        }
        int countOdds = 0;
        for (final Integer value : counters.values()) {
            if (value % 2 != 0) {
                countOdds++;
            }
        }
        if (countOdds == 0) {
            return input.length();
        } else {
            return input.length() - countOdds + 1;
        }
    }
}

