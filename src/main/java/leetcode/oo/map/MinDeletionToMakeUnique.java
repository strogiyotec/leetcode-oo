package leetcode.oo.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/
final class MinDeletionToMakeUnique {

    int minDeletions(final String word) {
        final Map<Character, Integer> map = new HashMap<>(word.length());
        for (int i = 0; i < word.length(); i++) {
            map.merge(word.charAt(i), 1, Integer::sum);
        }
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(map.values());
        int cnt = 0;
        while (!queue.isEmpty()) {
            final Integer max = queue.poll();
            if (queue.isEmpty()) {
                return cnt;
            }
            if (max != 0 && max.equals(queue.peek())) {
                cnt++;
                queue.offer(max - 1);
            }
        }
        return cnt;
    }
}
