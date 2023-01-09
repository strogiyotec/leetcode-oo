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
        int popIndex = 0;
        for (final int j : pushed) {
            stack.push(j);
            while (!stack.isEmpty() && popIndex < popped.length && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
