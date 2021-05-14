package leetcode.oo.map;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/falling-squares/
final class FallingSquares {

    List<Integer> fallingSquares(final int[][] positions) {
        final List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{positions[0][0], positions[0][0] + positions[0][1], positions[0][1]});
        final List<Integer> solution = new ArrayList<>();
        solution.add(intervals.get(0)[2]);
        int maxHeight = intervals.get(0)[2];
        for (int i = 1; i < positions.length; i++) {
            maxHeight = Math.max(maxHeight, this.nextHeight(intervals, positions[i]));
            solution.add(maxHeight);
        }
        return solution;
    }

    private int nextHeight(final List<int[]> intervals, final int[] position) {
        final int from = position[0];
        final int to = position[0] + position[1];
        int height = 0;
        for (final int[] interval : intervals) {
            if (interval[0] >= from && interval[0] < to || from >= interval[0] && from < interval[1]) {
                height = Math.max(height, interval[2]);
            }
        }
        height += position[1];
        intervals.add(new int[]{from, to, height});
        return height;
    }

}
