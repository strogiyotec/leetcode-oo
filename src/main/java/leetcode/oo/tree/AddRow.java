package leetcode.oo.tree;

import java.util.AbstractMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

//https://leetcode.com/problems/add-one-row-to-tree/
public final class AddRow {

    public PlainTree addOneRow(PlainTree root, int value, int depth) {
        if (depth == 1) {
            final PlainTree tree = new PlainTree(value);
            tree.left = root;
            return tree;
        }
        final Queue<AbstractMap.SimpleEntry<PlainTree, Boolean>> queue = new LinkedList<>();
        int currentDepth = 1;
        queue.add(new AbstractMap.SimpleEntry<>(root, false));
        final Map<PlainTree, PlainTree> childToParent = new IdentityHashMap<>();
        final Map<PlainTree, Boolean> lastLevel = new IdentityHashMap<>();
        while (!queue.isEmpty()) {
            final int size = queue.size();
            if (currentDepth == depth) {
                for (int i = 0; i < size; i++) {
                    final AbstractMap.SimpleEntry<PlainTree, Boolean> poll = queue.poll();
                    final PlainTree child = poll.getKey();
                    final Boolean isLeft = poll.getValue();
                    final PlainTree parent = childToParent.get(child);
                    lastLevel.remove(parent);
                    final PlainTree row = new PlainTree(value);
                    if (isLeft) {
                        parent.left = row;
                        row.left = child;
                    } else {
                        parent.right = row;
                        row.right = child;
                    }
                    if (parent.left == null) {
                        parent.left = new PlainTree(value);
                    }
                    if (parent.right == null) {
                        parent.right = new PlainTree(value);
                    }
                }
                for (final PlainTree lastLevelNode : lastLevel.keySet()) {
                    lastLevelNode.left = new PlainTree(value);
                    lastLevelNode.right = new PlainTree(value);
                }
                return root;
            }
            lastLevel.clear();
            for (int i = 0; i < size; i++) {
                final AbstractMap.SimpleEntry<PlainTree, Boolean> poll = queue.poll();
                lastLevel.put(poll.getKey(), true);
                final PlainTree node = poll.getKey();
                if (node.left != null) {
                    queue.add(new AbstractMap.SimpleEntry<>(node.left, true));
                    childToParent.put(node.left, node);
                }
                if (node.right != null) {
                    queue.add(new AbstractMap.SimpleEntry<>(node.right, false));
                    childToParent.put(node.right, node);
                }
            }
            currentDepth++;
        }
        if (currentDepth == depth) {
            for (final PlainTree lastLevelNode : lastLevel.keySet()) {
                lastLevelNode.left = new PlainTree(value);
                lastLevelNode.right = new PlainTree(value);
            }
        }
        return root;
    }
}
