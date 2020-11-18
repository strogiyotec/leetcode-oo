package leetcode.oo.tree;

import java.util.Arrays;

/**
 * Unique BST.
 * See {@link <a href ="https://leetcode.com/problems/unique-binary-search-trees/">https://leetcode.com/problems/unique-binary-search-trees/</a>}
 */
final class UniqueTrees {

    int numTrees(final int number) {
        final int[] dp = new int[number + 1];
        Arrays.fill(dp, 1);
        for (int node = 2; node < dp.length; node++) {
            int total = 0;
            for (int root = 1; root <= node; root++) {
                final int left = root - 1;
                final int right = node - root;
                total += dp[left] * dp[right];
            }
            dp[node] = total;
        }
        return dp[number];
    }
}
