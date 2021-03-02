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

    private static final int RED = 1;

    private static final int BLUE = 2;

    boolean possibleBipartition(final int nodes, final int[][] dislikes) {
        final Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for (int i = 1; i <= nodes; i++) {
            adjacent.put(i, new HashSet<>());
        }
        for (final int[] dislike : dislikes) {
            adjacent.get(dislike[0]).add(dislike[1]);
            adjacent.get(dislike[1]).add(dislike[0]);
        }
        final int[] colors = new int[nodes + 1];
        for (int i = 1; i <= nodes; i++) {
            if (colors[i] == 0) {
                if (this.dfs(adjacent, i, 1, colors)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfs(final Map<Integer, Set<Integer>> adjacent, final int node, final int color, final int[] colors) {
        colors[node] = color;
        for (final Integer verticle : adjacent.get(node)) {
            if (colors[verticle] == color) {
                return true;
            }
            if (colors[verticle] != 0) {
                continue;
            }
            if (this.dfs(adjacent, verticle, -1 * color, colors)) {
                return true;
            }
        }
        return false;
    }

}
