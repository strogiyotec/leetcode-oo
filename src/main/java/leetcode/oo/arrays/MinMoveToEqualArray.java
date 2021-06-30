package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
public final class MinMoveToEqualArray {

    public static void main(final String[] args) {
        System.out.println(new MinMoveToEqualArray().minMoves2(
            new int[]{1, 2, 3}
        ));
    }

    public int minMoves2(final int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int minCost = 0;
        while (left < right) {
            minCost += nums[right] - nums[left];
            left++;
            right--;
        }
        return minCost;
    }
}
