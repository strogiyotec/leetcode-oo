package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
final class DailyTemperature {

    int[] dailyTemperatures(final int[] temperature) {
        final int[] solution = new int[temperature.length];
        final Stack<Integer> stack = new Stack<>();
        stack.push(temperature.length - 1);
        for (int i = temperature.length - 2; i >= 0; i--) {
            if (temperature[i] < temperature[stack.peek()]) {
                solution[i] = stack.peek() - i;
            } else {
                while (!stack.isEmpty() && temperature[i] >= temperature[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    solution[i] = 0;
                } else {
                    solution[i] = stack.peek() - i;
                }
            }
            stack.push(i);
        }
        return solution;
    }
}
