package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/critical-connections-in-a-network/
final class CriticalNetwork {

    List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (final List<Integer> connection : connections) {
            graph.get(connection.get(0)).add(connection.get(1));
            graph.get(connection.get(1)).add(connection.get(0));
        }
        final int[] indexes = new int[n + 1];
        final AtomicInteger index = new AtomicInteger(0);
        final List<List<Integer>> solution = new ArrayList<>();
        final HashSet<Integer> cache = new HashSet<>();
        this.dfs(0, cache, indexes, solution, graph, index);
        return solution;
    }

    private void dfs(final int node, final Set<Integer> cache, final int[] indexes, final List<List<Integer>> solution, final Map<Integer, Set<Integer>> graph, final AtomicInteger cnt) {
        indexes[node] = cnt.getAndIncrement();
        int before = indexes[node];
        cache.add(node);
        for (final Integer vertex : graph.get(node)) {
            if (cache.contains(vertex)) {
                indexes[node] = Math.min(indexes[vertex], indexes[node]);
            } else {
                graph.get(vertex).remove(node);
                this.dfs(vertex, cache, indexes, solution, graph, cnt);
                indexes[node] = Math.min(indexes[node], indexes[vertex]);
                if(before < indexes[vertex]){
                    solution.add(List.of(node,vertex));
                }
            }
        }
    }

}
