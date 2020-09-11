package leetcode.oo.tree;

/**
 * Balanced binary tree.
 * See {@link <a href ="https://leetcode.com/problems/balanced-binary-tree/">https://leetcode.com/problems/balanced-binary-tree/</a>}
 */
final class BalancedBinaryTree {

    boolean isBalanced(final PlainTree root) {
        return this.height(root) != -1;
    }

    private int height(final PlainTree root) {
        if (root == null) {
            return 0;
        }
        final int left = this.height(root.left);
        if (left == -1) {
            return -1;
        }
        final int right = this.height(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}
