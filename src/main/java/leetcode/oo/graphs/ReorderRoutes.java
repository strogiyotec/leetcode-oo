package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/
final class ReorderRoutes {

    int minReorder(int n, int[][] connections) {
        final List<Set<Integer>> graph = new ArrayList<>();
        final List<Set<Integer>> neighbours = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(i, new HashSet<>());
            neighbours.add(i, new HashSet<>());
        }
        for (final int[] connection : connections) {
            graph.get(connection[0]).add(connection[1]);
            neighbours.get(connection[0]).add(connection[1]);
            neighbours.get(connection[1]).add(connection[0]);
        }
        final Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int cnt = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Integer node = queue.poll();
                final Set<Integer> currentNeighbours = neighbours.get(node);
                for (final Integer neighbour : currentNeighbours) {
                    neighbours.get(neighbour).remove(node);
                    if (!graph.get(neighbour).contains(node)) {
                        cnt++;
                    }
                    queue.add(neighbour);
                }
            }
        }
        return cnt;
    }
}
