package leetcode.oo.arrays.matrix;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public final class CountNegativeNumbers {

    public static void main(String[] args) {
        System.out.println(new CountNegativeNumbers().countNegatives(
            new int[][]{
                {4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}
            }
        ));
    }

    public int countNegatives(final int[][] grid) {
        int cnt = 0;
        for (final int[] ints : grid) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (ints[j] < 0) {
                    cnt++;
                } else {
                    break;
                }
            }
        }
        return cnt;
    }
}
