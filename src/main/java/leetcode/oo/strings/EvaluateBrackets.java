package leetcode.oo.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
final class EvaluateBrackets {

    String evaluate(final String s, final List<List<String>> knowledge) {
        final Map<String, String> map = new HashMap<>(knowledge.size());
        for (final List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        final StringBuilder builder = new StringBuilder(s.length());
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                final int nextIndex = s.indexOf(')', i);
                final String key = s.substring(i + 1, nextIndex);
                builder.append(map.getOrDefault(key, "?"));
                i = nextIndex;
            } else {
                builder.append(s.charAt(i));
            }
            i++;
        }
        return builder.toString();
    }
}
