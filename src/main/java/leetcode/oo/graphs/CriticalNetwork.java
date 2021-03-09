package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/critical-connections-in-a-network/
final class CriticalNetwork {

    List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        final Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacent.put(i, new HashSet<>());
        }
        for (final List<Integer> connection : connections) {
            adjacent.get(connection.get(0)).add(connection.get(1));
            adjacent.get(connection.get(1)).add(connection.get(0));
        }
        final Set<Integer> cache = new HashSet<>();
        final int[] indexes = new int[n + 1];
        final List<List<Integer>> solution = new ArrayList<>();
        this.dfs(0, cache, indexes, solution, adjacent, new AtomicInteger(0));
        return solution;
    }

    private void dfs(final int node, final Set<Integer> cache, final int[] indexes, final List<List<Integer>> solution, Map<Integer, Set<Integer>> adjacent,final AtomicInteger cnt) {
        indexes[node] = cnt.getAndIncrement();
        final int before = indexes[node];
        cache.add(node);
        for (final Integer vertx : adjacent.get(node)) {
            if (cache.contains(vertx)) {
                indexes[node] = Math.min(indexes[vertx], indexes[node]);
            } else {
                adjacent.get(vertx).remove(node);
                this.dfs(vertx, cache, indexes, solution, adjacent,cnt);
                indexes[node] = Math.min(indexes[node], indexes[vertx]);
                if (before < indexes[vertx]) {
                    solution.add(Arrays.asList(node,vertx));
                }
            }
        }
    }

}
