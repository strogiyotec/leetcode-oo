package leetcode.oo.dp.dfs;

import java.util.Arrays;

//https://leetcode.com/problems/distinct-subsequences/
final class DistinctSubSeq {

    public int numDistinct(String s, String t) {
        final int[][] dp = new int[s.length()][t.length()];
        for (final int[] ints : dp) {
            Arrays.fill(ints, -1);
        }
        return this.dfs(dp, s, t, 0, 0);

    }

    private int dfs(final int[][] dp, final String s, final String t, final int first, final int second) {
        if (second == t.length()) {
            return 1;
        }
        if (first == s.length()) {
            return 0;
        }
        if (dp[first][second] != -1) {
            return dp[first][second];
        }
        if (s.charAt(first) == t.charAt(second)) {
            dp[first][second] = this.dfs(dp, s, t, first + 1, second + 1) + this.dfs(dp, s, t, first + 1, second);
        } else {
            dp[first][second] = this.dfs(dp, s, t, first + 1, second);
        }
        return dp[first][second];

    }

}
