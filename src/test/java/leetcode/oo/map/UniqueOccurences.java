package leetcode.oo.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class UniqueOccurences {

    public boolean uniqueOccurrences(final int[] arr) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(i, 1, Integer::sum);
        }
        return new HashSet<>(map.values()).size() == map.size();
    }
}
