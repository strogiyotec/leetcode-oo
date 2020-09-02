package leetcode.oo.tree;

/**
 * Range sum of bst.
 * See {@link <a href ="https://leetcode.com/problems/range-sum-of-bst/">https://leetcode.com/problems/range-sum-of-bst/</a>}.
 */
final class RangeSumOfBst {

    int rangeSumBST(final PlainTree root, final int left, final int right) {
        final int[] val = new int[1];
        this.rangeSumBST(root, left, right, val);
        return val[0];
    }

    private void rangeSumBST(final PlainTree root, final int left, final int right, final int[] sum) {
        if (root != null && root.val >= left && root.val <= right) {
            sum[0] += root.val;
        }
        if (root != null) {
            this.rangeSumBST(root.left, left, right, sum);
            this.rangeSumBST(root.right, left, right, sum);
        }
    }
}
