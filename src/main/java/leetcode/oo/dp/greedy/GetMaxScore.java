package leetcode.oo.dp.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/get-the-maximum-score/
final class GetMaxScore {
    private final int mode = (int) 1.0e9 + 7;

    public int maxSum(int[] nums1, int[] nums2) {
        final Map<Integer, List<Integer>> graph = new HashMap<>(nums1.length);
        for (int i = 0; i < nums1.length - 1; i++) {
            graph.computeIfAbsent(nums1[i], integer -> new ArrayList<>()).add(nums1[i + 1]);
        }
        for (int i = 0; i < nums2.length - 1; i++) {
            graph.computeIfAbsent(nums2[i], integer -> new ArrayList<>()).add(nums2[i + 1]);
        }
        final Map<Integer, Long> cache = new HashMap<>(nums1.length);
        return (int) Math.max(
            this.greedy(cache, graph, nums1[0]) % this.mode,
            this.greedy(cache, graph, nums2[0]) % this.mode
        );
    }

    private long greedy(
        final Map<Integer, Long> cache,
        final Map<Integer, List<Integer>> graph,
        final int current
    ) {
        if (cache.containsKey(current)) {
            return cache.get(current);
        }
        //last node
        if (!graph.containsKey(current)) {
            return current;
        }
        long max = 0L;
        for (final Integer vertex : graph.getOrDefault(current, Collections.emptyList())) {
            max = Math.max(
                max,
                this.greedy(cache, graph, vertex)
            );
        }
        max += current;
        cache.put(current, max);
        return max;
    }

}
