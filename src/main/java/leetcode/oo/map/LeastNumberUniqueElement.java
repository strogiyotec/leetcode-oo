package leetcode.oo.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/
final class LeastNumberUniqueElement {

    int findLeastNumOfUniqueInts(int[] arr, int k) {
        final Map<Integer, Integer> cnt = new HashMap<>();
        for (final int number : arr) {
            cnt.merge(number, 1, Integer::sum);
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(cnt::get));
        queue.addAll(cnt.keySet());
        for (int i = 0; i < k; i++) {
            final Integer key = queue.poll();
            if (cnt.computeIfPresent(key, (oldKey, value) -> value - 1) == 0) {
                cnt.remove(key);
            } else {
                queue.add(key);
            }
        }
        return cnt.size();
    }
}
