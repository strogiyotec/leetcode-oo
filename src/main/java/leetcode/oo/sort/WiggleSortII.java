package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/wiggle-sort-ii/
final class WiggleSortII {

    void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        final int mid;
        if (nums.length % 2 == 0) {
            mid = nums.length / 2 - 1;
        } else {
            mid = nums.length / 2;
        }
        final int[] temp = Arrays.copyOf(nums, nums.length);
        int tempIndex = 0;
        for (int i = 0; i < nums.length && tempIndex < nums.length; i++) {
            nums[tempIndex] = temp[mid - i];
            if (tempIndex + 1 < nums.length) {
                nums[tempIndex + 1] = temp[nums.length - 1 - i];
            }
            tempIndex += 2;
        }
    }

}
