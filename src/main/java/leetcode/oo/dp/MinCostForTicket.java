package leetcode.oo.dp;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/minimum-cost-for-tickets/
public final class MinCostForTicket {

    public int mincostTickets(int[] days, int[] costs) {
        final Queue<int[]> day7 = new LinkedList<>();
        final Queue<int[]> day30 = new LinkedList<>();
        int cost = 0;
        for (final int day : days) {
            while (!day7.isEmpty() && day7.peek()[0] + 7 <= day) {
                day7.poll();
            }
            day7.offer(new int[]{day, cost + costs[1]});
            while (!day30.isEmpty() && day30.peek()[0] + 30 <= day) {
                day30.poll();
            }
            day30.offer(new int[]{day, cost + costs[2]});
            cost = Math.min(
                cost + costs[0],
                Math.min(
                    day7.peek()[1],
                    day30.peek()[1]
                )
            );
        }
        return cost;
    }
}
