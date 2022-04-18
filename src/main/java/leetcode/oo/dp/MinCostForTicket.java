package leetcode.oo.dp;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.stream.IntStream;

//https://leetcode.com/problems/minimum-cost-for-tickets/
public final class MinCostForTicket {

    public int mincostTickets(int[] days, int[] costs) {
        final Queue<int[]> queue7 = new ArrayDeque<>(days.length);
        final Queue<int[]> queue30 = new ArrayDeque<>(days.length);
        int totalCost = 0;
        for (final int day : days) {
            while (!queue7.isEmpty() && queue7.peek()[0] + 7 <= day) {
                queue7.poll();
            }
            while (!queue30.isEmpty() && queue30.peek()[0] + 30 <= day) {
                queue30.poll();
            }
            queue7.add(new int[]{day, totalCost + costs[1]});
            queue30.add(new int[]{day, totalCost + costs[2]});
            totalCost = IntStream.of(
                totalCost+costs[0],
                queue7.peek()[1],
                queue30.peek()[1]
            ).min().getAsInt();
        }
        return totalCost;
    }
}
