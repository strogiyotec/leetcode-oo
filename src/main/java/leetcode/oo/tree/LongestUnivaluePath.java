package leetcode.oo.tree;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Longest Univalue Path.
 * See {@link <a href ="https://leetcode.com/problems/longest-univalue-path/">https://leetcode.com/problems/longest-univalue-path/</a>}
 */
final class LongestUnivaluePath {

    int longestUnivaluePath(final PlainTree root) {
        final AtomicInteger max = new AtomicInteger(0);
        this.maxLength(root, max);
        return max.get();

    }

    private int maxLength(final PlainTree node, final AtomicInteger max) {
        if (node == null) {
            return 0;
        } else {
            final int leftLength = this.maxLength(node.left, max);
            final int rightLength = this.maxLength(node.right, max);
            int left = 0;
            if (node.left != null && node.left.val == node.val) {
                left += leftLength + 1;
            }
            int right = 0;
            if (node.right != null && node.right.val == node.val) {
                right += rightLength + 1;
            }
            max.set(Math.max(max.get(), right + left));
            return Math.max(left, right);
        }
    }
}
