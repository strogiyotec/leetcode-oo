package leetcode.oo.tree;

import java.util.concurrent.atomic.AtomicInteger;

//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
final class MaxDifference {

    int maxAncestorDiff(final PlainTree root) {
        final AtomicInteger min = new AtomicInteger(0);
        this.dfs(root, min, root.val, root.val);
        return min.get();
    }

    private void dfs(
        final PlainTree root,
        final AtomicInteger maxDiff,
        int min,
        int max
    ) {
        if (root == null) {
            return;
        }
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        maxDiff.set(Math.max(maxDiff.get(), Math.abs(max - min)));
        this.dfs(root.left, maxDiff, min, max);
        this.dfs(root.right, maxDiff, min, max);
    }
}
