package leetcode.oo.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Possible bipartition.
 * See {@link <a href ="https://leetcode.com/problems/possible-bipartition/">https://leetcode.com/problems/possible-bipartition/</a>}.
 */
final class PossibleBiPart {

    private static final int RED = 1;

    private static final int BLUE = 2;

    boolean possibleBipartition(final int nodes, final int[][] dislikes) {
        final Map<Integer, List<Integer>> map = PossibleBiPart.buildMap(nodes, dislikes);
        final int[] colors = new int[nodes + 1];
        final Queue<Integer> queue = new ArrayDeque<>(nodes);
        final Collection<Integer> visited = new HashSet<>(nodes);
        for (int i = 1; i <= nodes; i++) {
            queue.add(i);
            while (!queue.isEmpty()) {
                final Integer current = queue.poll();
                if (!visited.contains(current)) {
                    visited.add(current);
                    for (final Integer edge : map.getOrDefault(current, Collections.emptyList())) {
                        if (colors[edge] == 0) {
                            colors[edge] = colors[current] == RED ? BLUE : RED;
                            queue.add(edge);
                        } else {
                            if (colors[edge] == colors[current]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static Map<Integer, List<Integer>> buildMap(final int nodes, final int[][] dislikes) {
        final Map<Integer, List<Integer>> map = new HashMap<>(nodes);
        for (final int[] dislike : dislikes) {
            map.merge(dislike[0], new ArrayList<>(Collections.singletonList(dislike[1])), (old, n) -> {
                old.addAll(n);
                return old;
            });
            map.merge(dislike[1], new ArrayList<>(Collections.singletonList(dislike[0])), (old, n) -> {
                old.addAll(n);
                return old;
            });
        }
        return map;
    }

}
