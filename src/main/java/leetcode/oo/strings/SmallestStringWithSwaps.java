package leetcode.oo.strings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/smallest-string-with-swaps/
 final class SmallestStringWithSwaps {

     String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        final Map<Integer, Integer> graph = new HashMap<>(s.length());
        final Map<Integer, PriorityQueue<Character>> min = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            graph.put(i, i);
        }
        for (final List<Integer> pair : pairs) {
            this.union(pair, graph);
        }
        for (int i = 0; i < s.length(); i++) {
            min.computeIfAbsent(i, integer -> new PriorityQueue<>());
            min.get(this.find(i, graph)).offer(s.charAt(i));
        }
        final StringBuilder builder = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            final int p = this.find(i, graph);
            builder.append(min.get(p).poll());
        }
        return builder.toString();
    }

    private void union(final List<Integer> pair, final Map<Integer, Integer> graph) {
        final int first = this.find(pair.get(0), graph);
        final int second = this.find(pair.get(1), graph);
        if (first<second) {
            graph.put(second,first);
        } else {
            graph.put(first,second);
        }
    }

    private int find(final Integer node, final Map<Integer, Integer> graph) {
        Integer parent = graph.get(node);
        while (!graph.get(parent).equals(parent)) {
            parent = graph.get(parent);
        }
        return parent;
    }
}
