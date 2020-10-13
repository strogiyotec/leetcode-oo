package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Buddy strings.
 * See {@link <a href ="https://leetcode.com/problems/buddy-strings/">https://leetcode.com/problems/buddy-strings/</a>}
 */
final class BuddyStrings {

    boolean buddyStrings(final String first, final String second) {
        if (first.length() != second.length()) {
            return false;
        }
        final Map<Character, Integer> cnt1 = new HashMap<>(first.length());
        final Map<Character, Integer> cnt2 = new HashMap<>(second.length());
        int diff = 0;
        for (int i = 0; i < first.length(); i++) {
            cnt1.merge(first.charAt(i), 1, Integer::sum);
            cnt2.merge(second.charAt(i), 1, Integer::sum);
            if (first.charAt(i) != second.charAt(i)) {
                diff++;
            }
        }
        if (!cnt1.equals(cnt2)) {
            return false;
        }
        if (diff == 2) {
            return true;
        } else if (diff == 0) {
            return cnt1.entrySet()
                .stream()
                .anyMatch(entry -> entry.getValue() > 1);
        } else {
            return false;
        }
    }
}
