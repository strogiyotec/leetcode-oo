package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/asteroid-collision/
final class Asteroids {

    int[] asteroidCollision(final int[] asteroids) {
        final Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
            } else {
                if (asteroids[i] >= 0) {
                    stack.push(asteroids[i]);
                } else {
                    if (stack.peek() < 0) {
                        stack.push(asteroids[i]);
                    } else {
                        while (!stack.isEmpty()) {
                            if (stack.peek() < 0) {
                                stack.push(asteroids[i]);
                                break;
                            }
                            if (Math.abs(asteroids[i]) > stack.peek()) {
                                stack.pop();
                                if (stack.isEmpty()) {
                                    stack.push(asteroids[i]);
                                    break;
                                }
                            } else if (Math.abs(asteroids[i]) == stack.peek()) {
                                stack.pop();
                                break;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return stack.stream().mapToInt(d -> d).toArray();
    }
}
