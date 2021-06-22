package leetcode.oo.tree;

import java.util.AbstractMap;
import java.util.Deque;
import java.util.LinkedList;

//https://leetcode.com/problems/maximum-width-of-binary-tree/
final class MaxWidth {

    int widthOfBinaryTree(PlainTree root) {
        final Deque<AbstractMap.SimpleEntry<PlainTree, Integer>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleEntry<>(root, 1));
        int maxWidth = 1;
        while (!queue.isEmpty()) {
            final AbstractMap.SimpleEntry<PlainTree, Integer> first = queue.peekFirst();
            final AbstractMap.SimpleEntry<PlainTree, Integer> last = queue.peekLast();
            maxWidth = Math.max(maxWidth, last.getValue() - first.getValue() + 1);
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final AbstractMap.SimpleEntry<PlainTree, Integer> node = queue.poll();
                if (node.getKey().left != null) {
                    queue.add(new AbstractMap.SimpleEntry<>(node.getKey().left, node.getValue() << 1));
                }
                if (node.getKey().right != null) {
                    queue.add(new AbstractMap.SimpleEntry<>(node.getKey().right, (node.getValue() << 1) + 1));
                }
            }
        }
        return maxWidth;
    }

}
