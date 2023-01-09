package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

//https://leetcode.com/problems/network-delay-time/
final class NetworkDelay {

    int networkDelayTime(final int[][] times, final int n, final int k) {
        final Map<Integer, List<List<Integer>>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (final int[] time : times) {
            graph.get(time[0]).add(Arrays.asList(time[1], time[2]));
        }
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(value -> value[1]));
        queue.add(new int[]{k, 0});
        final Set<Integer> cache = new HashSet<>();
        int totalDelay = 0;
        int visited = 0;
        while (visited < n && !queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int province = poll[0];
            final int cost = poll[1];
            if (cache.add(province)) {
                visited++;
                totalDelay = cost;
                for (final List<Integer> neighbours : graph.get(province)) {
                    queue.add(new int[]{neighbours.get(0), neighbours.get(1) + cost});
                }
            }
        }
        if (visited == n) {
            return totalDelay;
        } else {
            return -1;
        }
    }
}
