package leetcode.oo.dp;

/**
 *Partition Array for Maximum Sum.
 * See {@link <a href ="https://leetcode.com/problems/partition-array-for-maximum-sum/">https://leetcode.com/problems/partition-array-for-maximum-sum/</a>}
 */
final class MaxSumArrayPartition {

    int maxSumAfterPartitioning(final int[] array, final int limit) {
        final int[] dp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int currentMax = 0;
            for (int j = 1; j <= limit && i - j + 1 >= 0; j++) {
                currentMax = Math.max(currentMax, array[i - j + 1]);
                if (i >= j) {
                    dp[i] = Math.max(dp[i], dp[i - j] + currentMax * j);
                } else {
                    dp[i] = Math.max(dp[i], currentMax * j);
                }
            }
        }
        return dp[array.length - 1];
    }
}
