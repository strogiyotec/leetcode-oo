package leetcode.oo.dp.dfs;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode.com/problems/shortest-bridge/
final class ShortestBridge {

    int shortestBridge(final int[][] bridges) {
        final boolean[][] visited = new boolean[bridges.length][bridges[0].length];
        boolean found = false;
        final Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < bridges.length && !found; i++) {
            for (int j = 0; j < bridges[0].length; j++) {
                if (bridges[i][j] == 1) {
                    this.dfs(i, j, bridges, visited, queue);
                    found = true;
                    break;
                }
            }
        }
        int steps = 0;
        final int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0},
        };
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] poll = queue.poll();
                for (final int[] direction : directions) {
                    final int row = poll[0] + direction[0];
                    final int column = poll[1] + direction[1];
                    if (row >= 0 && row < bridges.length && column >= 0 && column < bridges[0].length && !visited[row][column]) {
                        visited[row][column] = true;
                        if (bridges[row][column] == 1) {
                            return steps;
                        }
                        queue.add(new int[]{row, column});
                    }
                }
            }
            steps++;
        }
        return -1;
    }

    private void dfs(final int row, final int column, final int[][] bridges, final boolean[][] visited, final Queue<int[]> queue) {
        if (row < 0 || row >= bridges.length || column < 0 || column >= bridges[0].length || visited[row][column] || bridges[row][column] != 1) {
            return;
        }
        visited[row][column] = true;
        queue.add(new int[]{row, column});
        this.dfs(row + 1, column, bridges, visited, queue);
        this.dfs(row - 1, column, bridges, visited, queue);
        this.dfs(row, column + 1, bridges, visited, queue);
        this.dfs(row, column - 1, bridges, visited, queue);

    }

}
