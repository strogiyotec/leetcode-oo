package leetcode.oo.arrays.matrix;

import java.util.Arrays;

//https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
final class LongestIncreasingPath {

    public int longestIncreasingPath(int[][] matrix) {
        final int[][] cache = new int[matrix.length][matrix[0].length];
        for (final int[] row : cache) {
            Arrays.fill(row, -1);
        }
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int length = this.maxLength(i, j, matrix, cache, -1);
                max = Math.max(length, max);
            }
        }
        return max;
    }

    private int maxLength(final int row, final int col, final int[][] matrix, final int[][] cache, int prev) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] <= prev) {
            return 0;
        }
        if (cache[row][col] != -1) {
            return cache[row][col];
        }
        final int current = matrix[row][col];
        final int up = this.maxLength(row + 1, col, matrix, cache, current);
        final int down = this.maxLength(row - 1, col, matrix, cache, current);
        final int right = this.maxLength(row, col + 1, matrix, cache, current);
        final int left = this.maxLength(row, col - 1, matrix, cache, current);
        int max = Math.max(
            up,
            Math.max(
                down,
                Math.max(
                    right,
                    left
                )
            )
        ) + 1;
        cache[row][col] = max;
        return max;
    }
}
