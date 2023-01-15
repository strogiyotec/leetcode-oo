package leetcode.oo.graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/number-of-good-paths/description/">...</a>
 */
public final class NumberOfGoodPaths {

    int[] parents;

    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        if (vals.length == 1) {
            return 1;
        }
        final List<Integer> sortedIndexes = IntStream.range(0, vals.length).boxed().sorted(Comparator.comparingInt(value -> vals[value])).collect(Collectors.toList());
        final Map<Integer, List<Integer>> graph = this.buildGraph(edges);
        this.parents = new int[vals.length];
        for (int i = 0; i < vals.length; i++) {
            this.parents[i] = i;
        }
        int goodPaths = 0;
        int startIndex = 0;
        while (startIndex < vals.length) {
            int endIndex = startIndex + 1;
            while (endIndex < vals.length) {
                if (vals[sortedIndexes.get(startIndex)] != vals[sortedIndexes.get(endIndex)]) {
                    break;
                }
                endIndex++;
            }
            this.union(startIndex, endIndex, graph, sortedIndexes, vals);
            final Map<Integer, Integer> goodPathsperInterval = this.cntGoodPathsInInterval(startIndex, endIndex, sortedIndexes);
            for (final Integer value : goodPathsperInterval.values()) {
                goodPaths += value * (value + 1) / 2;
            }
            startIndex = endIndex;
        }
        return goodPaths;
    }

    private Map<Integer, Integer> cntGoodPathsInInterval(int startIndex, final int endIndex, final List<Integer> sortedIndexes) {
        final Map<Integer, Integer> goodPaths = new HashMap<>();
        while (startIndex < endIndex) {
            final int root = this.find(sortedIndexes.get(startIndex));
            goodPaths.merge(root, 1, Integer::sum);
            startIndex++;
        }
        return goodPaths;
    }

    private void union(
        int startIndex,
        final int endIndex,
        final Map<Integer, List<Integer>> graph,
        final List<Integer> sortedIndexes,
        final int[] vals
    ) {
        while (startIndex < endIndex) {
            final Integer indexWithSmallestValue = sortedIndexes.get(startIndex);
            for (final Integer neighbourIndex : graph.get(indexWithSmallestValue)) {
                if (vals[indexWithSmallestValue] >= vals[neighbourIndex]) {
                    //union
                    this.parents[this.find(indexWithSmallestValue)] = this.parents[this.find(neighbourIndex)];
                }
            }
            startIndex++;
        }
    }

    private int find(final int index) {
        if (index != this.parents[index]) {
            this.parents[index] = this.find(this.parents[index]);
        }
        return this.parents[index];
    }

    private Map<Integer, List<Integer>> buildGraph(final int[][] edges) {
        final Map<Integer, List<Integer>> graph = new HashMap<>();
        for (final int[] edge : edges) {
            final int from = edge[0];
            final int to = edge[1];
            graph.putIfAbsent(from, new ArrayList<>());
            graph.putIfAbsent(to, new ArrayList<>());
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        return graph;
    }

}
