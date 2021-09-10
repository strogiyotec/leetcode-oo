package leetcode.oo.arrays.matrix;

import java.util.Arrays;

//https://leetcode.com/problems/largest-plus-sign/
public final class LargestPlusSign {

    public static void main(String[] args) {
        System.out.println(new LargestPlusSign().orderOfLargestPlusSign(
            5,
            new int[][]{
                {4, 2}
            }
        ));
    }

    public int orderOfLargestPlusSign(int N, int[][] mines) {
        final int[][] grid = new int[N][N];
        for (final int[] row : grid) {
            Arrays.fill(row, 1);
        }
        for (final int[] mine : mines) {
            grid[mine[0]][mine[1]] = 0;
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 1) {
                    int cnt = 0;
                    int dir = 0;
                    while (i + dir < N && i - dir >= 0 && j + dir < N && j - dir >= 0 &&
                        grid[i + dir][j] != 0 && grid[i - dir][j] != 0 && grid[i][j - dir] != 0 && grid[i][j + dir] != 0) {
                        cnt++;
                        dir++;
                    }
                    max = Math.max(max, cnt);
                }
            }
        }
        return max;
    }
}
