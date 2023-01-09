package leetcode.oo.graphs;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class NumberOfProvinces {

    int findCircleNum(final int[][] isConnected) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if (isConnected[i][j] == 1) {
                    if (i != j) {
                        graph.putIfAbsent(i + 1, new HashSet<>());
                        graph.get(i + 1).add(j + 1);

                    }
                }
            }
        }
        final boolean[] cache = new boolean[isConnected.length + 1];
        int cnt = 0;
        for (int i = 1; i <= isConnected.length; i++) {
            cnt += this.dfs(i, cache, graph);
        }
        return cnt;
    }

    private int dfs(final int node, final boolean[] cache, final Map<Integer, Set<Integer>> graph) {
        if (cache[node]) {
            return 0;
        }
        cache[node] = true;
        for (final Integer vertex : graph.getOrDefault(node, Collections.emptySet())) {
            this.dfs(vertex, cache, graph);
        }
        return 1;
    }

}
