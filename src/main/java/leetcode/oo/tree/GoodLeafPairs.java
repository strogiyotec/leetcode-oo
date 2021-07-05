package leetcode.oo.tree;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/
public final class GoodLeafPairs {

    public static void main(String[] args) {
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.right = new PlainTree(3);
        tree.left.left = new PlainTree(4);
        tree.left.right = new PlainTree(5);
        tree.right.left = new PlainTree(6);
        tree.right.right = new PlainTree(7);
        System.out.println(new GoodLeafPairs().countPairs(
            tree, 3
        ));
    }

    public int countPairs(final PlainTree root, final int distance) {
        final Set<PlainTree> leaves = new HashSet<>(16);
        final Map<PlainTree, List<PlainTree>> graph = new HashMap<>(16);
        this.inOrder(root, graph, leaves);
        int cnt = 0;
        final Set<AbstractMap.SimpleEntry<Integer, Integer>> cache = new HashSet<>(16);
        for (final PlainTree leaf : leaves) {
            final PlainTree pair = this.dfs(leaf, leaves, graph, null, distance);
            if (pair != null) {
                final AbstractMap.SimpleEntry<Integer, Integer> first = new AbstractMap.SimpleEntry<>(pair.val, leaf.val);
                final AbstractMap.SimpleEntry<Integer, Integer> second = new AbstractMap.SimpleEntry<>(leaf.val, pair.val);
                if (!cache.contains(first) && !cache.contains(second)) {
                    cnt++;
                    cache.add(first);
                    cache.add(second);
                }
            }
        }
        return cnt;
    }

    private PlainTree dfs(final PlainTree node, final Set<PlainTree> leaves, final Map<PlainTree, List<PlainTree>> graph, final PlainTree prev, final int distance) {
        if (distance <= 0 && !leaves.contains(node)) {
            return null;
        }
        for (final PlainTree leaf : graph.get(node)) {
            if (leaf != prev) {
                if (leaves.contains(leaf)) {
                    return leaf;
                }
                final PlainTree dfs = this.dfs(leaf, leaves, graph, node, distance - 1);
                if (dfs != null) {
                    return dfs;
                }
            }
        }
        return null;
    }

    private void inOrder(final PlainTree root, final Map<PlainTree, List<PlainTree>> graph, final Set<PlainTree> leaves) {
        if (root != null) {
            graph.putIfAbsent(root, new ArrayList<>(16));
            if (root.left == null && root.right == null) {
                leaves.add(root);
            }
            if (root.left != null) {
                graph.putIfAbsent(root.left, new ArrayList<>());
                graph.get(root).add(root.left);
                graph.get(root.left).add(root);
                this.inOrder(root.left, graph, leaves);
            }
            if (root.right != null) {
                graph.putIfAbsent(root.right, new ArrayList<>());
                graph.get(root).add(root.right);
                graph.get(root.right).add(root);
                this.inOrder(root.right, graph, leaves);
            }
        }
    }
}
