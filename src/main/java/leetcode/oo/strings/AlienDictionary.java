package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/verifying-an-alien-dictionary/
final class AlienDictionary {

    boolean isAlienSorted(final String[] words, final String order) {
        final Map<Character, Integer> indexes = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            indexes.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            final String current = words[i];
            final String next = words[i + 1];
            if (!this.check(current, next, indexes)) {
                return false;
            }
        }
        return true;
    }

    private boolean check(final String current, final String next, final Map<Character, Integer> indexes) {
        for (int i = 0; i < current.length(); i++) {
            if (next.length() == i) {
                return false;
            }
            if (indexes.get(current.charAt(i)) < indexes.get(next.charAt(i))) {
                return true;
            } else if (indexes.get(current.charAt(i)) > indexes.get(next.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
