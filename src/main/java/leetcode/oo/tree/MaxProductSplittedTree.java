package leetcode.oo.tree;

//https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/
public final class MaxProductSplittedTree {

    private long max;

    private long sum;

    public int maxProduct(final PlainTree root) {
        this.inOrder(root);
        this.maxSum(root);
        return (int)(this.max % ((int)Math.pow(10, 9) + 7));
    }

    private long maxSum(final PlainTree root) {
        if (root == null) {
            return 0;
        }
        final long left = this.maxSum(root.left);
        final long right = this.maxSum(root.right);
        final long nodeSum = left + right + root.val;
        this.max = Math.max(
            this.max,
            nodeSum * (this.sum - nodeSum)
        );
        return nodeSum;
    }

    private void inOrder(final PlainTree root) {
        if (root != null) {
            this.inOrder( root.left);
            this.sum += root.val;
            this.inOrder( root.right);
        }
    }
}
