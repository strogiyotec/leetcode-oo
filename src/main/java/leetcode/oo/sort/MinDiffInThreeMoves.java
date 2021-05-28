package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
final class MinDiffInThreeMoves {

    int minDifference(final int[] nums) {
        if (nums.length <= 3) {
            return 0;
        }
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 3; i >= 0; i--) {
            final int removeBiggest = nums[nums.length - 1 - i] - nums[3 - i];
            final int removeSmallest = nums[nums.length - 1] - nums[i];
            final int min = Math.min(removeBiggest, removeSmallest);
            minDiff = Math.min(minDiff, min);
        }
        return minDiff;
    }
}
