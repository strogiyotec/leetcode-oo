package leetcode.oo.dp;

import java.util.Arrays;
import java.util.stream.IntStream;

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
        if (row < 0 || row >= matrix.length || column < 0 || column >= matrix[0].length) {
            return 0;
        }
        if (cache[row][column] == -1) {
            final int down = this.fillCache(matrix, cache, row + 1, column);
            final int right = this.fillCache(matrix, cache, row, column + 1);
            final int diag = this.fillCache(matrix, cache, row + 1, column + 1);
            if (matrix[row][column] == '0') {
                cache[row][column] = 0;
            } else {
                cache[row][column] = IntStream.of(down, right, diag).min().getAsInt() + 1;
                this.max = Math.max(cache[row][column] * cache[row][column], this.max);
            }
        }
        return cache[row][column];
    }

}
