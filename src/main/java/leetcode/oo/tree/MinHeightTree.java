package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/minimum-height-trees/
final class MinHeightTree {

    List<Integer> findMinHeightTrees(int n, int[][] edges) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>(edges.length << 1);
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (final int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        final List<Integer> leaves = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (graph.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        int size = n;
        while (size > 2) {
            size -= leaves.size();
            final List<Integer> nextLevel = new ArrayList<>();
            for (final Integer leaf : leaves) {
                final Integer next = graph.get(leaf).iterator().next();
                graph.get(next).remove(leaf);
                if (graph.get(next).size() == 1) {
                    nextLevel.add(next);
                }
            }
            leaves.clear();
            leaves.addAll(nextLevel);
        }
        return leaves;
    }
}
