package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/average-waiting-time/
public final class AverageWaitingTime {

    public static void main(String[] args) {
        System.out.println(new AverageWaitingTime().averageWaitingTime(
            new int[][]{
                {1,2},{2,5},{4,3}
            }
        ));
        System.out.println(new AverageWaitingTime().averageWaitingTime(
            new int[][]{
                {5, 2}, {5, 4}, {10, 3}, {20, 1}
            }
        ));
    }

    public double averageWaitingTime(final int[][] customers) {
        final List<Integer> waitingTimes = new ArrayList<>(customers.length);
        int chef = -1;
        for (final int[] customer : customers) {
            if (chef != -1 && chef < customer[0]) {
                chef = customer[0];
            }
            if (chef == -1) {
                chef = customer[0];
            }
            chef += customer[1];
            final int waitingTime = chef - customer[0];
            waitingTimes.add(waitingTime);
        }
        return waitingTimes.stream().mapToInt(d -> d).average().getAsDouble();
    }
}
