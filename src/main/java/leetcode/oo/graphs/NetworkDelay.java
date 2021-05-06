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
        final Map<Integer, List<List<Integer>>> adjacent = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            adjacent.put(i, new ArrayList<>());
        }
        for (final int[] time : times) {
            adjacent.get(time[0]).add(Arrays.asList(time[1], time[2]));
        }
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        queue.add(new int[]{k, 0});
        int visited = 0;
        int minCost = 0;
        final Set<Integer> cache = new HashSet<>();
        while (visited < n && !queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int province = poll[0];
            final int cost = poll[1];
            if (!cache.contains(province)) {
                minCost = cost;
                cache.add(province);
                for (final List<Integer> list : adjacent.get(province)) {
                    queue.add(new int[]{list.get(0), list.get(1) + cost});
                }
                visited++;
            }
        }
        if (visited == n) {
            return minCost;
        }
        return -1;
    }
}
