package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public final class AllNodesDistanceK {

    public List<Integer> distanceK(PlainTree root, PlainTree target, int K) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>();
        this.buildGraph(graph, root);
        final List<Integer> list = new ArrayList<>();
        this.dfs(-1, target.val, graph, list, K);
        return list;
    }

    private void dfs(final int prev, final int current, final Map<Integer, Set<Integer>> graph, final List<Integer> list, int steps) {
        if (steps == 0) {
            list.add(current);
        }
        for (final Integer vertex : graph.getOrDefault(current, Collections.emptySet())) {
            if (vertex != prev) {
                this.dfs(current, vertex, graph, list, steps - 1);
            }
        }
    }

    private void buildGraph(final Map<Integer, Set<Integer>> graph, final PlainTree root) {
        if (root != null) {
            graph.putIfAbsent(root.val, new HashSet<>());
            if (root.left != null) {
                graph.putIfAbsent(root.left.val, new HashSet<>());
                graph.get(root.val).add(root.left.val);
                graph.get(root.left.val).add(root.val);
                this.buildGraph(graph, root.left);
            }
            if (root.right != null) {
                graph.putIfAbsent(root.right.val, new HashSet<>());
                graph.get(root.val).add(root.right.val);
                graph.get(root.right.val).add(root.val);
                this.buildGraph(graph, root.right);
            }
        }
    }

}
