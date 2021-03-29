package leetcode.oo.arrays.matrix;

//https://leetcode.com/problems/rotate-image/
final class RotateImage {

    void rotate(final int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            for (int i = 0; i < right - left; i++) {
                final int top = left;
                final int bottom = right;
                final int topLeft = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i] = matrix[top + i][right];
                matrix[top + i][right] = topLeft;
            }
            left++;
            right--;
        }
    }
}
