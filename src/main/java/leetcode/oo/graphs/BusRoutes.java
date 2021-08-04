package leetcode.oo.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/bus-routes/
public final class BusRoutes {

    public static void main(String[] args) {
        System.out.println(new BusRoutes().numBusesToDestination(
            new int[][]{{1, 2, 7}, {3, 6, 7}},
            1,
            6
            )
        );
    }

    public int numBusesToDestination(int[][] routes, int source, int target) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>(routes.length);
        for (int bus = 0; bus < routes.length; bus++) {
            for (final int station : routes[bus]) {
                graph.putIfAbsent(station, new HashSet<>());
                graph.get(station).add(bus);
            }
        }
        final Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        final Set<Integer> visited = new HashSet<>(routes.length);
        int cnt = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            cnt++;
            for (int i = 0; i < size; i++) {
                final Integer currentStation = queue.poll();
                for (final Integer bus : graph.get(currentStation)) {
                    if (!visited.contains(bus)) {
                        visited.add(bus);
                        for (final int station : routes[bus]) {
                            if (station == target) {
                                return cnt;
                            } else {
                                queue.add(station);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
