package leetcode.oo.dp.dfs;

//https://leetcode.com/problems/island-perimeter/
public final class Perimeter {

    public static void main(String[] args) {
        System.out.println(new Perimeter().islandPerimeter(
            new int[][]{
                {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
            }
        ));
    }

    public int islandPerimeter(final int[][] grid) {
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    islands += 4;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        islands -= 2;
                    }
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        islands -= 2;
                    }
                }
            }
        }
        return islands;
    }
}
