package leetcode.oo.tree;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
final class LowestCommonAncestorBinaryTree {

    PlainTree lowestCommonAncestor(final PlainTree root, final PlainTree p, final PlainTree q) {
        if (root != null) {
            if (root.val == p.val || root.val == q.val) {
                return root;
            }
            final PlainTree left = this.lowestCommonAncestor(root.left, p, q);
            final PlainTree right = this.lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return right;
            }
            if (right == null) {
                return left;
            }
            return right;
        }
        return null;
    }
}

