package leetcode.oo.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

    
final class ShortestPathMatrix {

    private final int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, -1}, {-1, 1}, {-1, -1}, {1, 1}};

    int shortestPathBinaryMatrix(final int[][] grid) {
        if (grid[0][0] != 0) {
            return -1;
        }
        final int rowLength = grid.length;
        final int colLength = grid[0].length;
        final Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        int steps = 1;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] poll = queue.poll();
                if (poll[0] == rowLength - 1 && poll[1] == colLength - 1) {
                    return steps;
                }
                for (int j = 0; j < this.dir.length; j++) {
                    final int nextR = this.dir[j][0] + poll[0];
                    final int nextC = this.dir[j][1] + poll[1];
                    if (nextR >= 0 && nextR < rowLength && nextC >= 0 && nextC < colLength && grid[nextR][nextC] == 0) {
                        queue.add(new int[]{nextR, nextC});
                        grid[nextR][nextC] = 1;
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
