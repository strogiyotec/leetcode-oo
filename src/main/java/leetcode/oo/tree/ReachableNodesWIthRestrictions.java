package leetcode.oo.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/reachable-nodes-with-restrictions/description/
 */
public final class ReachableNodesWIthRestrictions {

    public static void main(String[] args) {
        System.out.println(new ReachableNodesWIthRestrictions()
            .reachableNodes(
                7,
                new int[][]{
                    {0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}
                },
                new int[]{4, 5}
            ));
    }

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        final List<Set<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        for (final int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int reachables = 0;
        final Set<Integer> restrictedSet = IntStream.of(restricted).boxed().collect(Collectors.toSet());
        final Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            final Integer currentNode = queue.poll();
            reachables++;
            for (final Integer node : graph.get(currentNode)) {
                graph.get(node).remove(currentNode);
                if (!restrictedSet.contains(node)) {
                    queue.add(node);
                }
            }
        }
        return reachables;
    }
}
