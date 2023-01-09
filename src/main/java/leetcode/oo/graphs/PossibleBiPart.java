package leetcode.oo.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Possible bipartition.
 * See {@link <a href ="https://leetcode.com/problems/possible-bipartition/">https://leetcode.com/problems/possible-bipartition/</a>}.
 */
final class PossibleBiPart {

    boolean possibleBipartition(final int nodes, final int[][] dislikes) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>(nodes << 1);
        for (int i = 1; i <= nodes; i++) {
            graph.put(i, new HashSet<>());
        }
        for (final int[] dislike : dislikes) {
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }
        final int[] colors = new int[nodes + 1];
        for (int i = 1; i <= nodes; i++) {
            if (colors[i] == 0 && !this.dfs(i, -1, graph, colors, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(final int node, final int prev, final Map<Integer, Set<Integer>> graph, final int[] colors, final int color) {
        colors[node] = color;
        for (final Integer vertex : graph.get(node)) {
            if (vertex != prev) {
                if (colors[vertex] != 0) {
                    if(colors[vertex] == colors[node]){
                        return false;
                    } else{
                        continue;
                    }
                }
                if (!this.dfs(vertex, node, graph, colors, color * -1)) {
                    return false;
                }
            }
        }
        return true;
    }

}
