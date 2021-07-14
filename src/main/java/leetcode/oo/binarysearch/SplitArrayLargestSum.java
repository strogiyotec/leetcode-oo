package leetcode.oo.binarysearch;

import java.util.stream.IntStream;

//https://leetcode.com/problems/split-array-largest-sum/
final class SplitArrayLargestSum {

    int splitArray(int[] nums, int m) {
        var stats = IntStream.of(nums).summaryStatistics();
        int left = stats.getMax();
        int right = (int) stats.getSum();
        while (left <= right) {
            final int middle = left + (right - left) / 2;
            if (this.isValid(middle, nums, m)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    private boolean isValid(final int middle, final int[] nums, final int cntLimit) {
        int currentSum = 0;
        int cnt = 1;
        for (final int num : nums) {
            currentSum += num;
            if (currentSum > middle) {
                cnt++;
                currentSum = num;
                if (cnt > cntLimit) {
                    return false;
                }
            }
        }
        return true;
    }

}
