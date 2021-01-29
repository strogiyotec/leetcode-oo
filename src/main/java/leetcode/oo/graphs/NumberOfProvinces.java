package leetcode.oo.graphs;

import java.util.HashSet;
import java.util.Set;

final class NumberOfProvinces {

    int findCircleNum(final int[][] isConnected) {
        final Set<Integer> visited = new HashSet<>();
        int solution = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited.contains(i)) {
                this.dfs(isConnected, i, visited);
                solution++;
            }
        }
        return solution;
    }

    private void dfs(final int[][] isConnected, final int city, final Set<Integer> cache) {
        for (int i = 0; i < isConnected[city].length; i++) {
            if (!cache.contains(i) && isConnected[city][i] == 1) {
                cache.add(i);
                this.dfs(isConnected, i, cache);
            }
        }
    }
}
