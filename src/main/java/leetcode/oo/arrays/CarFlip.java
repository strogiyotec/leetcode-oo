package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/car-fleet/
public final class CarFlip {

    public static void main(String[] args) {
        System.out.println(new CarFlip().carFleet(
            12,
            new int[]{10, 8, 0, 5, 3},
            new int[]{2, 4, 1, 1, 3}
        ));
    }

    public int carFleet(int target, int[] position, int[] speed) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.<Integer>comparingInt(index -> position[index]).reversed());
        for (int i = 0; i < position.length; i++) {
            queue.offer(i);
        }
        double time = 0;
        int cnt = 0;
        while (!queue.isEmpty()) {
            final int index = queue.poll();
            final int currentSpeed = speed[index];
            final int currentPos = position[index];
            final double currentTime = (double) (target - currentPos) / currentSpeed;
            if (currentTime > time) {
                cnt++;
                time = currentTime;
            }
        }
        return cnt;
    }
}
