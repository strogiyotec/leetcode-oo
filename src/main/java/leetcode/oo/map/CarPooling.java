package leetcode.oo.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/car-pooling/
final class CarPooling {

    boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(o -> o[1]));
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[2]));
        int currentPassangers = 0;
        for (final int[] trip : trips) {
            while (!queue.isEmpty() && trip[1] >= queue.peek()[2]) {
                currentPassangers -= queue.poll()[0];
            }
            currentPassangers += trip[0];
            if(currentPassangers>capacity){
                return false;
            }
            queue.offer(trip);
        }
        return true;
    }

}
