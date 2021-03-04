package leetcode.oo.arrays;

//https://leetcode.com/problems/matrix-diagonal-sum/
final class MatrixDiagSum {

    int diagonalSum(final int[][] mat) {
        int sum = 0;
        boolean sameMiddle = mat.length % 2 != 0;
        int i = 0;
        int j = 0;
        while (i < mat.length && j < mat[0].length) {
            sum += mat[i++][j++];
        }
        i = mat.length - 1;
        j = 0;
        while (i >= 0 && j < mat[0].length) {
            sum += mat[i--][j++];
        }
        if (sameMiddle) {
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }
}
