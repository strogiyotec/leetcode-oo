package leetcode.oo.stacks;

import java.util.LinkedList;

public final class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (final char c : num.toCharArray()) {
            int currentNum = c - '0';
            while (!stack.isEmpty() && stack.peekFirst() > currentNum && k != 0) {
                stack.removeFirst();
                k--;
            }
            stack.addFirst(currentNum);
        }
        while (k != 0) {
            stack.removeLast();
            k--;
        }
        final StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.removeLast());
        }
        return builder.toString();
    }
}
