package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/
final class NumberOfWaysToArrive {

    public int countPaths(int n, int[][] roads) {
        final List<List<Node>> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList());
        }
        for (final int[] arr : roads) {
            list.get(arr[0]).add(new Node(arr[1], arr[2]));
            list.get(arr[1]).add(new Node(arr[0], arr[2]));
        }
        return this.dfs(list, n);
    }

    public int dfs(final List<List<Node>> adj, int n) {
        final long[] costs = new long[n];
        final int[] ways = new int[n];
        Arrays.fill(costs, Long.MAX_VALUE);
        costs[0] = 0;
        ways[0] = 1;
        final Queue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(0, 0));
        while (!queue.isEmpty()) {
            final Node current = queue.poll();
            if (current.cost > costs[current.position]) {
                continue;
            }
            for (final Node vertex : adj.get(current.position)) {
                if (current.cost + vertex.cost < costs[vertex.position]) {
                    costs[vertex.position] = current.cost + vertex.cost;
                    ways[vertex.position] = ways[current.position];
                    queue.add(new Node(vertex.position, costs[vertex.position]));
                } else if (current.cost + vertex.cost == costs[vertex.position]) {
                    ways[vertex.position] += ways[current.position];
                }
            }
        }
        return ways[n-1];
    }

    @SuppressWarnings("ALL")
    private static class Node implements Comparable<Node> {
        int position;
        long cost;

        public Node(int pos, long cost) {
            this.position = pos;
            this.cost = cost;
        }

        @Override
        public int compareTo(final Node o) {
            return Long.compare(this.cost, o.cost);
        }
    }
}

