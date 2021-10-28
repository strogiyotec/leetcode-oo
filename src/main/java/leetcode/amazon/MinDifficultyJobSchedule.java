package leetcode.amazon;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/
final class MinDifficultyJobSchedule {

    public int minDifficulty(int[] k, int d) {
        if (d > k.length) {
            return -1;
        }
        final int[][] cache = new int[k.length][d];
        for (final int[] row : cache) {
            Arrays.fill(row, -1);
        }
        return this.dfs(k, d - 1, 0, cache);
    }

    private int dfs(final int[] jobs, final int days, final int jobIndex, final int[][] cache) {
        if (cache[jobIndex][days] != -1) {
            return cache[jobIndex][days];
        }
        if (days == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = jobIndex; i < jobs.length; i++) {
                max = Math.max(max, jobs[i]);
            }
            return max;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = jobIndex; i < jobs.length - days; i++) {
            max = Math.max(
                max,
                jobs[i]
            );
            min = Math.min(
                min,
                max + this.dfs(jobs, days - 1, i + 1, cache)
            );
        }
        cache[jobIndex][days] = min;
        return min;
    }

}
