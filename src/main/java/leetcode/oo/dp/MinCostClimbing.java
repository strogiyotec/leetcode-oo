package leetcode.oo.dp;

/**
 * Min cost climbing.
 * See {@link <a href ="https://leetcode.com/problems/min-cost-climbing-stairs/">https://leetcode.com/problems/min-cost-climbing-stairs/</a>}
 */
final class MinCostClimbing {

    int minCostClimbingStairs(final int[] cost) {
        int first = cost[0];
        int second = cost[1];
        for (int i = 2; i < cost.length; i++) {
            final int current = Math.min(first, second) + cost[i];
            first = second;
            second = current;
        }
        return Math.min(first, second);
    }
}
