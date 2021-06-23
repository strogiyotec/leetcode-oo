package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public final class MaxProductTwoElements {

    public static void main(String[] args) {
        System.out.println(
            new MaxProductTwoElements().maxProduct(
                new int[]{3, 4, 5, 2}
            )
        );
        System.out.println(
            new MaxProductTwoElements().maxProduct(
                new int[]{10, 2, 5, 2}
            )
        );
        System.out.println(
            new MaxProductTwoElements().maxProduct(
                new int[]{1, 5, 4, 5}
            )
        );
    }

    public int maxProduct(final int[] nums) {
        int biggest = 0;
        int secondBiggest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > biggest) {
                secondBiggest = biggest;
                biggest = nums[i];
            } else {
                secondBiggest = Math.max(secondBiggest, nums[i]);
            }
        }
        Arrays.sort(nums);
        return (biggest - 1) * (secondBiggest - 1);
    }
}
