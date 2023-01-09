package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
final class DailyTemperature {

    //73, 74, 75, 71, 69, 72, 76, 73
    int[] dailyTemperatures(final int[] temperature) {
        final int[] answer = new int[temperature.length];
        final Stack<Integer> positions = new Stack<>();
        positions.add(temperature.length - 1);
        for (int i = temperature.length - 2; i >= 0; i--) {
            while (!positions.isEmpty() && temperature[i] >= temperature[positions.peek()]) {
                positions.pop();
            }
            if (positions.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = positions.peek() - i;
            }
            positions.add(i);
        }
        return answer;
    }
}
