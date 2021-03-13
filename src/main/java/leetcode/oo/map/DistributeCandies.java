package leetcode.oo.map;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/distribute-candies/
final class DistributeCandies {

    int distributeCandies(int[] array) {
        int limit = array.length / 2;
        int cnt = 0;
        final Set<Integer> set = new HashSet<>();
        for (final int j : array) {
            if (limit <= 0) {
                break;
            }
            if (set.add(j)) {
                cnt++;
                limit--;
            }
        }
        return cnt;
    }
}
