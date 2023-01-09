package leetcode.oo.dp;

import java.util.Arrays;
import java.util.stream.IntStream;

//https://leetcode.com/problems/stone-game-vii/
final class StoneGame7 {

    int stoneGameVII(final int[] stones) {
        final int[][] memo = new int[stones.length][stones.length];
        for (final int[] ints : memo) {
            Arrays.fill(ints, -1);
        }
        final int sum = IntStream.of(stones).sum();
        return this.dfs(memo, 0, stones.length - 1, sum, stones);
    }

    private int dfs(final int[][] memo, final int left, final int right, final int sum, final int[] stones) {
        if (left == right) {
            return 0;
        }
        if (left > right) {
            return -1;
        }
        if (memo[left][right] != -1) {
            return memo[left][right];
        }
        final int fromLeft = this.dfs(memo, left + 1, right, sum-stones[left], stones);
        final int fromRight = this.dfs(memo, left, right - 1, sum-stones[right], stones);
        int max = Math.max(
            sum - stones[left] -fromLeft,
            sum - stones[right] -fromRight
        );
        memo[left][right]= max;
        return max;
    }
}
