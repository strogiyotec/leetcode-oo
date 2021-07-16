package leetcode.oo.math;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
public final class SumOfAbsDiff {

    public static void main(final String[] args) {
        System.out.println(
            Arrays.toString(
                new SumOfAbsDiff().getSumAbsoluteDifferences(
                    new int[]{
                        1, 4, 6, 8, 10
                    }
                )
            )
        );
    }

    public int[] getSumAbsoluteDifferences(final int[] nums) {
        int rightSum = IntStream.of(nums).sum();
        int leftSum = 0;
        final int[] sumArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            leftSum += nums[i];
            sumArray[i] = nums[i] * (i + 1) - leftSum + rightSum - nums[i] * (nums.length - i - 1);
        }
        return sumArray;
    }
}
