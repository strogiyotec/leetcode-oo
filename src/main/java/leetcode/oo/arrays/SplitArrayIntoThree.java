package leetcode.oo.arrays;

//https://leetcode.com/problems/ways-to-split-array-into-three-subarrays/
final class SplitArrayIntoThree {

    int waysToSplit(int[] nums) {

        final int MOD = (int) (1.0e9 + 7);

        final int N = nums.length;

        // prefix array
        final int[] prefixSum = new int[N];
        prefixSum[0] = nums[0];
        for (int i = 1; i < N; ++i) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        int res = 0;
        for (int i = 1; i < prefixSum.length; i++) {
            final int leftIndex = this.help(prefixSum[i - 1], i, true, prefixSum);
            final int rightIndex = this.help(prefixSum[i - 1], i, false, prefixSum);
            if (leftIndex != -1 && rightIndex != -1) {
                res = (res + rightIndex - leftIndex + 1) % MOD;
            }
        }

        return res;
    }

    private int help(final int leftSum, final int index, final boolean shrinkLeft, final int[] prefixSum) {
        int left = index;
        int right = prefixSum.length - 2;
        int res = -1;
        while (left <= right) {
            final int middle = (right - left) / 2 + left;
            final int middleSum = prefixSum[middle] - prefixSum[index - 1];
            final int rightSum = prefixSum[prefixSum.length - 1] - prefixSum[middle];
            if (leftSum <= middleSum && middleSum <= rightSum) {
                res = middle;
                if (shrinkLeft) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else if (leftSum > middleSum) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return res;
    }

}

