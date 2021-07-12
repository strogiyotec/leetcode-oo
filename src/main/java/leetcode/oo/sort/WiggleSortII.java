package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/wiggle-sort-ii/
final class WiggleSortII {

    void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        final int[] temp = Arrays.copyOf(nums, nums.length);
        int middle = nums.length / 2;
        if (nums.length % 2 == 0) {
            middle--;
        }
        int left = middle;
        int right = nums.length - 1;
        int index = 0;
        while (left >= 0 && right != middle && index < temp.length) {
            temp[index] = nums[left];
            temp[index + 1] = nums[right];
            right--;
            left--;
            index += 2;
        }
        while (left >= 0 && index < temp.length) {
            temp[index] = nums[left];
            left++;
            index++;
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}
