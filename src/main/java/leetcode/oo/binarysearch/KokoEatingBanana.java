package leetcode.oo.binarysearch;

import java.util.stream.IntStream;

//https://leetcode.com/problems/koko-eating-bananas/
final class KokoEatingBanana {

    int minEatingSpeed(final int[] piles, final int h) {
        final int max = IntStream.of(piles).max().getAsInt();
        int left = 1;
        int right = max;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            int middle = (right - left) / 2 + left;
            int cnt = 0;
            for (final int pile : piles) {
                if (middle > pile) {
                    cnt++;
                } else if (pile % middle == 0) {
                    cnt += pile / middle;
                } else {
                    cnt += Math.max(1, pile / middle) + 1;
                }
            }
            if (cnt <= h) {
                right = middle - 1;
                min = Math.min(min, middle);
            } else {
                left = middle + 1;
            }
        }
        return min;
    }
}
