package leetcode.oo.tree;

//https://leetcode.com/problems/binary-tree-pruning/
final class PruneTree {

    PlainTree pruneTree(final PlainTree root) {
        final boolean b = this.inOrder(root);
        if (!b) {
            return null;
        }
        return root;
    }

    private boolean inOrder(final PlainTree root) {
        if (root == null) {
            return true;
        }
        if (root.val == 0 && root.left == null && root.right == null) {
            return false;
        }
        if (root.val == 1 && root.left == null && root.right == null) {
            return true;
        }
        boolean left = false;
        if (root.left != null) {
            left = this.inOrder(root.left);
        }
        boolean right = false;
        if (root.right != null) {
            right = this.inOrder(root.right);
        }
        if (!left) {
            root.left = null;
        }
        if (!right) {
            root.right = null;
        }
        return root.val == 1 || left || right;
    }
}
