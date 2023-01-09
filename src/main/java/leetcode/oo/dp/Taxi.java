package leetcode.oo.dp;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/maximum-earnings-from-taxi/
final class Taxi {

    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, Comparator.comparingInt(a -> a[0]));
        final long[] dp = new long[rides.length];
        Arrays.fill(dp, -1);
        return dfs(rides, 0, dp);
    }

    private long dfs(int[][] rides, int start, final long[] dp) {
        if (start >= rides.length) {
            return 0L;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        final int[] current = rides[start];
        long profit = current[1] - current[0] + current[2];
        for (int i = start + 1; i < rides.length; i++) {
            if (rides[i][0] >= current[1]) {
                profit += this.dfs(rides, i, dp);
                break;
            }
        }
        final long nonInclude = this.dfs(rides, start + 1, dp);
        final long max = Math.max(nonInclude, profit);
        dp[start] = max;
        return max;
    }
}
