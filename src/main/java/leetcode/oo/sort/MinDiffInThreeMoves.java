package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
final class MinDiffInThreeMoves {

    int minDifference(final int[] nums) {
        if (nums.length < 5) {
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            min = Math.min(
                min,
                nums[nums.length - 4 + i] - nums[i]
            );
        }
        return min;
    }
}
