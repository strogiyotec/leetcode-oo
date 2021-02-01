package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/all-paths-from-source-to-target/
final class AllPathFromSource {

    List<List<Integer>> allPathsSourceTarget(final int[][] graph) {
        final Map<Integer, List<Integer>> adjacentList = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            adjacentList.putIfAbsent(i, new ArrayList<>());
            for (int j = 0; j < graph[i].length; j++) {
                adjacentList.get(i).add(graph[i][j]);
            }
        }
        final List<Integer> current = new ArrayList<>();
        final List<List<Integer>> solution = new ArrayList<>();
        this.dfs(current, solution, adjacentList, graph.length - 1, 0);
        return solution;
    }

    private boolean dfs(final List<Integer> current, final List<List<Integer>> solution, final Map<Integer, List<Integer>> adjacentList, final int destination, final int from) {
        current.add(from);
        if (destination == from) {
            return true;
        }
        for (final Integer verticle : adjacentList.getOrDefault(from, Collections.emptyList())) {
            if (this.dfs(current, solution, adjacentList, destination, verticle)) {
                solution.add(new ArrayList<>(current));
            }
            current.remove(current.size() - 1);
        }
        return false;
    }
}
