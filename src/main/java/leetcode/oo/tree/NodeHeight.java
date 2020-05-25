package leetcode.oo.tree;

/**
 * Height of the node.
 */
public final class NodeHeight {


    /**
     * Calculate the height of the root.
     *
     * @param root Root
     * @return Height
     */
    public int height(final TreeNode root) {
        return this.get(root) - 1;
    }

    /**
     * Calculate the height of the root.
     *
     * @param root Root
     * @return Height
     */
    private int get(final TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            final int left = this.get(root.left());
            final int right = this.get(root.right());
            return 1 + Math.max(left, right);
        }
    }
}
