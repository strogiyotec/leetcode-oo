package leetcode.oo.arrays.matrix;

//https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/
final class FindValidMatrixGivenSum {

     int[][] restoreMatrix(final int[] rowSum, final int[] colSum) {
        final int[][] matrix = new int[rowSum.length][colSum.length];
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                matrix[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= matrix[i][j];
                colSum[j] -= matrix[i][j];
            }
        }
        return matrix;
    }
}
