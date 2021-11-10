package leetcode.oo.dp;

import java.util.HashMap;
import java.util.stream.IntStream;

//https://leetcode.com/problems/cherry-pickup/
public final class PickupCherry {

    public static void main(String[] args) {
        System.out.println(new PickupCherry().cherryPickup(
            new int[][]{
                {1, 1, -1}, {1, -1, 1}, {-1, 1, 1}
            }
        ));
        System.out.println(new PickupCherry().cherryPickup(
            new int[][]{
            }
        ));
    }

    public int cherryPickup(final int[][] grid) {
        return Math.max(
            0,
            this.dfs(0, 0, 0, 0, grid, new HashMap<>())
        );
    }

    private int dfs(final int firstRow, final int firstCol, final int secondRow, final int secondCol, final int[][] grid, final HashMap<String, Integer> map) {
        if (firstRow < 0 || firstRow >= grid.length || firstCol < 0 || firstCol >= grid[0].length ||
            secondRow < 0 || secondRow >= grid.length || secondCol < 0 || secondCol >= grid[0].length ||
            grid[firstRow][firstCol] == -1 || grid[secondRow][secondCol] == -1
        ) {
            return Integer.MIN_VALUE;
        }
        final String cache = String.format("%d-%d-%d-%d", firstRow, firstCol, secondRow, secondCol);
        if (map.containsKey(cache)) {
            return map.get(cache);
        }
        if (firstRow == grid.length - 1 && firstCol == grid[0].length - 1) {
            return grid[firstRow][firstCol];
        }
        if (secondRow == grid.length - 1 && secondCol == grid[0].length - 1) {
            return grid[secondRow][secondCol];
        }
        int cherries;
        if (firstRow == secondRow && firstCol == secondCol) {
            cherries = grid[firstRow][secondCol];
        } else {
            cherries = grid[firstRow][firstCol] + grid[secondRow][secondCol];
        }
        cherries += IntStream.of(
            this.dfs(firstRow + 1, firstCol, secondRow + 1, secondCol, grid, map),
            this.dfs(firstRow + 1, firstCol, secondRow, secondCol + 1, grid, map),
            this.dfs(firstRow, firstCol + 1, secondRow + 1, secondCol, grid, map),
            this.dfs(firstRow, firstCol + 1, secondRow, secondCol + 1, grid, map)
        ).max().getAsInt();
        map.put(cache, cherries);
        return cherries;
    }

}
