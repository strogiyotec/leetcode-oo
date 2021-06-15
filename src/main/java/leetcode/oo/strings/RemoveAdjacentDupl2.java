package leetcode.oo.strings;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
public final class RemoveAdjacentDupl2 {

    public static void main(String[] args) {
        System.out.println(
            new RemoveAdjacentDupl2().removeDuplicates(
                "deeedbbcccbdaa", 3
            )
        );
        System.out.println(
            new RemoveAdjacentDupl2().removeDuplicates(
                "abcd", 2
            )
        );
    }

    public String removeDuplicates(final String s, final int k) {
        final Deque<AbstractMap.SimpleEntry<Character, Integer>> queue = new ArrayDeque<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (queue.isEmpty() || queue.peekLast().getKey() != s.charAt(i)) {
                queue.addLast(new AbstractMap.SimpleEntry<>(s.charAt(i), 1));
            } else {
                final AbstractMap.SimpleEntry<Character, Integer> last = queue.peekLast();
                if (last.getValue() + 1 == k) {
                    queue.removeLast();
                } else {
                    last.setValue(last.getValue() + 1);
                }
            }
        }
        final StringBuilder solution = new StringBuilder(queue.size());
        while (!queue.isEmpty()) {
            final AbstractMap.SimpleEntry<Character, Integer> first = queue.pollFirst();
            for (int i = 0; i < first.getValue(); i++) {
                solution.append(first.getKey());
            }
        }
        return solution.toString();
    }

}
