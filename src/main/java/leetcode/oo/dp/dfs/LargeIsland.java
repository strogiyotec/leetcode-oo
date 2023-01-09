package leetcode.oo.dp.dfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/making-a-large-island/
final class LargeIsland {

    int largestIsland(final int[][] grid) {
        final Map<Integer, Integer> idToCnt = new HashMap<>(grid.length << 1);
        int id = 2;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    this.dfs(i, j, idToCnt, grid, id);
                    id++;
                }
            }
        }
        int max = idToCnt.values().stream().max(Integer::compare).orElse(0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 0) {
                    final Set<Integer> set = new HashSet<>(4);
                    int cnt = 0;
                    cnt += this.search(i + 1, j, set, idToCnt, grid);
                    cnt += this.search(i - 1, j, set, idToCnt, grid);
                    cnt += this.search(i, j + 1, set, idToCnt, grid);
                    cnt += this.search(i, j - 1, set, idToCnt, grid);
                    cnt++;
                    max = Math.max(cnt, max);
                }
            }
        }
        return max;
    }

    private int search(final int row, final int col, final Set<Integer> set, final Map<Integer, Integer> idToCnt, final int[][] grid) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }
        if (!set.add(grid[row][col])) {
            return 0;
        }
        return idToCnt.get(grid[row][col]);
    }

    private void dfs(final int row, final int col, final Map<Integer, Integer> idToCnt, final int[][] grid, final int id) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == id || grid[row][col] == 0) {
            return;
        }
        grid[row][col] = id;
        idToCnt.merge(id, 1, Integer::sum);
        this.dfs(row + 1, col, idToCnt, grid, id);
        this.dfs(row - 1, col, idToCnt, grid, id);
        this.dfs(row, col - 1, idToCnt, grid, id);
        this.dfs(row, col + 1, idToCnt, grid, id);
    }

}
