package leetcode.oo.arrays;

import java.util.Arrays;

/**
 *Array Partition I.
 * See {@link <a href ="https://leetcode.com/problems/array-partition-i/">https://leetcode.com/problems/array-partition-i/</a>}.
 */
final class ArrayPartition1 {

    static void main(final String[] args) {
        System.out.println(new ArrayPartition1().arrayPairSum(
            new int[]{1, 4, 3, 2}
        ));

        System.out.println(new ArrayPartition1().arrayPairSum(
            new int[]{6, 2, 6, 5, 1, 2}
        ));
    }

    int arrayPairSum(final int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
