package leetcode.oo.graphs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/min-cost-to-connect-all-points/
final class MinCostConnectPoints {

    public int minCostConnectPoints(int[][] points) {
        final Map<Integer, Integer> graph = new HashMap<>(points.length << 1);
        for (int i = 0; i < points.length; i++) {
            graph.put(i, i);
        }
        final Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(value -> value[0]));
        for (int i = 0; i < points.length; i++) {
            for (int j = 1; j < points.length; j++) {
                queue.add(
                    new int[]{
                        this.distance(points, i, j),
                        i,
                        j
                    }
                );
            }
        }
        int visited = 0;
        int cost = 0;
        while (visited != points.length - 1) {
            final int[] poll = queue.poll();
            final int pFirst = this.find(poll[1], graph);
            final int pSecond = this.find(poll[2], graph);
            if (pFirst != pSecond) {
                visited++;
                cost += poll[0];
                graph.put(pFirst, pSecond);
            }
        }
        return cost;
    }

    private int find(final int node, final Map<Integer, Integer> map) {
        Integer parent = map.get(node);
        while (!parent.equals(map.get(parent))) {
            parent = map.get(parent);
        }
        return parent;
    }

    private int distance(final int[][] points, final int i, final int j) {
        return Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }

}
