package leetcode.oo.arrays.matrix;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//https://leetcode.com/problems/pacific-atlantic-water-flow/
public final class WaterFlow {

    public static void main(String[] args) {
        System.out.println(
            new WaterFlow().pacificAtlantic(
                new int[][]{
                    {1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}
                }
            )
        );
    }

    public List<List<Integer>> pacificAtlantic(final int[][] heights) {
        final Set<SimpleEntry<Integer, Integer>> pacificCache = new HashSet<>(heights.length);
        final Set<SimpleEntry<Integer, Integer>> atlanticCache = new HashSet<>(heights.length);
        for (int i = 0; i < heights.length; i++) {
            this.dfs(i, 0, pacificCache, heights[i][0], heights);
            this.dfs(i, heights[0].length - 1, atlanticCache, heights[i][heights[0].length - 1], heights);
        }
        for (int i = 0; i < heights[0].length; i++) {
            this.dfs(0, i, pacificCache, heights[0][i], heights);
            this.dfs(heights.length - 1, i, atlanticCache, heights[heights.length - 1][i], heights);
        }
        pacificCache.retainAll(atlanticCache);
        return pacificCache.stream().map(entry -> Arrays.asList(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }

    private void dfs(final int row, final int column, final Set<SimpleEntry<Integer, Integer>> cache, final int prev, final int[][] matrix) {
        var entry = new SimpleEntry<>(row, column);
        if (row >= matrix.length || row < 0 || column >= matrix[0].length || column < 0 || cache.contains(entry) || matrix[row][column] < prev) {
            return;
        }
        cache.add(entry);
        this.dfs(row + 1, column, cache, matrix[row][column], matrix);
        this.dfs(row - 1, column, cache, matrix[row][column], matrix);
        this.dfs(row, column - 1, cache, matrix[row][column], matrix);
        this.dfs(row, column + 1, cache, matrix[row][column], matrix);
    }
}
