package leetcode.oo.math;

//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 final class MinMoveEqualArray {

     int minMoves(final int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (final int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }
        return sum - min * nums.length;
    }
}
