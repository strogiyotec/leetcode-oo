package leetcode.oo.strings;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/reverse-only-letters/
final class ReverseLetters {

    String reverseOnlyLetters(final String word) {
        final Deque<Integer> queue = new ArrayDeque<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                queue.add(i);
            }
        }
        final StringBuilder builder = new StringBuilder(word);
        while (!queue.isEmpty()) {
            final Integer first = queue.peekFirst();
            final Integer last = queue.peekLast();
            builder.setCharAt(first, word.charAt(last));
            builder.setCharAt(last, word.charAt(first));
            if (first.equals(last)) {
                queue.poll();
            } else {
                queue.pollFirst();
                queue.pollLast();
            }
        }
        return builder.toString();
    }
}
