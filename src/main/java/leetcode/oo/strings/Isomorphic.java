package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/
final class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        return this.toNumeric(s).equals(this.toNumeric(t));
    }

    private String toNumeric(final String str) {
        final StringBuilder builder = new StringBuilder(str.length());
        final Map<Character, Integer> map = new HashMap<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
            }
            builder.append(map.get(str.charAt(i))).append(' ');
        }
        return builder.toString();
    }

}
