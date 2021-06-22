package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/wiggle-sort-ii/
final class WiggleSortII {

    void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        final int[] temp = Arrays.copyOf(nums, nums.length);
        int middle;
        if (nums.length % 2 == 0) {
            middle = nums.length / 2 - 1;
        } else {
            middle = nums.length / 2;
        }
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = temp[middle];
            if (i + 1 >= nums.length) {
                break;
            }
            nums[i + 1] = temp[right];
            middle--;
            right--;
        }
    }
}
