package leetcode.oo.arrays;

import java.util.SortedMap;
import java.util.TreeMap;

//https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
public final class DivideArrayIntoKSequences {

    public boolean isPossibleDivide(final int[] nums, final int k) {
        final SortedMap<Integer, Integer> map = new TreeMap<>();
        for (final int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        while (!map.isEmpty()) {
            final Integer firstKey = map.firstKey();
            for (int i = 0; i < k; i++) {
                if (!map.containsKey(firstKey + i)) {
                    return false;
                }
                if (map.computeIfPresent(firstKey + i, (key, value) -> value - 1) == 0) {
                    map.remove(firstKey + i);
                }
            }
        }
        return true;
    }
}
