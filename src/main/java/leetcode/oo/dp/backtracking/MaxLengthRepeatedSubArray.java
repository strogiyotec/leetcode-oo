package leetcode.oo.dp.backtracking;

/**
 * Maximum Length of Repeated Subarray.
 * See {@link <a href ="https://leetcode.com/problems/maximum-length-of-repeated-subarray/">https://leetcode.com/problems/maximum-length-of-repeated-subarray/</a>}
 */
final class MaxLengthRepeatedSubArray {

    int findLength(final int[] first, final int[] second) {
        final int[][] memo = new int[first.length + 1][second.length + 1];
        int max = 0;
        for (int i = first.length - 1; i >= 0; i--) {
            for (int j = second.length - 1; j >= 0; j--) {
                if (first[i] == second[j]) {
                    memo[i][j] = 1 + memo[i + 1][j + 1];
                    max = Math.max(max, memo[i][j]);
                }
            }
        }
        return max;
    }
}
