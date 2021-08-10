package leetcode.oo.graphs;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/detect-cycles-in-2d-grid/
public final class CyclesInGrid {

    public static void main(String[] args) {
        System.out.println(new CyclesInGrid().containsCycle(
            new char[][]{
                {'a', 'a', 'a', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'a', 'a', 'a'}
            }
        ));
    }

    private int[][] directions = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };

    public boolean containsCycle(final char[][] grid) {
        boolean[][] cache = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!cache[i][j]) {
                    if (this.bfs(i, j, -1, -1, cache, grid)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean bfs(final int row, final int col, final int prevR, final int prevC, final boolean[][] cache, final char[][] grid) {
        final Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, col, prevR, prevC});
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            for (final int[] direction : this.directions) {
                final int nextRow = direction[0] + poll[0];
                final int nextCol = direction[1] + poll[1];
                if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length || grid[nextRow][nextCol] != grid[poll[0]][poll[1]]) {
                    continue;
                }
                if (nextRow == poll[2] && nextCol == poll[3]) {
                    continue;
                }
                if (cache[nextRow][nextCol]) {
                    return true;
                }
                cache[nextRow][nextCol] = true;
                queue.offer(new int[]{nextRow, nextCol, poll[0], poll[1]});
            }
        }
        return false;
    }

}
