package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/minimum-height-trees/
public final class MinHeightTree {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return Collections.singletonList(1);
        }

        final List<Set<Integer>> adjacentList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacentList.add(new HashSet<>());
        }
        for (final int[] edge : edges) {
            adjacentList.get(edge[0]).add(edge[1]);
            adjacentList.get(edge[1]).add(edge[0]);
        }
        final List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (adjacentList.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        int remain = n;
        while (remain > 2) {
            remain -= leaves.size();
            final List<Integer> nextLevelLeaves = new ArrayList<>();
            for (final Integer leaf : leaves) {
                final Integer parent = adjacentList.get(leaf).iterator().next();
                adjacentList.get(parent).remove(leaf);
                if (adjacentList.get(parent).size() == 1) {
                    nextLevelLeaves.add(parent);
                }
            }
            leaves.clear();
            leaves.addAll(nextLevelLeaves);
        }
        return leaves;
    }
}
