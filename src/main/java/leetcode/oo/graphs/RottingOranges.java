package leetcode.oo.graphs;

import java.util.HashSet;
import java.util.Set;
import leetcode.oo.IntPair;

/**
 * Rotting Oranges.
 * See {@link <a href ="https://leetcode.com/problems/rotting-oranges/">https://leetcode.com/problems/rotting-oranges/</a>}
 */
final class RottingOranges {

    int orangesRotting(int[][] grid) {
        final Set<IntPair> fresh = new HashSet<>();
        final Set<IntPair> spoiled = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    fresh.add(new IntPair(i, j));
                }
                if (grid[i][j] == 2) {
                    spoiled.add(new IntPair(i, j));
                }
            }
        }
        final int[][] rotations = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int min = 0;
        while (!fresh.isEmpty()) {
            final Set<IntPair> infected = new HashSet<>();
            for (final IntPair sp : spoiled) {
                for (final int[] rotation : rotations) {
                    final int nextI = rotation[0] + sp.getFirst();
                    final int nextJ = rotation[1] + sp.getSecond();
                    final IntPair infectedCoord = new IntPair(nextI, nextJ);
                    if (fresh.remove(infectedCoord)) {
                        infected.add(infectedCoord);
                    }
                }
            }
            if (infected.isEmpty()) {
                return -1;
            }
            spoiled.clear();
            spoiled.addAll(infected);
            min++;
        }
        return min;
    }
}
