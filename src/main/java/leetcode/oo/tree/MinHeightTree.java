package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/minimum-height-trees/
public final class MinHeightTree {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
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
            size -= leaves.size();
            final List<Integer> nextLevel = new ArrayList<>();
            for (final Integer leaf : leaves) {
                final Integer next = adjacent.get(leaf).iterator().next();
                adjacent.get(next).remove(leaf);
                if (adjacent.get(next).size() == 1) {
                    nextLevel.add(next);
                }
            }
            leaves.clear();
            leaves.addAll(nextLevel);
        }
        return leaves;
    }
}
