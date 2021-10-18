package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/maximum-product-of-three-numbers/
public final class MaxProductThreeNumbers {

    public static void main(String[] args) {
        System.out.println(new MaxProductThreeNumbers().maximumProduct(
            new int[]{1, 2, 3}
        ));
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(
            nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
            Math.max(
                nums[nums.length - 1] * nums[nums.length - 2] * nums[0],
                Math.max(
                    nums[nums.length - 1] * nums[1] * nums[0],
                    nums[2] * nums[1] * nums[0]
                )
            )
        );
    }
}
