package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/
public final class ElementNotEqualAverage {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ElementNotEqualAverage().rearrangeArray(
            new int[]{1, 2, 3, 4, 5}
        )));
    }

    public int[] rearrangeArray(final int[] nums) {
        final int[] out = new int[nums.length];
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < nums.length && index < nums.length; i++) {
            out[index] = nums[i];
            if(index+1<nums.length){
                out[index+1] = nums[nums.length - i - 1];
            }
            index+=2;
        }
        return out;
    }
}
