package leetcode.oo.arrays;

import java.util.HashMap;
import java.util.Map;

//
https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
final class PairOfSongs {

    int numPairsDivisibleBy60(int[] time) {
        final Map<Integer, Integer> map = new HashMap<>(64);
        int cnt = 0;
        for (final int second : time) {
            final int first = (60 - second % 60) % 60;
            cnt += map.getOrDefault(first, 0);
            map.merge(second % 60, 1, Integer::sum);
        }
        return cnt;
    }

}
