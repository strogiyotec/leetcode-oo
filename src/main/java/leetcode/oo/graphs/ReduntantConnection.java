package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/redundant-connection/
final class ReduntantConnection {

    int[] findRedundantConnection(final int[][] edges) {
        final Map<Integer, List<Integer>> adjacent = new HashMap<>();
        for (int i = 1; i <= edges.length; i++) {
            adjacent.put(i, new ArrayList<>());
        }
        int[] solution = null;
        for (final int[] edge : edges) {
            if (this.dfs(edge[0], edge[1], 0, adjacent)) {
                solution = edge;
            } else {
                adjacent.get(edge[0]).add(edge[1]);
                adjacent.get(edge[1]).add(edge[0]);
            }
        }
        return solution;
    }

    private boolean dfs(final int from, final int to, final int prev, final Map<Integer, List<Integer>> adjacent) {
        for (final Integer verticle : adjacent.get(from)) {
            if(verticle.equals(prev)){
                continue;
            }
            if(verticle.equals(to)){
                return true;
            }
            if(this.dfs(verticle,to,from,adjacent)){
                return true;
            }
        }
        return false;
    }

}
