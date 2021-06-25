package leetcode.oo.arrays;

//https://leetcode.com/problems/maximum-sum-of-two-non-overlapping-subarrays/
final class MaxSumOfTwoArrays {

    int maxSumTwoNoOverlap(final int[] A, final int L, final int M) {
        final int[] prefix = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            prefix[i + 1] = prefix[i] + A[i];
        }
        return Math.max(
            this.maxSum(prefix, M, L),
            this.maxSum(prefix, L, M)
        );
    }

    private int maxSum(final int[] prefix, final int L, final int M) {
        int max = 0;
        int maxM = 0;
        for (int i = L + M; i < prefix.length; i++) {
            final int maxL = prefix[i] - prefix[i - L];
            maxM = Math.max(maxM, prefix[i] - maxL - prefix[i - M - L]);
            max = Math.max(max, maxL+maxM);
        }
        return max;
    }

}
