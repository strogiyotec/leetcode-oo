package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/loud-and-rich/
public final class LoudAndRich {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new LoudAndRich().loudAndRich(
            new int[][]{
                {1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}
            },
            new int[]{3, 2, 5, 4, 6, 1, 7, 0}
        )));
    }

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>(richer.length);
        for (final int[] rich : richer) {
            graph.putIfAbsent(rich[1], new HashSet<>());
            graph.get(rich[1]).add(rich[0]);
        }
        final int[] solution = new int[quiet.length];
        Arrays.fill(solution,-1);
        for (int i = 0; i < quiet.length; i++) {
            solution[i] = this.dfs(graph, i, quiet, solution);
        }
        return solution;
    }

    private int dfs(final Map<Integer, Set<Integer>> graph, final int node, final int[] quiet, final int[] solution) {
        if(solution[node] != -1){
            return solution[node];
        }
        int minIndex = node;
        for (final Integer vertex : graph.getOrDefault(node, Collections.emptySet())) {
            final int indexDfs = this.dfs(graph, vertex, quiet,solution);
            if (quiet[indexDfs] < quiet[minIndex]) {
                minIndex = indexDfs;
            }
        }
        return minIndex;
    }
}
