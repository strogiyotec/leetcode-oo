package leetcode.oo.arrays;

import java.util.TreeMap;

//https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
public final class DivideArrayIntoKSequences {

    public boolean isPossibleDivide(final int[] nums, final int k) {
        final TreeMap<Integer, Integer> map = new TreeMap<>();
        for (final int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        while (!map.isEmpty()) {
            Integer first = map.firstKey();
            for (int i = 0; i < k; i++) {
                if (!map.containsKey(first + 1) && i + 1 != k) {
                    return false;
                }
                if (map.computeIfPresent(first, (key, val) -> val - 1) == 0) {
                    map.remove(first);
                }
                first = map.higherKey(first);
            }
        }
        return true;
    }
}
