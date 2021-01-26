package leetcode.oo.graphs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/network-delay-time/
final class NetworkDelay {

    int networkDelayTime(final int[][] times, final int n, final int k) {
        final Map<Integer, Map<Integer, Integer>> adjacentMap = new HashMap<>();
        for (final int[] time : times) {
            adjacentMap.putIfAbsent(time[0], new HashMap<>());
            adjacentMap.get(time[0]).put(time[1], time[2]);
        }
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        queue.add(new int[]{k, 0});
        int time = 0;
        int cnt = n;
        final boolean[] cache = new boolean[n + 1];
        while (!queue.isEmpty()) {
            final int[] node = queue.poll();
            if (!cache[node[0]]) {
                cache[node[0]] = true;
                time = node[1];
                if (adjacentMap.containsKey(node[0])) {
                    for (final Integer key : adjacentMap.get(node[0]).keySet()) {
                        queue.add(new int[]{key, node[1] + adjacentMap.get(node[0]).get(key)});
                    }
                }
                cnt--;
            }
        }
        return cnt == 0 ? time : -1;
    }
}
