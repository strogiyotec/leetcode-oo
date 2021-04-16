package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers/
final class SquareEqualToProduct {

    int numTriplets(int[] nums1, int[] nums2) {
        int cnt = 0;
        for (final long number : nums1) {
            final long square = number * number;
            cnt += this.find(square, nums2);
        }
        for (final long number : nums2) {
            final long square = number * number;
            cnt += this.find(square, nums1);
        }
        return cnt;
    }

    private int find(final long square, final int[] nums) {
        int cnt = 0;
        final Map<Long, Long> map = new HashMap<>(nums.length, 1.0F);
        for (final long num : nums) {
            if (square % num == 0) {
                cnt += map.getOrDefault(square / num, 0L);
            }
            map.merge(num, 1L, Long::sum);
        }
        return cnt;
    }

}
