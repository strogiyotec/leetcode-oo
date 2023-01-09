package leetcode.oo.graphs;

import java.util.LinkedList;
import java.util.Queue;

final class ShortestPathMatrix {

    private static final int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, -1}, {-1, 1}, {-1, -1}, {1, 1}};

    int shortestPathBinaryMatrix(final int[][] grid) {
        if (grid[0][0] != 0) {
            return -1;
        }
        final Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        int steps = 1;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] poll = queue.poll();
                final int currentX = poll[0];
                final int currentY = poll[1];
                if (currentX == grid.length - 1 && currentY == grid[0].length - 1) {
                    return steps;
                }
                for (final int[] dirs : dir) {
                    final int nextX = currentX + dirs[0];
                    final int nextY = currentY + dirs[1];
                    if (nextX < 0 || nextX >= grid.length || nextY < 0 || nextY >= grid.length || grid[nextX][nextY] == 1) {
                        continue;
                    }
                    grid[nextX][nextY] = 1;
                    queue.add(new int[]{nextX, nextY});
                }
            }
            steps++;
        }
        return -1;
    }
}
