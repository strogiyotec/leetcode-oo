package leetcode.oo.math;

//https://leetcode.com/problems/maximum-product-subarray/description/
public final class MaxProductSubArray {

    public static void main(String[] args) {
        System.out.println(new MaxProductSubArray().maxProduct(
            new int[]{-2, 3, -4}
        ));
    }

    public int maxProduct(final int[] nums) {
        int currentMax = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currentMax *= nums[i];
            max = Math.max(max, currentMax);
            if (currentMax == 0) {
                currentMax = 1;
            }
        }
        currentMax = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            currentMax *= nums[i];
            max = Math.max(max, currentMax);
            if (currentMax == 0) {
                currentMax = 1;
            }
        }
        return max;
    }
}
