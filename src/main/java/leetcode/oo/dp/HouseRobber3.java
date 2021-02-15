package leetcode.oo.dp;

import leetcode.oo.tree.PlainTree;

//https://leetcode.com/problems/house-robber-iii/
final class HouseRobber3 {

    int rob(final PlainTree root) {
        final int[] dfs = this.dfs(root);
        return Math.max(dfs[0], dfs[1]);
    }

    private int[] dfs(final PlainTree root) {
        if (root == null) {
            return new int[]{0, 0};
        } else {
            final int[] left = this.dfs(root.left);
            final int[] right = this.dfs(root.right);
            final int[] current = new int[2];
            current[0] = root.val + left[1] + right[1];
            current[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
            return current;
        }
    }
}
