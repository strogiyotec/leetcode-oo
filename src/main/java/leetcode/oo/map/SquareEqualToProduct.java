package leetcode.oo.map;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-ways-where-square-of-number-is-equal-to-product-of-two-numbers/
final class SquareEqualToProduct {

    int numTriplets(int[] nums1, int[] nums2) {
        int cnt = 0;
        for (final int number : nums1) {
            cnt += this.findTuple(number*number, nums2);
        }
        for (final int number : nums2) {
            cnt += this.findTuple(number*number, nums1);
        }
        return cnt;
    }

    private int findTuple(final int square, final int[] numbers) {
        final Map<Integer, Integer> numberToCnt = new HashMap<>(numbers.length << 1);
        int cnt = 0;
        for (final int number : numbers) {
            if (square % number == 0) {
                cnt += numberToCnt.getOrDefault(square / number, 0);
            }
            numberToCnt.merge(number,1,Integer::sum);
        }
        return cnt;
    }

}
