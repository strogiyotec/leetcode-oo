package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class CriticalNetwork {

    List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        final Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacent.put(i, new HashSet<>());
        }
        for (final List<Integer> connection : connections) {
            adjacent.get(connection.get(0)).add(connection.get(1));
            adjacent.get(connection.get(1)).add(connection.get(0));
        }
        final Set<Integer> visited = new HashSet<>();
        final List<List<Integer>> solution = new ArrayList<>();
        final int[] timestamps = new int[n];
        this.dfs(0, visited, adjacent, solution, timestamps);
        return solution;
    }

    private void dfs(
        final int currentNode,
        final Set<Integer> visited,
        final Map<Integer, Set<Integer>> adjacent,
        final List<List<Integer>> solution,
        final int[] timestamps
    ) {
        timestamps[currentNode] = currentNode;
        final int before = timestamps[currentNode];
        visited.add(currentNode);
        for (final Integer verticle : adjacent.get(currentNode)) {
            if (visited.contains(verticle)) {
                timestamps[currentNode] = Math.min(timestamps[currentNode], timestamps[verticle]);
            } else {
                adjacent.get(verticle).remove(currentNode);
                this.dfs(verticle, visited, adjacent, solution, timestamps);
                timestamps[currentNode] = Math.min(timestamps[currentNode], timestamps[verticle]);
                if (before < timestamps[verticle]) {
                    solution.add(Arrays.asList(currentNode, verticle));
                }
            }
        }
    }
}
