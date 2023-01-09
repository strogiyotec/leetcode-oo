package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

//https://leetcode.com/problems/avoid-flood-in-the-city/
final class AvoidFlood {

    int[] avoidFlood(final int[] rains) {
        final TreeSet<Integer> zeros = new TreeSet<>();
        final Map<Integer, Integer> map = new HashMap<>();
        final int[] solution = new int[rains.length];
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                zeros.add(i);
            } else {
                if (map.containsKey(rains[i])) {
                    if (zeros.isEmpty()) {
                        return new int[]{};
                    }
                    int rainIndex = map.get(rains[i]);
                    final Integer higher = zeros.higher(rainIndex);
                    if (higher == null) {
                        return new int[]{};
                    } else {
                        solution[higher] = rains[i];
                        zeros.remove(higher);
                    }
                }
                solution[i] = -1;
                map.put(rains[i], i);
            }
        }
        for (final Integer zero : zeros) {
            solution[zero] = 1;
        }
        return solution;
    }
}
