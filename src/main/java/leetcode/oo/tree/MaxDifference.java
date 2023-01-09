package leetcode.oo.tree;

//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
final class MaxDifference {

    private int max = 0;

    int maxAncestorDiff(final PlainTree root) {
        this.maxDiff(root, root.val, root.val);
        return this.max;
    }

    private void maxDiff(final PlainTree root, final int min, final int max) {
        if (root != null) {
            final int nextMin = Math.min(min, root.val);
            final int nextMax = Math.min(max, root.val);
            final int nextDiff = Math.max(
                Math.abs(root.val - nextMin),
                Math.abs(root.val - nextMax)
            );
            this.max = Math.max(this.max,nextDiff);
            this.maxDiff(root.left, min, max);
            this.maxDiff(root.right, min, max);
        }
    }

}
