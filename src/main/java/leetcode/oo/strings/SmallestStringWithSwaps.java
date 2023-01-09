package leetcode.oo.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

//https://leetcode.com/problems/smallest-string-with-swaps/
final class SmallestStringWithSwaps {

    String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        final Map<Integer, Integer> graph = new HashMap<>(pairs.size() << 1);
        for (final List<Integer> pair : pairs) {
            graph.put(pair.get(0), pair.get(0));
            graph.put(pair.get(1), pair.get(1));
        }
        for (final List<Integer> pair : pairs) {
            this.union(pair.get(0), pair.get(1), graph);
        }
        final Map<Integer, PriorityQueue<Character>> smallest = new HashMap<>(s.length() << 1);
        for (int i = 0; i < s.length(); i++) {
            smallest.computeIfAbsent(this.find(i, graph), integer -> new PriorityQueue<>()).offer(s.charAt(i));
        }
        final StringBuilder builder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            builder.append(smallest.get(this.find(i,graph)).poll());
        }
        return builder.toString();
    }

    private void union(final Integer first, final Integer second, final Map<Integer, Integer> graph) {
        final Integer pFirst = this.find(first, graph);
        final Integer pSecond = this.find(second, graph);
        if (!Objects.equals(pFirst, pSecond)) {
            if (pFirst < pSecond) {
                graph.put(pSecond, pFirst);
            } else {
                graph.put(pFirst, pSecond);
            }
        }
    }

    private Integer find(final Integer node, final Map<Integer, Integer> graph) {
        Integer parent = graph.get(node);
        while (!graph.get(parent).equals(parent)) {
            parent = graph.get(parent);
        }
        return parent;
    }

}
