package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * Cousins in Binary tree.
 * See {@link <a href ="https://leetcode.com/problems/cousins-in-binary-tree/">https://leetcode.com/problems/cousins-in-binary-tree/</a>}
 */
final class Cousins {

    boolean isCousins(final PlainTree root, final int x, final int y) {
        final Queue<PlainTree> queue = new ArrayDeque<>(16);
        queue.offer(root);
        while (!queue.isEmpty()) {
            boolean xFound = false;
            boolean yFound = false;
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final PlainTree tree = queue.poll();
                if (tree.val == x) {
                    xFound = true;
                }
                if (tree.val == y) {
                    yFound = true;
                }
                if (tree.left != null && tree.right != null) {
                    if (tree.left.val == x && tree.right.val == y) {
                        return false;
                    }
                    if (tree.right.val == x && tree.left.val == y) {
                        return false;
                    }
                }
                if (tree.left != null) {
                    queue.offer(tree.left);
                }
                if (tree.right != null) {
                    queue.offer(tree.right);
                }
            }
            if (xFound && yFound) {
                return true;
            }
        }
        return false;
    }

}
