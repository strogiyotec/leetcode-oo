package leetcode.oo.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-performance-of-a-team/
public final class PerformanceTeam {

    public static void main(String[] args) {
        System.out.println(new PerformanceTeam().maxPerformance(
            6,
            new int[]{2, 10, 3, 1, 5, 8},
            new int[]{5, 4, 3, 9, 7, 2},
            2
        ));
    }

    public int maxPerformance(
        int n,
        int[] speed,
        int[] efficiency,
        int k
    ) {
        final List<SpeedToEfficiency> list = new ArrayList<>(speed.length);
        for (int i = 0; i < speed.length; i++) {
            list.add(new SpeedToEfficiency(efficiency[i], speed[i]));
        }
        list.sort(Comparator.comparingInt(o -> o.efficiency));
        final PriorityQueue<Integer> queue = new PriorityQueue<>();
        long sum = 0;
        long out = 0;
        final int mod = 1_000_000_000+7;
        for (int i = speed.length - 1; i >= 0; i--) {
            queue.add(list.get(i).speed);
            sum += list.get(i).speed;
            if (queue.size() > k) {
                sum -= queue.poll();
            }
            out = Math.max(out, sum * list.get(i).efficiency);
        }
        return (int) (out % (long)(1e9 + 7));
    }

    private static class SpeedToEfficiency {
        final int efficiency;
        final int speed;

        private SpeedToEfficiency(final int efficiency, final int speed) {
            this.efficiency = efficiency;
            this.speed = speed;
        }
    }
}
