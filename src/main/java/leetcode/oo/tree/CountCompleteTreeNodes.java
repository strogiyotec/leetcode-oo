package leetcode.oo.tree;

//https://leetcode.com/problems/count-complete-tree-nodes/
public final class CountCompleteTreeNodes {

    public int countNodes(final PlainTree root) {
        final int left = this.leftHeight(root);
        final int right = this.rightHeight(root);
        if (left == right) {
            return (int) (StrictMath.pow(2, left) - 1);
        } else {
            return 1 + this.countNodes(root.left)+this.countNodes(root.right);
        }
    }

    private int leftHeight(final PlainTree tree) {
        if (tree == null) {
            return 0;
        }
        return 1 + this.leftHeight(tree.left);
    }

    private int rightHeight(final PlainTree tree) {
        if (tree == null) {
            return 0;
        }
        return 1 + this.rightHeight(tree.right);
    }
}
