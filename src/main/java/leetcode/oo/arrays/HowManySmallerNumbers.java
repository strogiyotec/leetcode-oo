package leetcode.oo.arrays;

/**
 * How Many Numbers Are Smaller Than the Current Number.
 * See {@link <a href ="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/</a>}
 */
final class HowManySmallerNumbers {

    int[] smallerNumbersThanCurrent(final int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        final int[] sum = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[nums[i]]++;
        }
        for (int i = 1; i < sum.length; i++) {
            sum[i] += sum[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i] = sum[nums[i] - 1];
            }
        }
        return nums;

    }
}
