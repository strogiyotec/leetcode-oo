package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/
final class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        return this.toNumeric(s).equals(this.toNumeric(t));
    }

    private String toNumeric(final String word) {
        final StringBuilder builder = new StringBuilder(word.length());
        final Map<Character, Integer> charToInt = new HashMap<>(word.length() << 1);
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!charToInt.containsKey(word.charAt(i))) {
                charToInt.put(word.charAt(i), cnt);
                cnt++;
            }
            builder.append(word.charAt(i));
        }
        return builder.toString();
    }

}
