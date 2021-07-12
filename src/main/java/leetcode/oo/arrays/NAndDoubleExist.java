package leetcode.oo.arrays;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public final class NAndDoubleExist {

    public boolean checkIfExist(int[] arr) {
        final Set<Integer> cache = new HashSet<>(arr.length);
        for (final int number : arr) {
            if (cache.contains(number)) {
                return true;
            }
            cache.add(number << 1);
            if (number % 2 != 0) {
                cache.add(number / 2);
            }
        }
        return false;
    }
}
