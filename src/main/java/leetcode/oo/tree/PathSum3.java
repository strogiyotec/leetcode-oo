package leetcode.oo.tree;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Path Sum 3.
 * See {@link <a href ="https://leetcode.com/problems/path-sum-iii/">https://leetcode.com/problems/path-sum-iii/</a>}
 */
final class PathSum3 {

    int pathSum(final PlainTree root, final int sum) {
        final AtomicInteger cnt = new AtomicInteger(0);
        this.dfs(root, sum, cnt);
        return cnt.get();
    }

    private void dfs(final PlainTree root, final int sum, final AtomicInteger cnt) {
        if (root != null) {
            this.dfs(root, sum, 0, cnt);
            this.dfs(root.left, sum, cnt);
            this.dfs(root.right, sum, cnt);
        }
    }

    private void dfs(final PlainTree root, final int sum, final int currentSum, final AtomicInteger cnt) {
        if (root != null) {
            this.dfs(root.left, sum, currentSum + root.val, cnt);
            this.dfs(root.right, sum, currentSum + root.val, cnt);
            if (currentSum + root.val == sum) {
                cnt.incrementAndGet();
            }
        }
    }

}
