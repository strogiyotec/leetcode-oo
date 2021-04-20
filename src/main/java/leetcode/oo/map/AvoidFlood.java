package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

//https://leetcode.com/problems/avoid-flood-in-the-city/
final class AvoidFlood {

    int[] avoidFlood(final int[] rains) {
        final TreeSet<Integer> empty = new TreeSet<>();
        final Map<Integer, Integer> fulled = new HashMap<>();
        final int[] answer = new int[rains.length];
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                empty.add(i);
            } else {
                if (fulled.containsKey(rains[i])) {
                    if (empty.isEmpty()) {
                        return new int[]{};
                    } else {
                        final Integer higher = empty.higher(fulled.get(rains[i]));
                        if (higher == null) {
                            return new int[]{};
                        } else {
                            answer[higher] = rains[i];
                            empty.remove(higher);
                        }
                    }
                }
                answer[i] = -1;
                fulled.put(rains[i], i);
            }
        }
        for (final Integer index : empty) {
            answer[index] = 1;
        }
        return answer;
    }
}
