package leetcode.oo.pointers;

//https://leetcode.com/problems/next-permutation/
public final class NextPermutation {

    public void nextPermutation(final int[] nums) {
        int left = nums.length - 2;
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }
        if (left >= 0) {
            int right = nums.length - 1;
            while (nums[right] <= nums[left]) {
                right--;
            }
            this.swap(nums, left, right);
        }
        this.reverse(nums, left + 1, nums.length - 1);
    }

    private void reverse(final int[] nums, int left, int right) {
        while (left < right) {
            this.swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(final int[] nums, final int left, final int right) {
        final int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

}
