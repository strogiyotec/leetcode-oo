package leetcode.oo.strings;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

//https://leetcode.com/problems/second-largest-digit-in-a-string/
final class SecondLargestDigit {

    int secondHighest(final String word) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(word.length(), Comparator.reverseOrder());
        final Set<Integer> set = new HashSet<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                final int digit = Character.getNumericValue(word.charAt(i));
                if (!set.contains(digit)) {
                    set.add(digit);
                    queue.offer(digit);
                }
            }
        }
        if (queue.isEmpty()) {
            return -1;
        }
        queue.poll();
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }
}
