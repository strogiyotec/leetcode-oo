package leetcode.oo.pointers;

/**
 * Sort colors.
 * See {@link <a href ="https://leetcode.com/problems/sort-colors/">https://leetcode.com/problems/sort-colors/</a>}
 */
final class SortColors {
    void sortColors(final int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int red = 0;
        int blue = 2;
        int redIndex = 0;
        int whiteIndex = 0;
        int blueIndex = nums.length-1;
        while (redIndex <= blueIndex && whiteIndex <= blueIndex) {
            if (nums[whiteIndex] == blue) {
                int temp = nums[blueIndex];
                nums[blueIndex] = nums[redIndex];
                nums[redIndex] = temp;
                blueIndex--;
            } else if (nums[whiteIndex] == red) {
                int temp = nums[redIndex];
                nums[redIndex] = nums[whiteIndex];
                nums[whiteIndex] = temp;
                redIndex++;
                whiteIndex++;
            } else {
                whiteIndex++;
            }
        }
    }
}
