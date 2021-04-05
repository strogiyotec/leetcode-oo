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

    private int dfs(final int[][] memo, final int i, final int j, final int sum, final int[] stones) {
        if (i == j) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        final int left = this.dfs(memo, i + 1, j, sum - stones[i], stones);
        final int right = this.dfs(memo, i, j - 1, sum - stones[j], stones);
        memo[i][j] = Math.max(
            sum - stones[i] - left,
            sum - stones[j] - right
        );
        return memo[i][j];
    }
}
