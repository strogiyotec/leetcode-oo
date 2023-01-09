package leetcode.oo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Invert tree.
 * See {@link <a href ="https://leetcode.com/problems/invert-binary-tree/">https://leetcode.com/problems/invert-binary-tree/</a>}
 */
final class InvertTree {

    PlainTree invertTree(final PlainTree root) {
        if (root == null) {
            return null;
        }
        final Queue<PlainTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            final PlainTree current = queue.poll();
            final PlainTree left = current.left;
            final PlainTree right = current.right;
            current.right = left;
            current.left = right;
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
        return root;
    }
}
