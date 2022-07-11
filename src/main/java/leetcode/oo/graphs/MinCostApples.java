package leetcode.oo.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/
final class MinCostApples {

    int minTime(final int size, final int[][] edges, final List<Boolean> hasApple) {
        //key is an int , value is a set of adjacent nodes
        final Map<Integer, Set<Integer>> adjacentMap = new HashMap<>();
        this.buildMap(size, edges, adjacentMap);
        final Set<Integer> visited = new HashSet<>();
        return this.dfs(adjacentMap, visited, 0, hasApple);
    }

    private void buildMap(final int size, final int[][] edges, final Map<Integer, Set<Integer>> adjacentMap) {
        for (int i = 0; i < size; i++) {
            adjacentMap.put(i, new HashSet<>());
        }
        for (final int[] edge : edges) {
            adjacentMap.get(edge[0]).add(edge[1]);
            adjacentMap.get(edge[1]).add(edge[0]);
        }
    }

    private int dfs(final Map<Integer, Set<Integer>> adjacent, final Set<Integer> visited, final int currentApple, final List<Boolean> hasApple) {
        if (visited.contains(currentApple)) {
            return 0;
        }
        visited.add(currentApple);
        int cost = 0;
        for (final Integer nextApple : adjacent.get(currentApple)) {
            cost += this.dfs(adjacent, visited, nextApple, hasApple);
        }
        if (!hasApple.get(currentApple) && cost == 0) {
            return 0;
        } else {
            if (currentApple == 0) {
                return cost;
            } else {
                return 2 + cost;
            }
        }
    }

}
