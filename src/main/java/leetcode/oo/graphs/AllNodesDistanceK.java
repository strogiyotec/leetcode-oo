package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public final class AllNodesDistanceK {

    public List<Integer> distanceK(PlainTree root, PlainTree target, int K) {
        final IdentityHashMap<PlainTree, Set<PlainTree>> graph = new IdentityHashMap<>(16);
        this.buildGraph(root, graph);
        final List<Integer> solution = new ArrayList<>(16);
        this.dfs(target, -1, graph, K, solution);
        return solution;
    }

    private void dfs(final PlainTree target, final int prev, final Map<PlainTree, Set<PlainTree>> graph, final int distance, final List<Integer> solution) {
        if (distance == 0) {
            solution.add(target.val);
        }
        for (final PlainTree vertex : graph.getOrDefault(target, Collections.emptySet())) {
            if (vertex.val != prev) {
                this.dfs(vertex, target.val, graph, distance - 1, solution);
            }
        }
    }

    private void buildGraph(final PlainTree root, final Map<PlainTree, Set<PlainTree>> graph) {
        if (root != null) {
            graph.putIfAbsent(root, new HashSet<>());
            if (root.left != null) {
                graph.putIfAbsent(root.left, new HashSet<>());
                graph.get(root).add(root.left);
                graph.get(root.left).add(root);
            }
            if (root.right != null) {
                graph.putIfAbsent(root.right, new HashSet<>());
                graph.get(root).add(root.right);
                graph.get(root.right).add(root);
            }
            this.buildGraph(root.left, graph);
            this.buildGraph(root.right, graph);
        }
    }
}
