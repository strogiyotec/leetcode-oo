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
        final List<SpeedToEfficiency> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(new SpeedToEfficiency(efficiency[i], speed[i]));
        }
        list.sort(Comparator.<SpeedToEfficiency>comparingInt(value -> value.efficiency).reversed());
        final PriorityQueue<WorkerWithIndex> queue = new PriorityQueue<>(Comparator.comparingInt(value -> value.speed));
        long speedSum = 0;
        long maxEfficiency = 0L;
        final int mod = 1_000_000_000 + 7;
        for (int i = 0; i < n; i++) {
            queue.add(new WorkerWithIndex(i, list.get(i).speed));
            speedSum += list.get(i).speed;
            boolean skip = false;
            if (queue.size() > k) {
                final WorkerWithIndex poll = queue.poll();
                if (poll.index == i) {
                    skip = true;
                }
                if (!skip) {
                    speedSum -= poll.speed;
                }
            }
            maxEfficiency = Math.max(maxEfficiency, speedSum * list.get(i).efficiency);
        }
        return (int) (maxEfficiency % mod);
    }

    private static class WorkerWithIndex {
        final int index;

        final int speed;

        WorkerWithIndex(final int index, final int speed) {
            this.index = index;
            this.speed = speed;
        }
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
