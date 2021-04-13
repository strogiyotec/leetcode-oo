package leetcode.oo.dp.greedy;

import java.util.Stack;

//https://leetcode.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/
final class MinDeletionCost {

    int minCost(final String line, final int[] cost) {
        final Stack<Integer> stack = new Stack<>();
        int min = 0;
        for (int i = 0; i < line.length(); i++) {
            if (!stack.isEmpty() && line.charAt(stack.peek()) == line.charAt(i)) {
                final int prev = cost[stack.peek()];
                final int next = cost[i];
                if (prev < next) {
                    min += prev;
                    stack.pop();
                    stack.push(i);
                } else {
                    min += next;
                }
            } else {
                stack.push(i);
            }
        }
        return min;
    }
}
