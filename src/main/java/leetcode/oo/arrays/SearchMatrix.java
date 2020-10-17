package leetcode.oo.arrays;


/**
 * Search matrix.
 * See {@link <a href ="https://leetcode.com/problems/search-a-2d-matrix/">https://leetcode.com/problems/search-a-2d-matrix/</a>}
 */
final class SearchMatrix {

    boolean searchMatrix(final int[][] matrix, final int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            final int mid = (left + right) / 2;
            final int element = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (element == target) {
                return true;
            } else if (target > element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
