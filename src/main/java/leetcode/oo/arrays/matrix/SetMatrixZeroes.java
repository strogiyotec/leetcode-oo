package leetcode.oo.arrays.matrix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/set-matrix-zeroes/
public final class SetMatrixZeroes {

    public static void main(String[] args) {
        final int[][] matrix = {
            {0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}
        };
        new SetMatrixZeroes().setZeroes(
            matrix
        );
        System.out.println(Arrays.deepToString(matrix));
    }

    public void setZeroes(final int[][] matrix) {
        final Set<Integer> rows = new HashSet<>(matrix.length);
        final Set<Integer> columns = new HashSet<>(matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for (final int row : rows) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }
        for (final int column : columns) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][column] = 0;
            }
        }
    }
}
