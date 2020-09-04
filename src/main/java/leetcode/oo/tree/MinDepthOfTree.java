package leetcode.oo.tree;

/**
 * Min depth of binary tree.
 * See {@link <a href ="https://leetcode.com/problems/minimum-depth-of-binary-tree/">https://leetcode.com/problems/minimum-depth-of-binary-tree/</a>}.
 */
final class MinDepthOfTree {

    int minDepth(final PlainTree root) {
        return this.minDepth(root, 1);
    }

    private int minDepth(final PlainTree tree, int depth) {
        if (tree == null) {
            return Integer.MAX_VALUE;
        }
        if (tree.left == null && tree.right == null) {
            return depth;
        }
        return Math.min(
                this.minDepth(tree.left, depth + 1),
                this.minDepth(tree.right, depth + 1)
        );
    }
}
