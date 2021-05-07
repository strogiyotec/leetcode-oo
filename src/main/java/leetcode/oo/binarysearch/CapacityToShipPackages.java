package leetcode.oo.binarysearch;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
final class CapacityToShipPackages {

    int shipWithinDays(final int[] nums, final int m) {
        final IntSummaryStatistics stats = IntStream.of(nums).summaryStatistics();
        int left = stats.getMax();
        int right = (int) stats.getSum();
        while (left < right) {
            final int middle = (right - left) / 2 + left;
            final int cnt = this.fitInMDays(nums, middle);
            if (cnt > m) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return left;

    }

    private int fitInMDays(final int[] nums, final int middle) {
        int cnt = 0;
        int sum = 0;
        for (final int num : nums) {
            if (sum + num > middle) {
                cnt++;
                sum = num;
            } else {
                sum += num;
            }
        }
        if (sum != 0) {
            cnt++;
        }
        return cnt;
    }
}
