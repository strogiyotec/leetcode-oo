package leetcode.oo.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//https://leetcode.com/problems/queue-reconstruction-by-height/
final class QueueReconstruction {

    public int[][] reconstructQueue(final int[][] people) {
        Arrays.sort(
            people,
            Comparator.<int[]>comparingInt(value -> value[0]).reversed()
                .thenComparingInt(value -> value[1])
        );
        final List<int[]> solution = new ArrayList<>(people.length);
        for (final int[] person : people) {
            solution.add(person[1], person);
        }
        final int[][] queue = new int[people.length][people[0].length];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = solution.get(i);
        }
        return queue;
    }
}
