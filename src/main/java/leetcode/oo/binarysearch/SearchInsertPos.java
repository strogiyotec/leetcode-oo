package leetcode.oo.binarysearch;

//https://leetcode.com/problems/search-insert-position/
public final class SearchInsertPos {

    public static void main(String[] args) {
        System.out.println(new SearchInsertPos().searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (right - left) / 2 + left;
            final int number = nums[middle];
            if (number == target) {
                return middle;
            } else if (number < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }
}
