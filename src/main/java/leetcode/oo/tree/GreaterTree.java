package leetcode.oo.tree;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * Convert BST to Greater Tree.
 * See {@link <a href ="https://leetcode.com/problems/convert-bst-to-greater-tree/">https://leetcode.com/problems/convert-bst-to-greater-tree/</a>}.
 */
public final class GreaterTree {

    /**
     * Convert bst to greater tree.
     *
     * @param root Root
     * @return Greater tree
     */
    public TreeNode convertBst(final TreeNode root) {
        this.convert(root, new AtomicInteger(0));
        return root;
    }

    /**
     * Convert tree to greater value tree.
     *
     * @param node Node
     * @param sum  Total sum
     * @return Converted Tree
     */
    private TreeNode convert(final TreeNode node, final AtomicInteger sum) {
        if (node != null) {
            this.convert(node.right(), sum);
            node.updateValue(sum.addAndGet(node.value()));
            this.convert(node.left(), sum);
        }
        return node;
    }
}
