package leetcode.oo.tree;

/**
 * Utility class.
 */
public final class BstFromArray {

    /**
     * Create TreeNode from array for tests.
     *
     * @param values Array of values
     * @return TreeNode
     */
    public TreeNode create(final int[] values) {
        final BstNode root = new BstNode(values[0]);
        for (int i = 1; i < values.length; i++) {
            this.insert(root, values[i]);
        }
        return root;
    }

    /**
     * Insert given value into the root.
     *
     * @param root  Root
     * @param value Value
     */
    private void insert(final TreeNode root, final int value) {
        if (root.value() > value) {
            if (root.left() == null) {
                root.updateLeft(new BstNode(value));
            } else {
                this.insert(root.left(), value);
            }
        } else {
            if (root.right() == null) {
                root.updateRight(new BstNode(value));
            } else {
                this.insert(root.right(), value);
            }
        }
    }
}

