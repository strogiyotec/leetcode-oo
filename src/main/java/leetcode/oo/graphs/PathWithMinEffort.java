package leetcode.oo.graphs;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import leetcode.oo.IntPair;

//https://leetcode.com/problems/path-with-minimum-effort/
final class PathWithMinEffort {

    int minimumEffortPath(final int[][] heights) {
        final Set<IntPair> cache = new HashSet<>(heights.length << 1);
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(value -> value[2]));
        queue.add(new int[]{0, 0, 0});
        final int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0},
        };
        int output = 0;
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int row = poll[0];
            final int col = poll[1];
            final int difference = poll[2];
            output = Math.max(output, difference);
            if (row == heights.length - 1 && col == heights[0].length - 1) {
                return output;
            }
            cache.add(new IntPair(row, col));
            for (final int[] direction : directions) {
                final int nextRow = row + direction[0];
                final int nextCol = col + direction[1];
                final IntPair pair = new IntPair(nextRow, nextCol);
                if (nextRow < 0 || nextRow >= heights.length || nextCol < 0 || nextCol >= heights[0].length || cache.contains(pair)) {
                    continue;
                }
                queue.add(
                    new int[]{
                        nextRow,
                        nextCol,
                        Math.abs(
                            heights[row][col] - heights[nextRow][nextCol]
                        )
                    }
                );
            }
        }
        return 0;
    }
}
