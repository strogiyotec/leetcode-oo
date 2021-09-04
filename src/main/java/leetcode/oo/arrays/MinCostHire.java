package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/minimum-cost-to-hire-k-workers/
final class MinCostHire {

    public double mincostToHireWorkers(
        int[] quality,
        int[] wage,
        int k
    ) {
        var sortedWorkers = new ArrayList<Worker>(k + 1);
        final int length = quality.length;
        for (int i = 0; i < length; i++) {
            sortedWorkers.add(new Worker(
                quality[i],
                wage[i] * 1.0 / quality[i]
            ));
        }
        sortedWorkers.sort(Comparator.comparingDouble(p -> p.ratio));
        var queue = new PriorityQueue<Worker>(Comparator.<Worker>comparingInt(p -> p.quality).reversed());
        int totalQuality = 0;
        double minCost = Double.MAX_VALUE;
        for (final Worker worker : sortedWorkers) {
            totalQuality += worker.quality;
            queue.offer(worker);
            if (queue.size() > k) {
                totalQuality -= queue.poll().quality;
            }
            if (queue.size() == k) {
                minCost = Math.min(
                    minCost,
                    totalQuality * worker.ratio
                );
            }
        }
        return minCost;
    }

    private static class Worker {

        private final int quality;

        private final double ratio;

        private Worker(final int quality, final double ratio) {
            this.quality = quality;
            this.ratio = ratio;
        }
    }
}
