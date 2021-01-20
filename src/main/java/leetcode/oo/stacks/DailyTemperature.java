package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
final class DailyTemperature {

    //73, 74, 75, 71, 69, 72, 76, 73
    int[] dailyTemperatures(final int[] temperature) {
        final int[] answer = new int[temperature.length];
        final Stack<Integer> stack = new Stack<>();
        stack.push(temperature.length - 1);
        for (int i = temperature.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && temperature[i] >= temperature[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return answer;
    }
}
