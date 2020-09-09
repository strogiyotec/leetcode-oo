package leetcode.oo.dp.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


/**
 * Reorganize string.
 * See {@link <a href ="https://leetcode.com/problems/reorganize-string/">https://leetcode.com/problems/reorganize-string/</a>}
 */
final class ReorganizeString {

    String reorganizeString(final String word) {
        final Map<Character, Integer> counts = new HashMap<>(word.length() + 2);
        for (int i = 0; i < word.length(); i++) {
            counts.merge(word.charAt(i), 1, Integer::sum);
        }
        final PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        queue.addAll(counts.keySet());
        final StringBuilder result = new StringBuilder(word.length() + 2);
        while (queue.size() >= 2) {
            final Character first = queue.poll();
            final Character second = queue.poll();
            result.append(first).append(second);
            if (counts.computeIfPresent(first, (k, v) -> v - 1) != 0) {
                queue.offer(first);
            }
            if (counts.computeIfPresent(second, (k, v) -> v - 1) != 0) {
                queue.offer(second);
            }
        }
        if (!queue.isEmpty()) {
            final Character last = queue.poll();
            if (counts.get(last) >=2) {
                return "";
            } else {
                result.append(last);
            }
        }
        return result.toString();
    }
}
