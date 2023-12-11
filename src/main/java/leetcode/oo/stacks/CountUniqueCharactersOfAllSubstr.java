package leetcode.oo.stacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CountUniqueCharactersOfAllSubstr {

    public int uniqueLetterString(String s) {
        final Map<Character, List<Integer>> map = new HashMap<>(s.length() << 1);
        for (int i = 0; i < s.length(); i++) {
            map.computeIfAbsent(s.charAt(i), character -> new ArrayList<>()).add(i);
        }
        int sum = 0;
        for (final List<Integer> indexes : map.values()) {
            for (int currentIndex = 0; currentIndex < indexes.size(); currentIndex++) {
                int prevIndex = currentIndex - 1;
                int nextIndex = currentIndex + 1;
                int left = currentIndex == 0 ? indexes.get(currentIndex) + 1 : indexes.get(currentIndex) - indexes.get(prevIndex);
                int right = currentIndex == indexes.size() - 1 ? s.length() - indexes.get(currentIndex) : indexes.get(nextIndex) - indexes.get(currentIndex);
                sum += left * right;
            }
        }
        return sum;
    }
}
