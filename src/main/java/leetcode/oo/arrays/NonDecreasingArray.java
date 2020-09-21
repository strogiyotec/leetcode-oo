package leetcode.oo.arrays;


/**
 * Non decreasing array.
 * See {@link <a href ="https://leetcode.com/problems/non-decreasing-array/">https://leetcode.com/problems/non-decreasing-array/</a>}
 */
final class NonDecreasingArray {

    boolean checkPossibility(final int[] nums) {
        boolean mod = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (mod) {
                    return false;
                } else {
                    if (i - 1 >= 0) {
                        if (nums[i - 1] <= nums[i + 1]) {
                            nums[i] = nums[i - 1];
                        } else {
                            nums[i + 1] = nums[i];
                        }
                    } else {
                        nums[i] = nums[i + 1] - 1;
                    }
                    mod = true;
                }
            }
        }
        return true;
    }
}
