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
                {0, 2}, {1, 2}
            },
            new int[]{0, 1, 2}
        )));
        System.out.println(Arrays.toString(new LoudAndRich().loudAndRich(
            new int[][]{
                {1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}
            },
            new int[]{3, 2, 5, 4, 6, 1, 7, 0}
        )));
    }

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        final Map<Integer, Set<Integer>> graph = new HashMap<>(richer.length << 1);
        for (final int[] pair : richer) {
            graph.computeIfAbsent(pair[1], integer -> new HashSet<>()).add(pair[0]);
        }
        final int[] solution = new int[quiet.length];
        Arrays.fill(solution, -1);
        for (int i = 0; i < quiet.length; i++) {
            solution[i] = this.dfs(i, solution, graph, quiet);
        }
        return solution;
    }

    private int dfs(final int node, final int[] solution, final Map<Integer, Set<Integer>> graph, final int[] quiet) {
        if (solution[node] != -1) {
            return solution[node];
        }
        solution[node] = quiet[node];
        int min = node;
        for (final Integer vertex : graph.getOrDefault(node, Collections.emptySet())) {
            final int next = this.dfs(vertex, solution, graph, quiet);
            if (quiet[next] < quiet[min]) {
                min = next;
            }
        }
        return min;
    }

}
