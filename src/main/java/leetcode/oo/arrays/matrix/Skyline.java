package leetcode.oo.arrays.matrix;

//https://leetcode.com/problems/max-increase-to-keep-city-skyline/
public final class Skyline {

    public static void main(String[] args) {
        System.out.println(new Skyline().maxIncreaseKeepingSkyline(
            new int[][]{
                {3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}
            }
        ));
    }

    public int maxIncreaseKeepingSkyline(final int[][] grid) {
        final int[] maxRow = new int[grid.length];
        final int[] maxCol = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxCol[j] = Math.max(maxCol[j], grid[i][j]);
            }
        }
        int solution = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                solution += Math.abs(grid[i][j] - Math.min(maxRow[i], maxCol[j]));
            }
        }
        return solution;
    }
}
