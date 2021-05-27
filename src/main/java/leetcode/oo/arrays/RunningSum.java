package leetcode.oo.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public final class RunningSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RunningSum().runningSum(new int[]{1, 2, 3, 4})));
    }

    public int[] runningSum(final int[] nums) {
        final int[] solution = new int[nums.length];
        int sum = IntStream.of(nums).sum();
        solution[nums.length - 1] = sum;
        for (int i = nums.length - 2; i >= 0; i--) {
            sum -= nums[i+1];
            solution[i] = sum;
        }
        return solution;
    }
}
