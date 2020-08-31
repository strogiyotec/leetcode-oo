package leetcode.oo.tree;

/**
 * Validate Binary Search tree.
 * See {@link <a href ="https://leetcode.com/problems/validate-binary-search-tree/">https://leetcode.com/problems/validate-binary-search-tree/</a>}.
 */
final class ValidBst {

    /**
     * Check if it's a valid BST.
     *
     * @param treeNode BST to check
     * @return True if valid
     */
    boolean isValidBST(final TreeNode treeNode) {
        return this.check(treeNode, null, null);
    }

    private boolean check(final TreeNode treeNode, final Integer min, final Integer max) {
        if (treeNode != null) {
            if (min != null && treeNode.value() <= min) {
                return false;
            }
            if (max != null && treeNode.value() >= max) {
                return false;
            }
            return this.check(treeNode.left(), min, treeNode.value()) && this.check(treeNode.right(), treeNode.value(), max);
        }
        return true;
    }
}
