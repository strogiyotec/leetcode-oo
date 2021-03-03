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
        final Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adjacent.put(i, new HashSet<>());
        }
        for (final int[] edge : edges) {
            adjacent.get(edge[0]).add(edge[1]);
            adjacent.get(edge[1]).add(edge[0]);
        }
        final List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adjacent.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        int size = n;
        while (size > 2) {
            final List<Integer> nextLevel = new ArrayList<>();
            size -= leaves.size();
            for (final Integer leaf : leaves) {
                final Integer leafVerticle = adjacent.get(leaf).iterator().next();
                adjacent.get(leafVerticle).remove(leaf);
                if (adjacent.get(leafVerticle).size() == 1) {
                    nextLevel.add(leafVerticle);
                }
            }
            leaves.clear();
            leaves.addAll(nextLevel);
        }
        return leaves;
    }
}
