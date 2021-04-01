package leetcode.oo.arrays;

//https://leetcode.com/problems/maximum-sum-of-two-non-overlapping-subarrays/
final class MaxSumOfTwoArrays {

    int maxSumTwoNoOverlap(final int[] A, final int L, final int M) {
        final int[] prefix = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            prefix[i + 1] = prefix[i] + A[i];
        }
        return Math.max(
            this.maxSum(prefix, L, M),
            this.maxSum(prefix, M, L)
        );
    }

    private int maxSum(
        final int[] prefixSum,
        final int M,
        final int L
    ) {
        int maxL = 0;
        int max = 0;
        for (int i = M + L; i < prefixSum.length; i++) {
            maxL = Math.max(
                maxL,
                prefixSum[i - M] - prefixSum[i - M - L]
            );
            final int maxM = prefixSum[i] - prefixSum[i - M];
            max = Math.max(max, maxL + maxM);
        }
        return max;
    }
}
