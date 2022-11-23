package leetcode.oo.tree;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/description/
public final class TreeInfected {

    public static void main(String[] args) {
/*
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(5);
        tree.left.right = new PlainTree(4);
        tree.left.right.left = new PlainTree(9);
        tree.left.right.right = new PlainTree(2);

        tree.right = new PlainTree(3);
        tree.right.left = new PlainTree(10);
        tree.right.right = new PlainTree(6);
*/
        final PlainTree tree = new PlainTree(1);
        tree.left = new PlainTree(2);
        tree.left.left = new PlainTree(3);
        tree.left.left.left = new PlainTree(4);
        tree.left.left.left.left = new PlainTree(5);
        System.out.println(new TreeInfected().amountOfTime(tree, 3));
    }

    public int amountOfTime(PlainTree root, int start) {
        final Map<Integer, PlainTree> rootOfNode = new HashMap<>();
        this.inOrder(root, rootOfNode);
        final Set<Integer> visited = new HashSet<>();
        final PlainTree startNode = this.findNode(root, start);
        return this.infectedTime(rootOfNode, startNode, visited);
    }

    private int infectedTime(final Map<Integer, PlainTree> rootOfNode, final PlainTree startNode, final Set<Integer> visited) {
        final Queue<AbstractMap.SimpleImmutableEntry<Integer, PlainTree>> queue = new LinkedList<>();
        int lastInfectedTime = 0;
        queue.add(new AbstractMap.SimpleImmutableEntry<>(0, startNode));
        while (!queue.isEmpty()) {
            final AbstractMap.SimpleImmutableEntry<Integer, PlainTree> entry = queue.poll();
            final PlainTree current = entry.getValue();
            final Integer currentInfectedTime = entry.getKey();
            lastInfectedTime = currentInfectedTime;
            visited.add(current.val);
            final List<PlainTree> toVisit = Stream.of(rootOfNode.get(current.val), current.left, current.right).collect(Collectors.toList());
            for (final PlainTree tree : toVisit) {
                if (tree != null && !visited.contains(tree.val)) {
                    queue.add(new AbstractMap.SimpleImmutableEntry<>(currentInfectedTime + 1, tree));
                }
            }
        }
        return lastInfectedTime;
    }

    private PlainTree findNode(final PlainTree root, final int start) {
        if (root != null) {
            if (root.val == start) {
                return root;
            }
            final PlainTree left = this.findNode(root.left, start);
            if (left != null) {
                return left;
            }
            return this.findNode(root.right, start);
        }
        return null;
    }

    private void inOrder(final PlainTree root, final Map<Integer, PlainTree> rootOfNode) {
        if (root.left != null) {
            rootOfNode.put(root.left.val, root);
            this.inOrder(root.left, rootOfNode);
        }
        if (root.right != null) {
            rootOfNode.put(root.right.val, root);
            this.inOrder(root.right, rootOfNode);
        }
    }
}
