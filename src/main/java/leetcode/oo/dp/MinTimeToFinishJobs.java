package leetcode.oo.dp;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/find-minimum-time-to-finish-all-jobs/
public final class MinTimeToFinishJobs {

    private int minTime = Integer.MAX_VALUE;

    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        this.dfs(jobs, jobs.length - 1, new int[k]);
        return this.minTime;
    }

    private void dfs(final int[] jobs, final int biggestJobIndex, final int[] workers) {
        if (biggestJobIndex < 0) {
            this.minTime = Math.min(
                this.minTime,
                IntStream.of(workers).max().getAsInt()
            );
            return;
        }
        if(IntStream.of(workers).max().getAsInt()>=this.minTime){
            return;
        }
        for (int i = 0; i < workers.length; i++) {
            if(i>0 && workers[i] == workers[i-1]){
                continue;
            }
            workers[i]+=jobs[biggestJobIndex];
            this.dfs(jobs,biggestJobIndex-1,workers);
            workers[i]-=jobs[biggestJobIndex];
        }
    }
}
