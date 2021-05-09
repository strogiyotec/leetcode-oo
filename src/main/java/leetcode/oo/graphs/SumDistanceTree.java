package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/sum-of-distances-in-tree/
final class SumDistanceTree {

    int[] sumOfDistancesInTree(final int N,final int[][] edges) {
        final List<List<Integer>> graph = new ArrayList<>(edges.length + 1);
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (final int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        final int[] cnt = new int[N];
        final int[] sum = new int[N];
        this.dfs(cnt, sum, graph, 0, -1);
        this.preOrder(cnt, sum, graph, 0, -1);
        return sum;
    }

    private void dfs(final int[] cnt, final int[] sum, final List<List<Integer>> graph, final int node, final int parent) {
        for (final Integer vertex : graph.get(node)) {
            if (!vertex.equals(parent)) {
                this.dfs(cnt, sum, graph, vertex, node);
                cnt[node] += cnt[vertex];
                sum[node] += cnt[vertex] + sum[vertex];
            }
        }
        cnt[node]++;
    }

    private void preOrder(final int[] cnt, final int[] sum, final List<List<Integer>> graph, final int root, final int prev) {
        for (final Integer vertical : graph.get(root)) {
            if (!vertical.equals(prev)) {
                sum[vertical] = sum[root] - cnt[vertical] + cnt.length - cnt[vertical];
                this.preOrder(cnt, sum, graph, vertical, root);
            }
        }
    }

}
