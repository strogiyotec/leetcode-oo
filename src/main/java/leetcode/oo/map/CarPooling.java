package leetcode.oo.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/car-pooling/
final class CarPooling {

    boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(o -> o[1]));
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        queue.add(trips[0]);
        int currentCapacity = trips[0][0];
        for (int i = 1; i < trips.length; i++) {
            final int[] trip = trips[i];
            while (!queue.isEmpty() && queue.peek()[2] <= trip[1]) {
                currentCapacity -= queue.poll()[0];
            }
            currentCapacity += trip[0];
            if(currentCapacity >capacity){
                return false;
            }
            queue.offer(trip);
        }
        return true;
    }

}
