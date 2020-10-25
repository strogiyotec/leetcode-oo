package leetcode.oo.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Binary Tree Level Order Traversal.
 * See {@link <a href ="https://leetcode.com/problems/binary-tree-level-order-traversal/">https://leetcode.com/problems/binary-tree-level-order-traversal/</a>}
 */
final class LevelOrderTraversal {

    List<List<Integer>> levelOrder(final PlainTree root) {
        final List<List<Integer>> solution = new ArrayList<>(16);
        final Queue<PlainTree> queue = new ArrayDeque<>(16);
        queue.offer(root);
        while (!queue.isEmpty()) {
            final int size = queue.size();
            final List<Integer> list = new ArrayList<>(16);
            for (int i = 0; i < size; i++) {
                final PlainTree node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            solution.add(list);
        }
        return solution;
    }

}
