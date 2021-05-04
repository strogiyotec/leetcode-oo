package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/number-of-restricted-paths-from-first-to-last-node/
public final class NumberOfRestrictPaths {

    private int mod = 1_000_000_007;

    public int countRestrictedPaths(int n, int[][] edges) {
        final Map<Integer, List<int[]>> graph = new HashMap<>(edges.length);
        for (int i = 1; i <= n; i++) {
            graph.putIfAbsent(i, new ArrayList<>());
        }
        for (final int[] edge : edges) {
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
            graph.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }
        final int[] dijkstra = new int[n + 1];
        Arrays.fill(dijkstra, Integer.MAX_VALUE);
        dijkstra[n] = 0;
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        queue.add(new int[]{n, 0});
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int node = poll[0];
            final int weight = poll[1];
            for (final int[] neighbour : graph.get(node)) {
                if (weight + neighbour[1] < dijkstra[neighbour[0]]) {
                    dijkstra[neighbour[0]] = weight + neighbour[1];
                    queue.add(new int[]{neighbour[0], weight + neighbour[1]});
                }
            }
        }
        final int[] cache = new int[n + 1];
        Arrays.fill(cache, Integer.MIN_VALUE);
        return this.dfs(cache, graph, dijkstra, 1, n);
    }

    private int dfs(final int[] cache, final Map<Integer, List<int[]>> graph, final int[] dijkstra, final int from, final int to) {
        if (from == to) {
            return 1;
        }
        if (cache[from] != Integer.MIN_VALUE) {
            return cache[from];
        }
        long res = 0;
        for (final int[] neighbor : graph.get(from)) {
            final int nei = neighbor[0];
            if (dijkstra[from] > dijkstra[nei]) { //use our calculations from Dijkstra's to determine if we can travel to a neighbor.
                res += this.dfs(cache, graph, dijkstra, nei, to) % this.mod;
            }
        }
        res %= this.mod;
        return cache[from] = (int) res;
    }
}
