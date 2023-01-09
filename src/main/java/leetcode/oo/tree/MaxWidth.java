package leetcode.oo.tree;

import java.util.AbstractMap;
import java.util.Deque;
import java.util.LinkedList;

//https://leetcode.com/problems/maximum-width-of-binary-tree/
final class MaxWidth {

    int widthOfBinaryTree(PlainTree root) {
        final Deque<AbstractMap.SimpleImmutableEntry<Integer, PlainTree>> queue = new LinkedList<>();
        queue.add(new AbstractMap.SimpleImmutableEntry<>(1, root));
        int max = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            max = Math.max(
                queue.peekLast().getKey() - queue.peekFirst().getKey() + 1,
                max
            );
            for (int i = 0; i < size; i++) {
                var current = queue.poll();
                if (current.getValue().left != null) {
                    queue.add(new AbstractMap.SimpleImmutableEntry<>(current.getKey() * 2, current.getValue().left));
                }
                if (current.getValue().right != null) {
                    queue.add(new AbstractMap.SimpleImmutableEntry<>(current.getKey() * 2 + 1, current.getValue().right));
                }
            }
        }
        return max;
    }

}
