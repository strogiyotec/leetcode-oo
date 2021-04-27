package leetcode.oo.binarysearch;

//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
final class MinNumberDaysBouquets {

    int minDays(final int[] bloomDays, int bouquets, int amount) {
        if (bouquets * amount > bloomDays.length) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (final int day : bloomDays) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }
        while (min < max) {
            final int middle = min + (max - min) / 2;
            int freq = 0;
            int cnt = 0;
            for (final int day : bloomDays) {
                if (day <= middle) {
                    freq++;
                } else {
                    freq = 0;
                }
                if (freq == amount) {
                    cnt++;
                    freq = 0;
                }
            }
            if (cnt < bouquets) {
                min = middle + 1;
            } else {
                max = middle;
            }
        }
        return min;
    }
}
