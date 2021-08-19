package leetcode.oo.graphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/find-if-path-exists-in-graph/
public final class FindPathExists {

    public static void main(String[] args) {
        System.out.println(
            new FindPathExists().validPath(
                6,
                new int[][]{
                    {0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}
                },
                0,
                5
            )
        );
    }

    public boolean validPath(int n, int[][] edges, int start, int end) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>(edges.length);
        for (final int[] edge : edges) {
            graph.putIfAbsent(edge[0], new HashSet<>());
            graph.putIfAbsent(edge[1], new HashSet<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        final boolean[] cache = new boolean[n + 1];
        return this.dfs(start, end, cache, graph);

    }

    private boolean dfs(final int start, final int end, final boolean[] cache, final Map<Integer, Set<Integer>> graph) {
        if (start == end) {
            return true;
        }
        cache[start] = true;
        for (final Integer vertex : graph.getOrDefault(start, Collections.emptySet())) {
            if (!cache[vertex] && this.dfs(vertex, end, cache, graph)) {
                return true;
            }
        }
        return false;
    }
}
