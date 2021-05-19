package leetcode.oo.dp;

import java.util.stream.IntStream;

//https://leetcode.com/problems/delete-and-earn/
 final class DeleteAndEarn {

     int deleteAndEarn(final int[] nums) {
        final int max = IntStream.of(nums).max().getAsInt();
        final int[] cnt = new int[max + 1];
        for (final int num : nums) {
            cnt[num] += num;
        }
        final int[] dp = new int[max + 3];
        for (int i = max; i >= 0; i--) {
            dp[i] = Math.max(cnt[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];
    }
}
