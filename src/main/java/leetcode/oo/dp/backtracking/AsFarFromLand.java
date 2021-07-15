package leetcode.oo.dp.backtracking;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/as-far-from-land-as-possible/
public final class AsFarFromLand {

    public static void main(String[] args) {
        System.out.println(new AsFarFromLand().maxDistance(
            new int[][]{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
            }
        ));
        System.out.println(new AsFarFromLand().maxDistance(
            new int[][]{
                {1, 0, 1}, {0, 0, 0}, {1, 0, 1}
            }
        ));
    }

    public int maxDistance(int[][] grid) {
        final boolean[][] visited = new boolean[grid.length][grid.length];
        final Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1) {
                    visited[i][j] = true;
                    queue.add(new int[]{i, j});
                }
            }
        }
        if (queue.isEmpty() || queue.size() == grid.length *grid.length) {
            return -1;
        }
        int length = 0;
        final int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        };
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] poll = queue.poll();
                for (final int[] direction : directions) {
                    final int nextRow = poll[0] + direction[0];
                    final int nextCol = poll[1] + direction[1];
                    if (nextRow >= 0 && nextRow < grid.length && nextCol >= 0 && nextCol < grid.length && !visited[nextRow][nextCol] && grid[nextRow][nextCol] == 0) {
                        queue.add(new int[]{nextRow, nextCol});
                        visited[nextRow][nextCol] = true;
                    }
                }
            }
            length++;
        }
        return length - 1;
    }
}
