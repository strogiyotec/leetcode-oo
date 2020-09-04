package leetcode.oo.tree;


/**
 * Symmetric Trees.
 * See {@link <a href ="https://leetcode.com/problems/symmetric-tree/">https://leetcode.com/problems/symmetric-tree/</a>}
 */
final class SymmetricTrees {

    boolean isSymmetric(final PlainTree root) {
        if (root == null) {
            return true;
        }
        return this.isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(final PlainTree left, final PlainTree right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null) {
            return false;
        }
        if (right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return this.isSymmetric(left.left, right.right) && this.isSymmetric(left.right, right.left);
    }
}
