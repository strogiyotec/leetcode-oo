package leetcode.oo.arrays;

//https://leetcode.com/problems/ways-to-split-array-into-three-subarrays/
final class SplitArrayIntoThree {

    int waysToSplit(int[] nums) {
        final int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            final int middleLeft = this.search(prefixSum[i - 1], prefixSum, nums, i, true);
            final int middleRight = this.search(prefixSum[i - 1], prefixSum, nums, i, false);
            if (middleLeft != -1 && middleRight != -1) {
                res += middleRight - middleLeft + 1;
            }
        }
        return res;
    }

    private int search(
        final int leftSum,
        final int[] prefixSum,
        final int[] nums,
        final int index,
        final boolean decreaseMiddle
    ) {
        int middleLeft = index;
        int middleRight = nums.length - 2;
        int range = -1;
        while (middleLeft <= middleRight) {
            int middlePoint = (middleRight - middleLeft) / 2 + middleLeft;
            int middleSum = prefixSum[middlePoint] - prefixSum[index - 1];
            int rightSum = prefixSum[prefixSum.length - 1] - prefixSum[middlePoint];
            if (leftSum <= middleSum && middleSum <= rightSum) {
                range = middlePoint;
                if (decreaseMiddle) {
                    middleRight = middlePoint - 1;
                } else {
                    middleLeft = middlePoint + 1;
                }
            } else if (leftSum > middleSum) {
                middleLeft = middlePoint + 1;
            } else {
                middleRight = middlePoint - 1;
            }
        }
        return range;
    }

}

