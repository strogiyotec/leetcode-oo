package leetcode.oo.tree.path;

import leetcode.oo.tree.PlainTree;

/**
 * Path sum.
 * See {@link <a href ="https://leetcode.com/problems/path-sum/">https://leetcode.com/problems/path-sum/</a>}.
 */
final class PathSum1 {

    boolean hasPathSum(final PlainTree root, final int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        return this.hasPathSum(root.left, sum - root.val)
                || this.hasPathSum(root.right, sum - root.val);
    }
}
