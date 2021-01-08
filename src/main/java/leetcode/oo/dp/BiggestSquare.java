package leetcode.oo.dp;

import java.util.Arrays;

//https://leetcode.com/problems/maximal-square/
final class BiggestSquare {

    private int max = 0;

    int maximalSquare(final char[][] matrix) {
        final int[][] cache = new int[matrix.length][matrix[0].length];
        for (final int[] line : cache) {
            Arrays.fill(line, -1);
        }
        this.fillCache(matrix, cache, 0, 0);
        return this.max;
    }

    private int fillCache(final char[][] matrix, final int[][] cache, final int row, final int column) {
        if (row >= matrix.length || column >= matrix[0].length) {
            return 0;
        }
        if (cache[row][column] == -1) {
            final int down = this.fillCache(matrix, cache, row + 1, column);
            final int left = this.fillCache(matrix, cache, row, column + 1);
            final int diag = this.fillCache(matrix, cache, row + 1, column + 1);
            if (matrix[row][column] == '1') {
                cache[row][column] = 1 + Math.min(
                    down,
                    Math.min(
                        left, diag
                    )
                );
            } else {
                cache[row][column] = 0;
            }
            this.max = Math.max(this.max, cache[row][column] * cache[row][column]);
        }
        return cache[row][column];
    }

}
