package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/minimum-cost-to-hire-k-workers/
final class MinCostHire {

    public double mincostToHireWorkers(
        int[] quality,
        int[] wage,
        int k
    ) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < wage.length; i++) {
            final double ratio = wage[i] * 1.0 / quality[i];
            final PriorityQueue<Double> nextWagers = new PriorityQueue<>(quality.length, Comparator.reverseOrder());
            for (int j = 0; j < wage.length; j++) {
                final double nextWorkerWage = ratio * quality[j];
                if (nextWorkerWage >= wage[j]) {
                    nextWagers.offer(nextWorkerWage);
                }
                if (nextWagers.size() > k) {
                    nextWagers.poll();
                }
            }
            if (nextWagers.size() < k) {
                continue;
            }
            double totalWager = 0.0;
            while (!nextWagers.isEmpty()) {
                totalWager += nextWagers.poll();
            }
            min = Math.min(min, totalWager);
        }
        return min;
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
