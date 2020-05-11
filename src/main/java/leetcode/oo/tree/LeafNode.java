package leetcode.oo.tree;

/**
 * Leaf node.
 */
public class LeafNode implements TreeNode {

    /**
     * Value.
     */
    private final int value;

    /**
     * Left.
     */
    private final LeafNode left;

    /**
     * Right.
     */
    private final LeafNode right;

    /**
     * Ctor.
     *
     * @param value Value
     * @param left  Left
     * @param right Right
     */
    public LeafNode(
            final int value,
            final LeafNode left,
            final LeafNode right
    ) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public final int value() {
        return this.value;
    }

    @Override
    public final TreeNode left() {
        return this.left;
    }

    @Override
    public final TreeNode right() {
        return this.right;
    }
}
