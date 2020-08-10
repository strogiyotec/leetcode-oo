package leetcode.oo.graphs;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Rotting Oranges.
 * See {@link <a href ="https://leetcode.com/problems/rotting-oranges/">https://leetcode.com/problems/rotting-oranges/</a>}
 */
final class RottingOranges {

    private static class IntPair {
        final int i;
        final int j;

        IntPair(final int i, final int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final IntPair intPair = (IntPair) o;
            return i == intPair.i &&
                    j == intPair.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, j);
        }
    }

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
        final int[][] rotations = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int min = 0;
        while (!fresh.isEmpty()) {
            final Set<IntPair> infected = new HashSet<>();
            for (final IntPair sp : spoiled) {
                for (final int[] rotation : rotations) {
                    final int nextI = rotation[0] + sp.i;
                    final int nextJ = rotation[1] + sp.j;
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
