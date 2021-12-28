package leetcode.oo.binarysearch;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
final class SearchInRotated {

    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            final int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int middleElement = nums[middleIndex];
            if (middleElement < nums[0] == target < nums[0]) {
                middleElement = nums[middleIndex];
            } else {
                middleElement = target < middleElement ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            if (middleElement > target) {
                rightIndex = middleIndex - 1;
            } else if (middleElement < target) {
                leftIndex = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
