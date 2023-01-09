package leetcode.oo.tree;

/**
 * Balanced binary tree.
 * See {@link <a href ="https://leetcode.com/problems/balanced-binary-tree/">https://leetcode.com/problems/balanced-binary-tree/</a>}
 */
final class BalancedBinaryTree {

    private boolean isBalanced = true;

    boolean isBalanced(final PlainTree root) {
        this.height(root);
        return this.isBalanced;
    }

    private int height(final PlainTree node) {
        if (node == null || !this.isBalanced) {
            return 0;
        }
        final int left = this.height(node.left);
        final int right = this.height(node.right);
        if (Math.abs(left - right) > 1) {
            this.isBalanced = false;
        }
        return Math.max(left,right)+1;
    }
}
