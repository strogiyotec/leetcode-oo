package leetcode.oo.dp.dfs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/making-a-large-island/
final class LargeIsland {

    int largestIsland(final int[][] grid) {
        final Map<Integer, Integer> idToCnt = new HashMap<>(grid.length);
        int id = 2;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    this.dfs(idToCnt, id, grid, i, j);
                    id++;
                }
            }
        }
        int max = idToCnt.values().stream().max(Comparator.comparingInt(o -> o)).orElse(0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    int sum = 0;
                    final Set<Integer> cache = new HashSet<>(idToCnt.size());
                    sum += this.cntNeighbours(cache, idToCnt, i + 1, j, grid);
                    sum += this.cntNeighbours(cache, idToCnt, i - 1, j, grid);
                    sum += this.cntNeighbours(cache, idToCnt, i, j - 1, grid);
                    sum += this.cntNeighbours(cache, idToCnt, i, j + 1, grid);
                    sum += 1;
                    max = Math.max(max, sum);
                }
            }
        }
        return max;
    }

    private int cntNeighbours(final Set<Integer> cache, final Map<Integer, Integer> idToCnt, final int row, final int column, final int[][] grid) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == 0) {
            return 0;
        }
        if (!cache.contains(grid[row][column])) {
            cache.add(grid[row][column]);
            return idToCnt.get(grid[row][column]);
        }
        return 0;
    }

    private void dfs(final Map<Integer, Integer> idToCnt, final int id, final int[][] grid, final int row, final int column) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == 0 || grid[row][column] == id) {
            return;
        }
        grid[row][column] = id;
        idToCnt.merge(id, 1, Integer::sum);
        this.dfs(idToCnt, id, grid, row - 1, column);
        this.dfs(idToCnt, id, grid, row + 1, column);
        this.dfs(idToCnt, id, grid, row, column - 1);
        this.dfs(idToCnt, id, grid, row, column + 1);
    }
}
