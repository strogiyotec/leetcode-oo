package leetcode.oo.dp.dfs;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/shortest-bridge/
final class ShortestBridge {

    int shortestBridge(final int[][] bridges) {
        final Queue<int[]> queue = new LinkedList<>();
        boolean found = false;
        for (int i = 0; i < bridges.length && !found; i++) {
            for (int j = 0; j < bridges[i].length; j++) {
                if (bridges[i][j] == 1) {
                    found = true;
                    this.dfs(i, j, queue, bridges);
                    break;
                }
            }
        }
        final int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0},
        };
        int steps = 0;
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] poll = queue.poll();
                final int row = poll[0];
                final int column = poll[1];
                for (final int[] direction : directions) {
                    final int nextRow = row + direction[0];
                    final int nextCol = column + direction[1];
                    if (nextRow < 0 || nextRow >= bridges.length || nextCol < 0 || nextCol >= bridges[0].length || bridges[nextRow][nextCol] == -1) {
                        continue;
                    }
                    if (bridges[nextRow][nextCol] == 1) {
                        return steps;
                    }
                    bridges[nextRow][nextCol] = -1;
                    queue.add(new int[]{nextRow,nextCol});
                }
            }
            steps++;
        }
        return -1;
    }

    private void dfs(final int row, final int column, final Queue<int[]> queue, final int[][] bridges) {
        if (row < 0 || row >= bridges.length || column < 0 || column >= bridges[0].length || bridges[row][column] != 1) {
            return;
        }
        queue.add(new int[]{row, column});
        bridges[row][column] = -1;
        this.dfs(row + 1, column, queue, bridges);
        this.dfs(row - 1, column, queue, bridges);
        this.dfs(row, column - 1, queue, bridges);
        this.dfs(row, column + 1, queue, bridges);
    }

}
