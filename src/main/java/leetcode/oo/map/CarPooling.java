package leetcode.oo.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//https://leetcode.com/problems/car-pooling/
final class CarPooling {

    boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparing(trip -> trip[1]));
        final Queue<int[]> queue = new PriorityQueue<>(Comparator.comparing(trip -> trip[2]));
        int currentCapacity = capacity;
        for (final int[] trip : trips) {
            while (!queue.isEmpty() && trip[1] >= queue.peek()[2]) {
                currentCapacity += queue.poll()[0];
            }
            currentCapacity -= trip[0];
            if (currentCapacity < 0) {
                return false;
            }
            queue.offer(trip);
        }
        return true;
    }

}
