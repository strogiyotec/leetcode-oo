package leetcode.oo.graphs;

import java.util.Arrays;

//https://leetcode.com/problems/count-all-possible-routes/
final class CountAllRoutes {

    private static final int MOD = (int) (StrictMath.pow(10, 9) + 7);

    public int countRoutes(final int[] locations, int start, int finish, int fuel) {
        final int[][] cache = new int[locations.length][fuel + 1];
        for (final int[] ints : cache) {
            Arrays.fill(ints, -1);
        }
        return this.dfs(locations, start, finish, fuel, cache);
    }

    private int dfs(
        final int[] locations,
        final int start,
        final int finish,
        final int currentFuel,
        final int[][] cache
    ) {
        if (currentFuel < 0) {
            return 0;
        }
        if (cache[start][currentFuel] != -1) {
            return cache[start][currentFuel];
        }
        int result = 0;
        if (start == finish) {
            result++;
        }
        for (int i = 0; i < locations.length; i++) {
            final int remainingFuel = Math.abs(locations[i] - locations[start]);
            if (i == start) {
                continue;
            }
            result += this.dfs(locations, i, finish, currentFuel - remainingFuel, cache);
            result %= MOD;
        }
        cache[start][currentFuel] = result;
        return result;
    }

}
