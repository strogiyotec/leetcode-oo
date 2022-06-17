package leetcode.oo.dp.dfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/flood-fill/
public final class FloodFill {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new FloodFill().floodFill(
            new int[][]{
                {0, 0, 0}, {0, 0, 0}
            },
            0,
            0,
            0
        )));
    }

    int[][] floodFill(int[][] image, int sr, int sc, int color) {
        final Queue<int[]> coordinatesQueue = new LinkedList<>();
        coordinatesQueue.add(new int[]{sr, sc});
        final int firstCoordinateColor = image[sr][sc];
        final int[][] nextCoordinates = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        };
        while (!coordinatesQueue.isEmpty()) {
            final int[] current = coordinatesQueue.poll();
            final int currentRow = current[0];
            final int currentCol = current[1];
            image[currentRow][currentCol] = color;
            for (final int[] nextCoordinate : nextCoordinates) {
                final int nextRow = currentRow + nextCoordinate[0];
                final int nextCol = currentCol + nextCoordinate[1];
                if (nextRow < 0 || nextRow >= image.length || nextCol < 0 || nextCol >= image[0].length || image[nextRow][nextCol] != firstCoordinateColor) {
                    continue;
                }
                coordinatesQueue.add(new int[]{nextRow, nextCol});
            }
        }
        return image;
    }
}
