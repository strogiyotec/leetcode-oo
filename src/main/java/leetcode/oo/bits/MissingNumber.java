package leetcode.oo.bits;

/**
 * Missing number.
 * See {@link <a href ="https://leetcode.com/problems/missing-number/">https://leetcode.com/problems/missing-number/</a>}
 */
final class MissingNumber {

    int missingNumber(final int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
