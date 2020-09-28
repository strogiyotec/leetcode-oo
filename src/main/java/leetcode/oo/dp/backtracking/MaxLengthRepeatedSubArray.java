package leetcode.oo.dp.backtracking;


/**
 * Maximum Length of Repeated Subarray.
 * See {@link <a href ="https://leetcode.com/problems/maximum-length-of-repeated-subarray/">https://leetcode.com/problems/maximum-length-of-repeated-subarray/</a>}
 */
final class MaxLengthRepeatedSubArray {

    int findLength(final int[] first, final int[] second) {
        final int[][] dp = new int[first.length + 1][second.length + 1];
        int max = 0;
        for (int i = 1; i <= first.length; i++) {
            for (int j = 1; j <= second.length; j++) {
                if (first[i - 1] == second[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
