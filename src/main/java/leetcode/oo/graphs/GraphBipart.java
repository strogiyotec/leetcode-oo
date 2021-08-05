package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/is-graph-bipartite/
public final class GraphBipart {

    public static void main(String[] args) {
        System.out.println(new GraphBipart().isBipartite(new int[][]{
            {1,2,3},{0,2},{0,1,3},{0,2}
        }));
    }

    public boolean isBipartite(int[][] graph) {
        final List<Set<Integer>> adjacent = new ArrayList<>(graph.length);
        for (int i = 0; i < graph.length; i++) {
            adjacent.add(i, new HashSet<>());
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adjacent.get(i).add(graph[i][j]);
            }
        }
        final int[] colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (colors[i] == 0) {
                if (!this.dfs(i, colors, adjacent, 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(final int node, final int[] colors, final List<Set<Integer>> adjacent, final int color) {
        if (colors[node] != 0) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (final Integer vertex : adjacent.get(node)) {
            if(!this.dfs(vertex, colors, adjacent, color * -1)){
                return false;
            }
        }
        return true;
    }

}
