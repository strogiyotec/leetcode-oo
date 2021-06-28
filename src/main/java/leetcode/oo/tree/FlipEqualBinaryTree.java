package leetcode.oo.tree;

//https://leetcode.com/problems/flip-equivalent-binary-trees/
public final class FlipEqualBinaryTree {

    public boolean flipEquiv(PlainTree root1, PlainTree root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null && root2 != null || root2 == null && root1 != null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return this.flipEquiv(root1.left, root2.left) && this.flipEquiv(root1.right, root2.right) ||
            this.flipEquiv(root1.left, root2.right) && this.flipEquiv(root1.right, root2.left);
    }
}
