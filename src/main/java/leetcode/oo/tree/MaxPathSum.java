package leetcode.oo.tree;

/**
 * Binary Tree Maximum Path Sum.
 * See {@link <a href ="https://leetcode.com/problems/binary-tree-maximum-path-sum/">https://leetcode.com/problems/binary-tree-maximum-path-sum/</a>}.
 */
final class MaxPathSum {

    int maxPathSum(final PlainTree root) {
        final int[] sum = {root.val};
        this.dfs(root, sum);
        return sum[0];
    }

    private int dfs(final PlainTree tree, final int[] sum) {
        if (tree != null) {
            final int left = Math.max(0, this.dfs(tree.left, sum));
            final int right = Math.max(0, this.dfs(tree.right, sum));
            sum[0] = Math.max(sum[0], tree.val + left + right);
            return Math.max(left + tree.val, right + tree.val);
        } else {
            return 0;
        }
    }

}
