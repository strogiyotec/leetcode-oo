package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

//https://leetcode.com/problems/avoid-flood-in-the-city/
final class AvoidFlood {

    int[] avoidFlood(final int[] rains) {
        final Map<Integer, Integer> rainCnt = new HashMap<>(rains.length);
        final int[] answer = new int[rains.length];
        final TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                set.add(i);
            } else {
                if (rainCnt.containsKey(rains[i])) {
                    final Integer next = set.ceiling(rainCnt.get(rains[i]));
                    if (next == null) {
                        return new int[]{};
                    }
                    answer[next] = rains[i];
                    set.remove(next);
                }
                answer[i] = -1;
                rainCnt.put(rains[i], i);
            }
        }
        for (final Integer index : set) {
            answer[index] = 1;
        }
        return answer;
    }
}
