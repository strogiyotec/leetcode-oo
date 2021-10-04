package leetcode.oo.arrays.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

//https://leetcode.com/problems/find-all-groups-of-farmland/
public final class GroupsFarmland {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(new GroupsFarmland().findFarmland(
            new int[][]{
                {0}
            }
        )));
        System.out.println(Arrays.deepToString(new GroupsFarmland().findFarmland(
            new int[][]{
                {1,1},{1,1}
            }
        )));
        System.out.println(Arrays.deepToString(new GroupsFarmland().findFarmland(
            new int[][]{
                {1, 0, 0}, {0, 1, 1}, {0, 1, 1}
            }
        )));
    }

    public int[][] findFarmland(int[][] land) {
        final List<int[]> lists = new ArrayList<>(land.length);
        boolean[][] cache = new boolean[land.length][land[0].length];
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1 && ! cache[i][j]) {
                    final TreeSet<Coord> list = new TreeSet<>(Comparator.<Coord>comparingInt(value -> value.row).thenComparingInt(value -> value.col));
                    this.dfs(list, i, j, land, cache);
                    if (list.size() == 1) {
                        final Coord first = list.first();
                        lists.add(new int[]{first.row, first.col, first.row, first.col});
                    } else {
                        final Coord first = list.first();
                        final Coord last = list.last();
                        lists.add(new int[]{first.row, first.col, last.row, last.col});
                    }
                }
            }
        }
        return lists.toArray(new int[][]{});
    }

    private void dfs(final TreeSet<Coord> list, final int row, final int col, final int[][] land, boolean[][] cache) {
        if (row < 0 || row >= land.length || col < 0 || col >= land[0].length || land[row][col] == 0 || cache[row][col]) {
            return;
        }
        list.add(new Coord(row, col));
        cache[row][col] = true;
        this.dfs(list, row - 1, col, land, cache);
        this.dfs(list, row + 1, col, land, cache);
        this.dfs(list, row, col - 1, land, cache);
        this.dfs(list, row, col + 1, land, cache);
    }

    private static class Coord {
        final int row;
        final int col;

        private Coord(final int row, final int col) {
            this.row = row;
            this.col = col;
        }
    }
}
