package leetcode.oo.graphs;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/cheapest-flights-within-k-stops/
final class CheapestFlight {

    int findCheapestPrice(final int n, final int[][] flights, final int src, final int dst, int stops) {
        final Map<Integer, Map<Integer, Integer>> adjacent = new HashMap<>();
        for (final int[] flight : flights) {
            adjacent.putIfAbsent(flight[0], new HashMap<>());
            adjacent.get(flight[0]).put(flight[1], flight[2]);
        }
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        queue.add(new int[]{src, 0, stops+1});
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int source = poll[0];
            final int cost = poll[1];
            final int stop = poll[2];
            if (source == dst) {
                return cost;
            }
            if (stop != 0) {
                for (var entry : adjacent.getOrDefault(source, Collections.emptyMap()).entrySet()) {
                    queue.add(new int[]{entry.getKey(), cost + entry.getValue(), stop - 1});
                }
            }
        }
        return -1;
    }
}
