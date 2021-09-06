package leetcode.oo.graphs;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.BiPredicate;

//https://leetcode.com/problems/cut-off-trees-for-golf-event/
final class CutOffTrees {

    int cutOffTree(final List<List<Integer>> forest) {
        final int rows = forest.size();
        final int columns = forest.get(0).size();
        final Queue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(p -> p[2]));
        for (int i = 0; i < forest.size(); i++) {
            for (int j = 0; j < forest.get(i).size(); j++) {
                if (forest.get(i).get(j) > 1) {
                    queue.add(new int[]{i, j, forest.get(i).get(j)});
                }
            }
        }
        int[] startPos = new int[]{0, 0};
        int steps = 0;
        final BiPredicate<Integer, Integer> closedCell = (row, col) -> forest.get(row).get(col) == 0;
        while (!queue.isEmpty()) {
            final int[] poll = queue.poll();
            final int currentSteps = this.minStepsTillNext(poll, startPos, rows, columns, closedCell);
            if (currentSteps == -1) {
                return -1;
            }
            steps += currentSteps;
            startPos = poll;
        }
        return steps;
    }

    private int minStepsTillNext(final int[] destination, final int[] start, final int rows, final int columns, final BiPredicate<Integer, Integer> closedCell) {
        final boolean[][] cache = new boolean[rows][columns];
        cache[start[0]][start[1]] = true;
        int steps = 0;
        final Queue<int[]> queue = new LinkedList<>();
        queue.add(start);
        final int[][] directions = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
        };
        while (!queue.isEmpty()) {
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final int[] next = queue.poll();
                if (next[0] == destination[0] && next[1] == destination[1]) {
                    return steps;
                }
                for (final int[] direction : directions) {
                    final int nextRow = next[0] + direction[0];
                    final int nextCol = next[1] + direction[1];
                    if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= columns || cache[nextRow][nextCol] || closedCell.test(nextRow, nextCol)) {
                        continue;
                    }
                    cache[nextRow][nextCol] = true;
                    queue.add(new int[]{nextRow, nextCol});
                }
            }
            steps++;
        }
        return -1;
    }
}
