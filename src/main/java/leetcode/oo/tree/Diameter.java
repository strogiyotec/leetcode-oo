package leetcode.oo.tree;

public final class Diameter {

    private int max = 0;

    public int diameterOfBinaryTree(final PlainTree root) {
        this.findDiameter(root);
        return this.max;
    }

    private int findDiameter(final PlainTree root) {
        if (root == null) {
            return 0;
        }
        final int left = this.findDiameter(root.left);
        final int right = this.findDiameter(root.right);
        this.max = Math.max(left + right, this.max);
        return Math.max(left, right) + 1;
    }

}
