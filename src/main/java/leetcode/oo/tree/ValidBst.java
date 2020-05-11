package leetcode.oo.tree;

/**
 * Validate Binary Search tree.
 * See {@link <a href ="https://leetcode.com/problems/validate-binary-search-tree/">https://leetcode.com/problems/validate-binary-search-tree/</a>}.
 */
public final class ValidBst {

    /**
     * Check if it's a valid BST.
     * TODO write test
     *
     * @param treeNode BST to check
     * @return True if valid
     */
    public boolean isValid(final LeafNode treeNode) {
        return this.checkNode(treeNode, null, null);
    }

    /**
     * Check if lower and upper nodes are valid.
     *
     * @param current Current node
     * @param lower   Lower node
     * @param upper   Upper node
     * @return True if valid
     */
    @SuppressWarnings("ReturnCount")
    private boolean checkNode(
            final TreeNode current,
            final TreeNode lower,
            final TreeNode upper
    ) {
        if (current == null) {
            return true;
        }
        if (upper != null && upper.value() <= current.value()) {
            return false;
        }
        if (lower != null && lower.value() >= current.value()) {
            return false;
        }
        return this.checkNode(current.left(), lower, current)
                && this.checkNode(current.right(), current, upper);
    }
}
