package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Invert tree.
 * See {@link <a href ="https://leetcode.com/problems/invert-binary-tree/">https://leetcode.com/problems/invert-binary-tree/</a>}
 */
final class InvertTree {

    PlainTree invertTree(final PlainTree root) {
        final Queue<PlainTree> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final PlainTree current = queue.poll();
            final PlainTree temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        return root;
    }
}
