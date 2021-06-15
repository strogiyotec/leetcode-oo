package leetcode.oo.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/corporate-flight-bookings/
public final class CorporateFlightBooking {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new CorporateFlightBooking().corpFlightBookings(
                    new int[][]{
                        {1, 2, 10}, {2, 2, 15}
                    },
                    2
                )
            )
        );
        System.out.println(
            Arrays.toString(
                new CorporateFlightBooking().corpFlightBookings(
                    new int[][]{
                        {1, 2, 10}, {2, 3, 20}, {2, 5, 25}
                    },
                    5
                )
            )
        );
    }

    public int[] corpFlightBookings(final int[][] bookings, final int n) {
        final int[] sol = new int[n];
        for (final int[] booking : bookings) {
            if (booking[0] == booking[1]) {
                sol[booking[0] - 1] += booking[2];
            } else {
                for (int i = booking[0]; i <= booking[1]; i++) {
                    sol[i - 1] += booking[2];
                }
            }
        }
        return sol;
    }
}
