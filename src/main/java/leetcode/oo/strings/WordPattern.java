package leetcode.oo.strings;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/
public final class WordPattern {

    public static void main(String[] args) {
        System.out.println(new WordPattern().wordPattern(
            "ab",
            "happy hacking"
        ));
    }

    public boolean wordPattern(String pattern, String s) {
        return this.toNumeric(pattern).equals(this.toNumeric(s.split(" ")));
    }

    private String toNumeric(final String origin) {
        final StringBuilder builder = new StringBuilder(origin.length());
        final Map<Character, Integer> indexes = new HashMap<>(origin.length() << 1);
        for (int i = 0; i < origin.length(); i++) {
            final char c = origin.charAt(i);
            if (!indexes.containsKey(c)) {
                indexes.put(c, i);
            }
            builder.append(indexes.get(c)).append(' ');
        }
        return builder.toString();
    }

    private String toNumeric(final String[] origin) {
        final StringBuilder builder = new StringBuilder();
        final Map<String, Integer> indexes = new HashMap<>();
        for (int i = 0; i < origin.length; i++) {
            if (!indexes.containsKey(origin[i])) {
                indexes.put(origin[i], i);
            }
            builder.append(indexes.get(origin[i])).append(' ');
        }
        return builder.toString();
    }
}
