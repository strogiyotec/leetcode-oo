package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


/**
 * Top k elements.
 * See {@link <a href ="https://leetcode.com/problems/word-search/">https://leetcode.com/problems/word-search/</a>}
 */
final class TopKElements {

    int[] topKFrequent(int[] nums, int amount) {
        final Map<Integer, Integer> map = new HashMap<>(nums.length + 2, 1);
        for (final int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        final PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        map.entrySet().forEach(it -> {
                    queue.offer(it);
                    if (queue.size() > amount) {
                        queue.poll();
                    }
                }
        );
        return queue.stream()
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
