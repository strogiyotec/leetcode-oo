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
            return 0;
        }
        if (dp[start] != -1) {
            return dp[start];
        }
        long profit = rides[start][1] - rides[start][0] + rides[start][2];
        for (int i = start + 1; i < rides.length; i++) {
            final int currentEnd = rides[start][1];
            final int nextStart = rides[i][0];
            if (nextStart >= currentEnd) {
                profit += this.dfs(rides, i, dp);
                break;
            }
        }
        final long skip = this.dfs(rides, start + 1, dp);
        dp[start] = Math.max(skip, profit);
        return dp[start];
    }
}
