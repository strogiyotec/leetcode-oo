package leetcode.oo.stacks;

import java.util.Stack;

/**
 * Decode string.
 * See {@link <a href ="https://leetcode.com/problems/decode-string/">https://leetcode.com/problems/decode-string/</a>}.
 */
public final class DecodeString {

    public String decodeString(final CharSequence word) {
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            final char charAt = word.charAt(i);
            if (charAt == ']') {
                final StringBuilder builder = new StringBuilder(16);
                while (stack.peek() != '[') {
                    builder.append(stack.pop());
                }
                //remove open bracket
                stack.pop();
                final StringBuilder digits = new StringBuilder(16);
                while (!stack.isEmpty() && Character.isDigit(stack.peek())){
                    digits.append(stack.pop());
                }
                DecodeString.repeat(builder, Integer.parseInt(digits.reverse().toString()));
                final String sequence = builder.reverse().toString();
                for (int j = 0; j < sequence.length(); j++) {
                    stack.push(sequence.charAt(j));
                }
            } else {
                stack.push(charAt);
            }
        }
        final StringBuilder answer = new StringBuilder(16);
        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        return answer.reverse().toString();

    }

    private static void repeat(final StringBuilder builder, final int times) {
        final CharSequence sequence = new StringBuilder(builder);
        for (int i = 1; i < times; i++) {
            builder.append(sequence);
        }
    }

}
