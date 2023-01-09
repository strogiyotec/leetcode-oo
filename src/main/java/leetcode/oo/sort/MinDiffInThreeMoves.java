package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
final class MinDiffInThreeMoves {

    int  minDifference(final int[] nums) {
        if (nums.length <= 3) {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = 3;
        int minDiff = Integer.MAX_VALUE;
        while (left <= 3 && right >= 0) {
            minDiff = Math.min(
                minDiff,
                Math.abs(nums[nums.length-right-1]-nums[left])
            );
            left++;
            right--;
        }
        return minDiff;
    }
}
