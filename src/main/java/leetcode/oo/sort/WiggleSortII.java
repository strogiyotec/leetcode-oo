package leetcode.oo.sort;

import java.util.Arrays;

//https://leetcode.com/problems/wiggle-sort-ii/
final class WiggleSortII {

    void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int middle = nums.length / 2;
        if (nums.length % 2 == 0) {
            middle--;
        }
        final int[] tmp = new int[nums.length];
        int left = middle;
        int right = nums.length - 1;
        int index = 0;
        while (index < nums.length && left >= 0 && right != middle) {
            tmp[index] = nums[left];
            tmp[index + 1] = nums[right];
            index += 2;
            left--;
            right--;
        }
        if (nums.length % 2 != 0) {
            tmp[index] = nums[0];
        }
        System.arraycopy(tmp, 0, nums, 0, nums.length);
    }
}
