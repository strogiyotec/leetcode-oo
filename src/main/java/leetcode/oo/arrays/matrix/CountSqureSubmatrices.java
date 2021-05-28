package leetcode.oo.arrays.matrix;

//https://leetcode.com/problems/count-square-submatrices-with-all-ones/
final class CountSqureSubmatrices {

    int countSquares(final int[][] matrix) {
        int cnt = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 1) {
                cnt++;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 1) {
                cnt++;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    final int square = Math.min(
                        matrix[i - 1][j - 1],
                        Math.min(
                            matrix[i - 1][j],
                            matrix[i][j - 1]
                        )
                    ) + 1;
                    matrix[i][j] = square;
                    cnt += square;
                }
            }
        }
        return cnt;
    }
}
