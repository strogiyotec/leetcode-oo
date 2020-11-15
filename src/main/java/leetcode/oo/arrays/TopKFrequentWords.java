package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *Top K Frequent Words.
 * See {@link <a href ="https://leetcode.com/problems/top-k-frequent-words/">https://leetcode.com/problems/top-k-frequent-words/</a>}
 */
final class TopKFrequentWords {

    List<String> topKFrequent(final String[] words, final int frequency) {
        final Map<String, Integer> map = new HashMap<>(words.length, 1.0F);
        for (final String word : words) {
            map.merge(word, 1, Integer::sum);
        }
        final PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.getValue().equals(o2.getValue())) {
                return o1.getKey().compareTo(o2.getKey());
            } else {
                return o2.getValue() - o1.getValue();
            }
        });
        queue.addAll(map.entrySet());
        final List<String> answer = new ArrayList<>(map.size());
        int cnt = 0;
        while (!queue.isEmpty() && cnt < frequency) {
            answer.add(queue.poll().getKey());
            cnt++;
        }
        return answer;
    }
}
