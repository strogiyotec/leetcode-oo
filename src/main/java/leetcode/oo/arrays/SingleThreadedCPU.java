package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/single-threaded-cpu/
public final class SingleThreadedCPU {

    public static void main(String[] args) {
        System.out.println(
            Arrays.toString(
                new SingleThreadedCPU().getOrder(
                    new int[][]{
                        {7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}
                    }
                )
            )
        );
        System.out.println(
            Arrays.toString(
                new SingleThreadedCPU().getOrder(
                    new int[][]{
                        {1, 2}, {2, 4}, {3, 2}, {4, 1}
                    }
                )
            )
        );
    }

    public int[] getOrder(final int[][] tasks) {
        final List<Triplet> tripletList = new ArrayList<>(tasks.length);
        for (int i = 0; i < tasks.length; i++) {
            tripletList.add(new Triplet(i, tasks[i][0], tasks[i][1]));
        }
        tripletList.sort(
            Comparator.<Triplet>comparingInt(value -> value.time)
        );
        final PriorityQueue<Triplet> queue = new PriorityQueue<>(
            Comparator.<Triplet>comparingInt(value -> value.duration)
                .thenComparingInt(value -> value.index)
        );
        final int[] order = new int[tasks.length];
        int orderIndex = 0;
        int tripletsIndex = 0;
        int time = 1;
        while (orderIndex < order.length) {
            while (tripletsIndex < tripletList.size() && tripletList.get(tripletsIndex).time <= time) {
                queue.offer(tripletList.get(tripletsIndex));
                tripletsIndex++;
            }
            if (queue.isEmpty()) {
                time = tripletList.get(tripletsIndex).time;
            } else {
                final Triplet currentTask = queue.poll();
                order[orderIndex] = currentTask.index;
                orderIndex++;
                time += currentTask.duration;
            }
        }
        return order;
    }

    private static class Triplet {
        final int index;
        final int time;
        final int duration;

        Triplet(final int index, final int time, final int duration) {
            this.index = index;
            this.time = time;
            this.duration = duration;
        }
    }
}
