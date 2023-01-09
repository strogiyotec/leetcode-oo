package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/wiggle-sort-ii/
final class WiggleSortII {

    void wiggleSort(int[] nums) {
        boolean isEven = nums.length % 2 == 0;
        Arrays.sort(nums);
        int middle = nums.length / 2;
        if (isEven) {
            middle--;
        }
        int left = middle;
        int right = nums.length - 1;
        int index = 0;
        final int[] temp = new int[nums.length];
        while (index < nums.length && left >= 0 && right != middle) {
            temp[index] = nums[left];
            temp[index + 1] = nums[right];
            left--;
            right--;
            index += 2;
        }
        if (!isEven) {
            temp[index] = nums[left];
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}
