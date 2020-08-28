package leetcode.oo.tree;

/**
 * Leaf node.
 */
@SuppressWarnings("HiddenField")
final class BstNode implements TreeNode {

    /**
     * Value.
     */
    private int value;

    /**
     * Left.
     */
    private TreeNode left;

    /**
     * Right.
     */
    private TreeNode right;

    /**
     * Ctor.
     *
     * @param value Value
     * @param left  Left
     * @param right Right
     */
    BstNode(
            final int value,
            final BstNode left,
            final BstNode right
    ) {
        this.value = value;
        this.left = left;
        this.right = right;
    }


    /**
     * Ctor.
     *
     * @param value Value
     */
     BstNode(
            final int value
    ) {
        this(
                value,
                null,
                null
        );
    }

    @Override
    public int value() {
        return this.value;
    }

    @Override
    public TreeNode left() {
        return this.left;
    }

    @Override
    public TreeNode right() {
        return this.right;
    }

    @Override
    public void updateValue(final int value) {
        this.value = value;
    }

    @Override
    public void updateLeft(final TreeNode left) {
        this.left = left;
    }

    @Override
    public void updateRight(final TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
