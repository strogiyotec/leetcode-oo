package leetcode.oo.tree;

/**
 * Maximum Depth of Binary Tree.
 * See {@link <a href ="https://leetcode.com/problems/maximum-depth-of-binary-tree/">https://leetcode.com/problems/maximum-depth-of-binary-tree/</a>}.
 */
final class NodeDepth {

    int maxDepth(final PlainTree root) {
        return this.helper(root, 0);
    }

    private int helper(final PlainTree node, final int depth) {
        if (node == null) {
            return depth;
        }
        return Math.max(
                this.helper(node.left, depth + 1),
                this.helper(node.right, depth + 1)
        );
    }
}
