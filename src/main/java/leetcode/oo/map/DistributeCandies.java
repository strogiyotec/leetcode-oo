package leetcode.oo.map;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/distribute-candies/
final class DistributeCandies {

    int distributeCandies(final int[] array) {
        final int limit = array.length / 2;
        final Set<Integer> set = new HashSet<>(array.length);
        for (final int i : array) {
            set.add(i);
        }
        return Math.min(set.size(),limit);
    }
}
