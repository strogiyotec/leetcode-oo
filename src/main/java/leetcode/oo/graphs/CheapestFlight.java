package leetcode.oo.graphs;

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
        queue.add(new int[]{src, 0, stops + 1});
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int city = poll[0];
            final int price = poll[1];
            final int stop = poll[2];
            if (city == dst) {
                return price;
            }
            if (stop != 0) {
                if (adjacent.containsKey(city)) {
                    for (final Integer key : adjacent.get(city).keySet()) {
                        queue.add(new int[]{key, adjacent.get(city).get(key) + price, stop - 1});
                    }
                }
            }
        }
        return -1;
    }
}
