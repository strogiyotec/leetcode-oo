package leetcode.oo.stacks;

import java.util.Stack;

//https://leetcode.com/problems/validate-stack-sequences/
public final class ValidateStack {

    public static void main(String[] args) {
        System.out.println(
            new ValidateStack().validateStackSequences(
                new int[]{1, 2, 3, 4, 5},
                new int[]{4, 5, 3, 2, 1}
            )
        );
    }

    public boolean validateStackSequences(
        final int[] pushed,
        final int[] popped
    ) {
        final Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (final int number : pushed) {
            stack.push(number);
            while (!stack.isEmpty() && index < popped.length && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
