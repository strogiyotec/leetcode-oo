package leetcode.oo.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/car-pooling/
final class CarPooling {

    boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(o -> o[1]));
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(value -> value[0]));
        int currentCapacity = capacity - trips[0][0];
        queue.add(trips[0]);
        for (int i = 1; i < trips.length; i++) {
            if(currentCapacity < 0){
                return false;
            }
            final int[] nextTrip = trips[i];
            while (!queue.isEmpty() && queue.peek()[2] <= nextTrip[1]) {
                final int[] poll = queue.poll();
                currentCapacity += poll[0];
            }
            queue.add(nextTrip);
            currentCapacity -= nextTrip[0];
        }
        return true;
    }

}
