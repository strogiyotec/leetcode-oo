package leetcode.oo.arrays;

import java.util.Arrays;

/**
 *Array Partition I.
 * See {@link <a href ="https://leetcode.com/problems/array-partition-i/">https://leetcode.com/problems/array-partition-i/</a>}.
 */
final class ArrayPartition1 {

    int arrayPairSum(final int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
