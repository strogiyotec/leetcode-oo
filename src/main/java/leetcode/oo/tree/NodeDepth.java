package leetcode.oo.tree;

/**
 * Find depth of the node.
 */
public final class NodeDepth {

    /**
     * Find depth of the node with given value.
     *
     * @param start Given node
     * @param value Value
     * @return Depth of node or -1 if no node with given value
     */
    public int depth(final TreeNode start, final int value) {
        return this.depth(start, value, 0);
    }

    /**
     * Find depth of the node with given value.
     *
     * @param node  Given node
     * @param value Value
     * @param depth Current depth
     * @return Depth of node or -1 if no node with given value
     */
    @SuppressWarnings("ReturnCount")
    private int depth(final TreeNode node, final int value, final int depth) {
        if (node == null) {
            return -1;
        }
        if (node.value() == value) {
            return depth;
        }
        if (node.value() < value) {
            return depth(node.right(), value, depth + 1);
        } else {
            return depth(node.left(), value, depth + 1);

        }
    }
}
