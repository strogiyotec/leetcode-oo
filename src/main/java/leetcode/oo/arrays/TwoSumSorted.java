package leetcode.oo.arrays;


/**
 * Two Sum II - Input array is sorted.
 * See {@link <a href ="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/</a>}
 */
final class TwoSumSorted {
    int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (end > start) {
            final int sum = numbers[start] + numbers[end];
            if (sum == target) {
                //requirement, not zero based
                return new int[]{start + 1, end + 1};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{};
    }
}
