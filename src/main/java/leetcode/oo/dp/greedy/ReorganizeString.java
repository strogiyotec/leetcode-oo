package leetcode.oo.dp.greedy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Reorganize string.
 * See {@link <a href ="https://leetcode.com/problems/reorganize-string/">https://leetcode.com/problems/reorganize-string/</a>}
 */
final class ReorganizeString {

    String reorganizeString(final String word) {
        final Map<Character, Integer> map = new HashMap<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            map.merge(word.charAt(i), 1, Integer::sum);
        }
        final PriorityQueue<Character> queue = new PriorityQueue<>(Comparator.<Character>comparingInt(map::get).reversed());
        queue.addAll(map.keySet());
        final StringBuilder builder = new StringBuilder(word.length());
        while (queue.size() >= 2) {
            final Character first = queue.poll();
            final Character second = queue.poll();
            builder.append(first);
            builder.append(second);
            if (map.computeIfPresent(first, (key, val) -> val - 1) == 0) {
                map.remove(first);
            } else{
                queue.add(first);
            }
            if (map.computeIfPresent(second, (key, val) -> val - 1) == 0) {
                map.remove(second);
            } else{
                queue.add(second);
            }
        }
        if (!queue.isEmpty()) {
            final Character poll = queue.poll();
            if (map.get(poll) > 1) {
                return "";
            } else {
                builder.append(poll);
            }
        }
        return builder.toString();
    }
}
