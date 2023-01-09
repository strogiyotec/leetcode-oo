package leetcode.oo.dp.greedy;

import java.util.ArrayDeque;

//https://leetcode.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/
final class MinDeletionCost {

    int minCost(final String line, final int[] cost) {
        final ArrayDeque<Integer> queue = new ArrayDeque<>(cost.length);
        int minCost = 0;
        for (int i = 0; i < line.length(); i++) {
            if (queue.isEmpty() || line.charAt(queue.peekLast()) != line.charAt(i)) {
                queue.addLast(i);
            } else {
                if (cost[queue.peekLast()] < cost[i]) {
                    minCost += cost[queue.peekLast()];
                    queue.removeLast();
                    queue.addLast(i);
                } else {
                    minCost += cost[i];
                }
            }
        }
        return minCost;
    }
}
