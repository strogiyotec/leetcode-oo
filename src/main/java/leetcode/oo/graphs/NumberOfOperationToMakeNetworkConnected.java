package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/number-of-operations-to-make-network-connected/
final class NumberOfOperationToMakeNetworkConnected {

    int makeConnected(final int n, final int[][] connections) {
        if (connections.length + 1 < n) {
            return -1;
        }
        final List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (final int[] connection : connections) {
            graph.get(connection[0]).add(connection[1]);
            graph.get(connection[1]).add(connection[0]);
        }
        int connectedComponents = 0;
        final boolean[] cache = new boolean[n];
        for (int i = 0; i < n; i++) {
            connectedComponents += this.dfs(graph, i, cache);
        }
        return connectedComponents - 1;
    }

    private int dfs(final List<List<Integer>> graph, final int current, final boolean[] cache) {
        if (cache[current]) {
            return 0;
        }
        cache[current] = true;
        for (final Integer vertical : graph.get(current)) {
            this.dfs(graph, vertical, cache);
        }
        return 1;
    }
}
