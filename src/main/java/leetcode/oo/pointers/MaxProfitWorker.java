package leetcode.oo.pointers;

import java.util.Arrays;
import java.util.Comparator;
import leetcode.oo.IntPair;

/**
 *Most Profit Assigning Work.
 * See {@link <a href ="https://leetcode.com/problems/most-profit-assigning-work/">https://leetcode.com/problems/most-profit-assigning-work/</a>}.
 */
final class MaxProfitWorker {

    int maxProfitAssignment(final int[] difficulty, final int[] profit, final int[] worker) {
        final IntPair[] pairs = new IntPair[difficulty.length];
        for (int i = 0; i < difficulty.length; i++) {
            pairs[i] = new IntPair(difficulty[i], profit[i]);
        }
        Arrays.sort(pairs, Comparator.comparingInt(IntPair::getFirst));
        Arrays.sort(worker);
        int workerId = 0;
        int maxProfit = 0;
        while (workerId < worker.length) {
            int diffIndex = 0;
            int currentProfit = 0;
            while (diffIndex < pairs.length && pairs[diffIndex].getFirst() <= worker[workerId]) {
                currentProfit = Math.max(currentProfit, pairs[diffIndex].getSecond());
                diffIndex++;
            }
            maxProfit += currentProfit;
            workerId++;
        }
        return maxProfit;
    }
}
