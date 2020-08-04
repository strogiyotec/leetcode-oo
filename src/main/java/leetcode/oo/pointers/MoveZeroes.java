package leetcode.oo.pointers;


/**
 * Move zeroes.
 * See {@link <a href ="https://leetcode.com/problems/move-zeroes/">https://leetcode.com/problems/move-zeroes/</a>}
 */
final class MoveZeroes {

    void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
