package leetcode.oo.tree;

public final class Diameter {

    private int max = 0;

    public int diameterOfBinaryTree(final PlainTree root) {
        this.maxPath(root);
        return this.max;
    }

    private int maxPath(final PlainTree root) {
        if (root == null) {
            return 0;
        }
        final int left = this.maxPath(root.left);
        final int right = this.maxPath(root.right);
        this.max = Math.max(this.max, left + right);
        return Math.max(left, right) + 1;
    }
}
