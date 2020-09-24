package leetcode.oo.tree;

/**
 * Binary Tree Maximum Path Sum.
 * See {@link <a href ="https://leetcode.com/problems/binary-tree-maximum-path-sum/">https://leetcode.com/problems/binary-tree-maximum-path-sum/</a>}.
 */
final class MaxPathSum {

    int maxPathSum(final PlainTree root) {
        final int[] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        this.dfs(sum, root);
        return sum[0];
    }

    private int dfs(final int[] sum, final PlainTree root) {
        if (root == null) {
            return 0;
        }
        final int left = Math.max(0, this.dfs(sum, root.left));
        final int right = Math.max(0, this.dfs(sum, root.right));
        sum[0] = Math.max(sum[0], root.val + left + right);
        return Math.max(left, right) + root.val;
    }
}
