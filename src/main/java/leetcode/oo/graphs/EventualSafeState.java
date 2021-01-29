package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class EventualSafeState {

    public static void main(String[] args) {
        System.out.println(new EventualSafeState().eventualSafeNodes(
            new int[][]{
                {1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}
            }
        ));
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        final List<Integer> solution = new ArrayList<>();
        final Set<Integer> badOnes = new HashSet<>();
        for (int i = 0; i < graph.length; i++) {
            final Set<Integer> visited = new HashSet<>();
            if (this.dfs(visited, i, graph, badOnes)) {
                solution.add(i);
            } else {
                badOnes.add(i);
            }
        }
        return solution;
    }

    private boolean dfs(final Set<Integer> visited, final int parent, final int[][] graph, final Set<Integer> set) {
        if (set.contains(parent)) {
            return false;
        }
        visited.add(parent);
        for (final int verticle : graph[parent]) {
            if (visited.contains(verticle) || !this.dfs(visited, verticle, graph, set)) {
                set.add(verticle);
                return false;
            }
        }
        visited.remove(parent);
        return true;
    }
}
