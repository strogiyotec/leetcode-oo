package leetcode.oo.pointers;

/**
 * Move zeroes.
 * See {@link <a href ="https://leetcode.com/problems/move-zeroes/">https://leetcode.com/problems/move-zeroes/</a>}
 */
final class MoveZeroes {

    void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int zeroIndex = -1;
        int nonZeroIndex = 0;
        while (nonZeroIndex < nums.length) {
            if (nums[nonZeroIndex] == 0) {
                if (zeroIndex == -1) {
                    zeroIndex = nonZeroIndex;
                }
                nonZeroIndex++;
            } else if (zeroIndex != -1) {
                final int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = 0;
                nums[zeroIndex] = temp;
                zeroIndex++;
            } else{
                nonZeroIndex++;
            }
        }
    }
}
