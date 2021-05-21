package leetcode.oo.binarysearch;

//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
final class MinNumberDaysBouquets {

    int minDays(final int[] bloomDays, int bouquets, int amount) {
        if (bouquets * amount > bloomDays.length) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (final int bloomDay : bloomDays) {
            min = Math.min(min, bloomDay);
            max = Math.max(max, bloomDay);
        }
        int days = Integer.MAX_VALUE;
        while (min <= max) {
            final int middle = (max - min) / 2 + min;
            int count = 0;
            int currentAmount = 0;
            for (final int bloomDay : bloomDays) {
                if(currentAmount == bouquets){
                    break;
                }
                if (bloomDay <= middle) {
                    count++;
                }
                if (bloomDay > middle) {
                    count = 0;
                }
                if (count == amount) {
                    count = 0;
                    currentAmount++;
                }
            }
            if(currentAmount == bouquets){
                days = Math.min(days, middle);
            }
            if (currentAmount >= bouquets) {
                max = middle - 1;
            } else {
                min = middle + 1;
            }
        }
        return days;
    }
}
