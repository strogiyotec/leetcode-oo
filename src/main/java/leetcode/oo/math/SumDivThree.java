package leetcode.oo.math;

//https://leetcode.com/problems/greatest-sum-divisible-by-three/
final class SumDivThree {

    public int maxSumDivThree(final int[] nums) {
        int[] dp = new int[3];
        for (final int num : nums) {
            final int[] next = dp.clone();
            for (final int maxSum : dp) {
                final int currentMax = maxSum + num;
                final int index = currentMax % 3;
                next[index] = Math.max(next[index], currentMax);
            }
            dp = next;
        }
        return dp[0];
    }
}
