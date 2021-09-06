package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/path-with-maximum-probability/
public final class PathWithMaxProb {

    public static void main(String[] args) {

        System.out.println(new PathWithMaxProb().maxProbability(
            3,
            new int[][]{{0, 1}},
            new double[]{0.5},
            0,
            2
        ));
        System.out.println(new PathWithMaxProb().maxProbability(
            3,
            new int[][]{
                {0, 1}, {1, 2}, {0, 2}
            },
            new double[]{0.5, 0.5, 0.2},
            0,
            2
        ));
    }

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        final Queue<Path> queue = new PriorityQueue<>(Comparator.<Path>comparingDouble(c -> c.prob).reversed());
        queue.add(new Path(start, 0));
        final List<List<Edge>> graph = new ArrayList<>(edges.length);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            final int[] edge = edges[i];
            graph.get(edge[0]).add(new Edge(edge[1], succProb[i]));
            graph.get(edge[1]).add(new Edge(edge[0], succProb[i]));
        }
        final boolean[] cache = new boolean[n+1];
        while (!queue.isEmpty()) {
            final Path poll = queue.poll();
            if (poll.start == end) {
                return poll.prob;
            }
            if (!cache[poll.start]) {
                cache[poll.start] = true;
                for (final Edge edge : graph.get(poll.start)) {
                    double prob = poll.prob == 0 ? 1 : poll.prob;
                    queue.add(
                        new Path(
                            edge.vertex,
                            prob * edge.prob
                        )
                    );
                }
            }
        }
        return 0.0;
    }

    private static class Edge {
        final int vertex;
        final double prob;

        private Edge(final int vertex, final double prob) {
            this.vertex = vertex;
            this.prob = prob;
        }
    }

    private static class Path {

        final int start;

        final double prob;

        private Path(final int start, final double prob) {
            this.start = start;
            this.prob = prob;
        }
    }
}
