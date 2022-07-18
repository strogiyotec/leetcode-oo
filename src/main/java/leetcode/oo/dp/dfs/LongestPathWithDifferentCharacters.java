package leetcode.oo.dp.dfs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;

//https://leetcode.com/problems/longest-path-with-different-adjacent-characters/
public final class LongestPathWithDifferentCharacters {

    private int max;

    public int longestPath(final int[] parent, final String s) {
        final Map<Integer, Set<Integer>> graph = this.graph(parent);
        this.dfs(graph, 0, s);
        return this.max;
    }

    private Map<Integer, Set<Integer>> graph(final int[] parent) {
        final Map<Integer, Set<Integer>> map = new HashMap<>(parent.length << 1);
        for (int i = 0; i < parent.length; i++) {
            map.put(i, new HashSet<>(4));
        }
        for (int i = 1; i < parent.length; i++) {
            map.get(parent[i]).add(i);
        }
        return map;
    }

    private int dfs(final Map<Integer, Set<Integer>> graph, final int node, final String word) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.<Integer>comparingInt(value -> value).reversed());
        for (final Integer child : graph.get(node)) {
            final int maxLength = this.dfs(graph, child, word);
            if (word.charAt(node) != word.charAt(child)) {
                queue.add(maxLength);
            }
        }
        final int firstMax = Optional.ofNullable(queue.poll()).orElse(0);
        final int secondMax = Optional.ofNullable(queue.poll()).orElse(0);
        this.max = Math.max(this.max, firstMax + secondMax + 1);
        return firstMax + 1;
    }
}
