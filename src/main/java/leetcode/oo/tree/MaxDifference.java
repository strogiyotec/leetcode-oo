package leetcode.oo.tree;

//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
final class MaxDifference {

    int maxAncestorDiff(final PlainTree root) {
        return this.maxDIff(root, root.val, root.val, 0);
    }

    private int maxDIff(final PlainTree root, final int min, final int max, final int maxSoFar) {
        if (root == null) {
            return maxSoFar;
        }
        final int nextMin = Math.min(min, root.val);
        final int nextMax = Math.max(max, root.val);
        final int nextMaxDiff = Math.max(
            Math.abs(root.val - nextMin),
            Math.abs(root.val - nextMax)
        );
        return Math.max(
            this.maxDIff(
                root.left,
                nextMin,
                nextMax,
                Math.max(maxSoFar,nextMaxDiff)
            ),
            this.maxDIff(
                root.right,
                nextMin,
                nextMax,
                Math.max(maxSoFar,nextMaxDiff)
            )
        );
    }

}
