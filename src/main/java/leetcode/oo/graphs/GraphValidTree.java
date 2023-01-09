package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/graph-valid-tree
public final class GraphValidTree {

    public static void main(String[] args) {
        System.out.println(
            new GraphValidTree().validTree(
                5,
                new int[][]{
                    {0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}
                }
            )
        );
    }

    public boolean validTree(int n, int[][] edges) {
        final List<List<Integer>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (final int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        final Queue<int[]> queue = new LinkedList<>();
        final boolean[] visited = new boolean[n];
        queue.add(new int[]{0, -1});
        int visitedCnt = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] poll = queue.poll();
                final int current = poll[0];
                final int prev = poll[1];
                if (visited[current]) {
                    return false;
                }
                for (final Integer vertex : graph.get(current)) {
                    if (!vertex.equals(prev)) {
                        queue.add(new int[]{vertex, current});
                    }
                }
                visited[current] = true;
                visitedCnt++;
            }
        }
        return visitedCnt == n;
    }
}
