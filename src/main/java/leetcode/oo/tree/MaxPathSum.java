package leetcode.oo.tree;

/**
 * Binary Tree Maximum Path Sum.
 * See {@link <a href ="https://leetcode.com/problems/binary-tree-maximum-path-sum/">https://leetcode.com/problems/binary-tree-maximum-path-sum/</a>}.
 */
final class MaxPathSum {

    private int max;

    int maxPathSum(final PlainTree root) {
        this.dfs(root);
        return this.max;
    }

    private int dfs(final PlainTree tree) {
        if (tree != null) {
            final int left = this.dfs(tree.left);
            final int right = this.dfs(tree.right);
            final int sum = left + right + tree.val;
            this.max = Math.max(this.max,sum);
            return Math.max(
                sum+right,
                sum+left
            );
        } else {
            return 0;
        }
    }

}
