package leetcode.oo.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/
final class MinCostApples {

    int minTime(final int size, final int[][] edges, final List<Boolean> hasApple) {
        final Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for (int i = 0; i < size; i++) {
            adjacent.put(i, new HashSet<>());
        }
        for (final int[] edge : edges) {
            adjacent.get(edge[0]).add(edge[1]);
            adjacent.get(edge[1]).add(edge[0]);
        }
        final Set<Integer> visited = new HashSet<>();
        return this.dfs(adjacent, visited, hasApple, 0, 0);
    }

    private int dfs(final Map<Integer, Set<Integer>> adjacent,
        final Set<Integer> visited,
        final List<Boolean> hasApple,
        final int currentNode,
        final int cost
    ) {
        if (visited.contains(currentNode)) {
            return 0;
        }
        visited.add(currentNode);
        int totalCost = 0;
        for (final Integer vertex : adjacent.get(currentNode)) {
            totalCost += this.dfs(adjacent, visited, hasApple, vertex, 2);
        }
        if (totalCost == 0 && !hasApple.get(currentNode)) {
            return 0;
        }
        return totalCost + cost;
    }
}
