package leetcode.oo.arrays;

import java.util.Optional;
import java.util.TreeMap;

//https://leetcode.com/problems/advantage-shuffle/
final class AdvantageShuffle {

    int[] advantageCount(int[] A, int[] B) {
        final TreeMap<Integer, Integer> map = new TreeMap<>();
        for (final int num : A) {
            map.merge(num, 1, Integer::sum);
        }
        final int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            final Integer key = Optional.ofNullable(map.higherKey(B[i])).orElse(map.firstKey());
            res[i] = key;
            if (map.computeIfPresent(key, (oldKey, val) -> val - 1) == 0) {
                map.remove(key);
            }
        }
        return res;
    }
}
