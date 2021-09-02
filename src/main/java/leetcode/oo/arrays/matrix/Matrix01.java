package leetcode.oo.arrays.matrix;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/01-matrix/
final class Matrix01 {

    int[][] updateMatrix(int[][] mat) {
        final Queue<int[]> coordinates = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    coordinates.add(new int[]{i, j});
                } else {
                    mat[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        final int[][] next = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0},
        };
        while (!coordinates.isEmpty()) {
            final int[] coord = coordinates.poll();
            for (final int[] nextCoord : next) {
                final int nextI = coord[0] + nextCoord[0];
                final int nextJ = coord[1] + nextCoord[1];
                if (nextI < 0 || nextI >= mat.length || nextJ < 0 || nextJ >= mat[0].length || mat[nextI][nextJ] <= mat[coord[0]][coord[1]] + 1) {
                    continue;
                }
                coordinates.offer(new int[]{nextI, nextJ});
                mat[nextI][nextJ] = mat[coord[0]][coord[1]] + 1;
            }
        }
        return mat;
    }

}
