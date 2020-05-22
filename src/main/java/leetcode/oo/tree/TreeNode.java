package leetcode.oo.tree;

/**
 * Tree node.
 */
public interface TreeNode {

    /**
     * Node value.
     *
     * @return Value
     */
    int value();

    /**
     * Left node.
     *
     * @return Left
     */
    TreeNode left();

    /**
     * Right node.
     *
     * @return Right
     */
    TreeNode right();

    /**
     * Update value in node.
     *
     * @param value New value
     */
    void updateValue(int value);

    /**
     * Update right node.
     *
     * @param left Left
     */
    void updateLeft(TreeNode left);

    /**
     * Update right node.
     *
     * @param right Right
     */
    void updateRight(TreeNode right);

}
