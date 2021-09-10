package leetcode.oo.stacks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//https://leetcode.com/problems/queue-reconstruction-by-height/
final class QueueReconstruction {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(
            people,
            Comparator.<int[]>comparingInt(person -> person[0])
                .reversed()
                .thenComparingInt(person -> person[1])
        );
        LinkedList<int[]> res = new LinkedList<>();
        for (int[] p : people) {
            res.add(p[1], p);
        }
        return res.toArray(new int[0][0]);
    }
}
