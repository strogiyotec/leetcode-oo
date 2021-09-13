package leetcode.oo.arrays.matrix;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/number-of-enclaves/
public final class NumberOfEnclaves {

    public static void main(String[] args) {
        System.out.println(new NumberOfEnclaves().numEnclaves(
            new int[][]{
                {0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}
            }
        ));
    }

    public int numEnclaves(int[][] A) {
        final Map<AbstractMap.SimpleEntry<Integer, Integer>, Boolean> cache = new HashMap<>(A.length << 1);
        final Set<AbstractMap.SimpleEntry<Integer, Integer>> islands = new HashSet<>(A.length << 1);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] == 1) {
                    islands.add(new AbstractMap.SimpleEntry<>(i, j));
                }
            }
        }
        int cnt = 0;
        for (final AbstractMap.SimpleEntry<Integer, Integer> island : islands) {
            if (!this.canReach(island.getKey(), island.getValue(), new HashSet<>(), A)) {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean canReach(
        final int row,
        final int col,
        final Set<AbstractMap.SimpleEntry<Integer, Integer>> cache,
        final int[][] matrix
    ) {
        final AbstractMap.SimpleEntry<Integer, Integer> entry = new AbstractMap.SimpleEntry<>(row, col);
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            return true;
        }
        if (matrix[row][col] == 0) {
            return false;
        }
        if(cache.contains(entry)){
            return false;
        }
        cache.add(entry);
        return this.canReach(row + 1, col, cache, matrix) || this.canReach(row - 1, col, cache, matrix) || this.canReach(row, col + 1, cache, matrix) || this.canReach(row, col - 1, cache, matrix);
    }
}
