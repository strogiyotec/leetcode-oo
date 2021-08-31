package leetcode.oo.graphs;


//https://leetcode.com/problems/count-servers-that-communicate/
final class CountServersCommunicate {

    public int countServers(final int[][] grid) {
        final int[] rows = new int[grid.length];
        final int[] columns = new int[grid[0].length];
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    rows[i]++;
                    columns[j]++;
                    total++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && rows[i] ==1 && columns[j] == 1) {
                    total--;
                }
            }
        }
        return total;
    }
}
