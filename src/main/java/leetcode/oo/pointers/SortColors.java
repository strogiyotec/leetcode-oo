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
        final int red = 0;
        final int blue = 2;
        int redIndex = 0;
        int whiteIndex = 0;
        int blueIndex = nums.length - 1;
        while (redIndex <= blueIndex && whiteIndex <= blueIndex) {
            if (nums[whiteIndex] == red) {
                nums[whiteIndex] = nums[redIndex];
                nums[redIndex] = red;
                redIndex++;
                whiteIndex++;
            } else if (nums[whiteIndex] == blue) {
                nums[whiteIndex] = nums[blueIndex];
                nums[blueIndex] = blue;
                blueIndex--;
            } else {
                whiteIndex++;
            }
        }
    }
}
