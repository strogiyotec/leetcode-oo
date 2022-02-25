package leetcode.oo.dp.dfs;

import leetcode.oo.IntPair;

//https://leetcode.com/problems/unique-paths-iii/
final class UniquePath3 {

    private int uniquePathCnt = 0;

    private final int[][] directions = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0},
    };

    public int uniquePathsIII(final int[][] grid) {
        IntPair startPosition = null;
        IntPair endPosition = null;
        int cellsToVisit = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    cellsToVisit++;
                } else if (grid[i][j] == 1) {
                    startPosition = new IntPair(i, j);
                } else if (grid[i][j] == 2) {
                    endPosition = new IntPair(i, j);
                }
            }
        }
        final boolean[][] visited = new boolean[grid.length][grid[0].length];
        this.dfs(startPosition.getFirst(), startPosition.getSecond(), endPosition, visited, cellsToVisit, grid);
        return this.uniquePathCnt;
    }

    private void dfs(final int row, final int col, final IntPair endPosition, final boolean[][] visited, int remaining, final int[][] grid) {
        if (row == endPosition.getFirst() && col == endPosition.getSecond() && remaining == 0) {
            uniquePathCnt++;
            return;
        }
        visited[row][col] = true;
        remaining--;
        for (final int[] direction : this.directions) {
            final int nextRow = row + direction[0];
            final int nextCol = col + direction[1];
            if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length || visited[nextRow][nextCol] || grid[nextRow][nextCol] == -1) {
                continue;
            }
            this.dfs(nextRow, nextCol, endPosition, visited, remaining, grid);
        }
        visited[row][col] = false;
        remaining++;
    }
}
