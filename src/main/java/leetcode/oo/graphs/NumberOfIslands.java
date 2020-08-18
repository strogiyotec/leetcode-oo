package leetcode.oo.graphs;

final class NumberOfIslands {

    int numIslands(final char[][] grid) {
        final Dfs dfs = new Dfs() {
            @Override
            public int count(final int i, final int j) {
                if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
                    return 0;
                }
                grid[i][j] = '0';
                this.count(i + 1, j);
                this.count(i - 1, j);
                this.count(i, j + 1);
                this.count(i, j - 1);
                return 1;
            }
        };
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    cnt += dfs.count(i, j);
                }
            }
        }
        return cnt;
    }

    interface Dfs {
        int count(int i, int j);
    }
}
