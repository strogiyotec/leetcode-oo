package leetcode.oo.dp.dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//https://leetcode.com/problems/valid-arrangement-of-pairs/description/
final class ValidArrangementPairs {

    public int[][] validArrangement(int[][] pairs) {
        final Map<Integer, LinkedList<Integer>> graph = this.buildGraph(pairs);
        final Map<Integer, Integer> inCnt = new HashMap<>();
        final Map<Integer, Integer> outCnt = new HashMap<>();
        for (final int[] pair : pairs) {
            outCnt.compute(pair[0], (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return value + 1;
                }
            });
            inCnt.compute(pair[1], (key, value) -> {
                if (value == null) {
                    return 1;
                } else {
                    return value + 1;
                }
            });
        }
        final int startingNode = this.findStartingNode(pairs, inCnt, outCnt);
        final LinkedList<int[]> queue = new LinkedList<>();
        this.dfs(startingNode, graph, queue);
        final int[][] solution = new int[pairs.length][2];
        for (int i = 0; i < solution.length; i++) {
            solution[i] = queue.removeFirst();
        }
        return solution;
    }

    private Map<Integer, LinkedList<Integer>> buildGraph(final int[][] pairs) {
        final Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
        for (final int[] pair : pairs) {
            graph.computeIfAbsent(pair[0], integer -> new LinkedList<>()).add(pair[1]);
        }
        return graph;
    }

    private int findStartingNode(final int[][] pairs, final Map<Integer, Integer> in, final Map<Integer, Integer> out) {
        for (final int[] pair : pairs) {
            final Integer nodeIn = in.getOrDefault(pair[0], 0);
            final Integer nodeOut = out.getOrDefault(pair[0], 0);
            if (nodeIn - nodeOut == -1) {
                return pair[0];
            }
        }
        return pairs[0][0];
    }

    private void dfs(int currentNode, Map<Integer, LinkedList<Integer>> graph, LinkedList<int[]> ans) {
        final LinkedList<Integer> edges = graph.get(currentNode);
        while (edges != null && !edges.isEmpty()) {
            final Integer edge = edges.removeFirst();
            this.dfs(edge, graph, ans);
            ans.addFirst(new int[]{currentNode, edge});
        }
    }
}
