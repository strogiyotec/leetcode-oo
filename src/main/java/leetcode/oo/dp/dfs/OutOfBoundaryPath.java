package leetcode.oo.dp.dfs;

import java.util.Arrays;

//https://leetcode.com/problems/out-of-boundary-paths/
final class OutOfBoundaryPath {

    int findPaths(int row, int column, int steps, int i, int j) {
        final int[][][] triplet = new int[row][column][steps + 1];
        for (final int[][] dp : triplet) {
            for (final int[] ints : dp) {
                Arrays.fill(ints, -1);
            }
        }
        return this.dfs(row, column, steps, i, j, triplet);
    }

    private int dfs(final int row, final int column, final int steps, final int i, final int j, final int[][][] triplet) {
        if (i == row || j == column || j < 0 || i < 0) {
            return 1;
        }
        if (steps == 0) {
            return 0;
        }
        if (triplet[i][j][steps] != -1) {
            return triplet[i][j][steps];
        }
        triplet[i][j][steps] =
            this.dfs(row, column, steps - 1, i + 1, j, triplet) +
                this.dfs(row, column, steps - 1, i, j + 1, triplet) +
                this.dfs(row, column, steps - 1, i - 1, j, triplet) +
                this.dfs(row, column, steps - 1, i, j - 1, triplet);
        return triplet[i][j][steps];
    }
}
