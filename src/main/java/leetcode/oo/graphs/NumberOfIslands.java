package leetcode.oo.graphs;

/**
 * Number of islands
 * See {@link <a href ="https://leetcode.com/problems/number-of-islands/">https://leetcode.com/problems/number-of-islands/</a>}
 */
final class NumberOfIslands {

    int numIslands(final char[][] grid) {
        final Dfs dfs = new Dfs() {
            @Override
            public int count(final int i, final int j) {
                if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
                    return 0;
                grid[i][j] = '0';
                this.count(i + 1, j);
                this.count(i - 1, j);
                this.count(i, j - 1);
                this.count(i, j + 1);
                return 1;
            }
        };
        return dfs.count(0, 0);
    }

    interface Dfs {
        int count(int i, int j);
    }
}
