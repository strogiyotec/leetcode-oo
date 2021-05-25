package leetcode.oo.graphs;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/frog-position-after-t-seconds/
final class FrogPosition {

    double frogPosition(final int n, final int[][] edges, int seconds, int target) {
        final List<Set<Integer>> graph = new ArrayList<>();
        graph.add(0, new HashSet<>());
        for (int i = 1; i <= n; i++) {
            graph.add(i, new HashSet<>());
        }
        for (final int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        final Queue<Map.Entry<Integer, Double>> queue = new ArrayDeque<>();
        queue.add(new AbstractMap.SimpleEntry<>(1, 1.0));
        int currentSeconds = seconds;
        boolean found = false;
        double answer = 0.0;
        while (!queue.isEmpty() && currentSeconds != 0) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Map.Entry<Integer, Double> entry = queue.poll();
                final Set<Integer> verticals = graph.get(entry.getKey());
                if (!verticals.isEmpty() && entry.getKey().equals(target) && found) {
                    found = false;
                }
                for (final Integer vertical : verticals) {
                    graph.get(vertical).remove(entry.getKey());
                    final double prob = entry.getValue() * (1.0 / graph.get(entry.getKey()).size());
                    if (vertical.equals(target)) {
                        answer = prob;
                        found = true;
                    }
                    queue.add(new AbstractMap.SimpleEntry<>(vertical, prob));
                }
            }
            currentSeconds--;
        }
        if (found) {
            return answer;
        } else {
            return 0;
        }
    }

}
