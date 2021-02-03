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
        final Map<Integer, List<Integer>> adjacent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacent.put(i, new ArrayList<>());
        }
        for (final List<Integer> connection : connections) {
            adjacent.get(connection.get(0)).add(connection.get(1));
            adjacent.get(connection.get(1)).add(connection.get(0));
        }
        final Set<Integer> visited = new HashSet<>();
        final List<List<Integer>> solution = new ArrayList<>();
        final int[] timestamps = new int[n];
        this.dfs(0, 0, visited, adjacent, solution, 0, timestamps);
        return solution;
    }

    private void dfs(
        final int currentNode,
        final int parent,
        final Set<Integer> visited,
        final Map<Integer, List<Integer>> adjacent,
        final List<List<Integer>> solution,
        int label,
        final int[] timestamps
    ) {
        timestamps[currentNode] = label++;
        final int before = timestamps[currentNode];
        visited.add(currentNode);
        for (final Integer verticle : adjacent.get(currentNode)) {
            if (verticle.equals(parent)) {
                continue;
            }
            if (visited.contains(verticle)) {
                timestamps[currentNode] = Math.min(timestamps[currentNode], timestamps[verticle]);
            } else {
                this.dfs(verticle, currentNode, visited, adjacent, solution, label, timestamps);
                timestamps[currentNode] = Math.min(timestamps[currentNode], timestamps[verticle]);
                if (before < timestamps[verticle]) {
                    solution.add(Arrays.asList(currentNode, verticle));
                }
            }
        }
    }
}
