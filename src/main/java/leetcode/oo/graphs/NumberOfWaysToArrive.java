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
        final int mod = 1_000_000_007;
        final Queue<Node> queue = new PriorityQueue<>(n);
        final long[] costs = new long[n];
        final long[] ways = new long[n];
        final boolean[] cache = new boolean[n];
        queue.add(new Node(0, 0));
        Arrays.fill(costs, Long.MAX_VALUE);
        costs[0] = 0;
        //one way to visit first node
        ways[0] = 1;
        while (!queue.isEmpty()) {
            final Node currentNode = queue.poll();
            if (currentNode.cost > costs[currentNode.position] || cache[currentNode.position]) {
                continue;
            }
            for (final Node vertex : adj.get(currentNode.position)) {
                if (costs[currentNode.position] + vertex.cost < costs[vertex.position]) {
                    costs[vertex.position] = costs[currentNode.position] + vertex.cost;
                    ways[vertex.position] = ways[currentNode.position] % mod;
                    queue.add(new Node(vertex.position,costs[vertex.position]));
                } else if(costs[currentNode.position]+ vertex.cost == costs[vertex.position]){
                    ways[vertex.position] = (ways[vertex.position] + ways[currentNode.position]) % mod;
                }
            }
        }
        return (int) ways[n-1];
    }

    @SuppressWarnings("ALL")
    private static class Node implements Comparable<Node> {
        int position;
        long cost;

        public Node(int dis, long val) {
            this.position = dis;
            this.cost = val;
        }

        public int compare(Node node1, Node node2) {
            return Long.compare(node1.cost, node2.cost);
        }

        @Override
        public int compareTo(final Node o) {
            return Long.compare(this.cost, o.cost);
        }
    }
}

