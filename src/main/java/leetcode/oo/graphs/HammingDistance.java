package leetcode.oo.graphs;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimize-hamming-distance-after-swap-operations/
public final class HammingDistance {

    public static void main(String[] args) {
        System.out.println(new HammingDistance().minimumHammingDistance(
            new int[]{1, 2, 3, 4},
            new int[]{2, 1, 4, 5},
            new int[][]{
                {0, 1},
                {2, 3}
            }
        ));
    }

    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        final int[] graph = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            graph[i] = i;
        }
        for (final int[] swap : allowedSwaps) {
            this.union(swap[0], swap[1], graph);
        }
        final Map<Integer, Map<Integer, Integer>> cnt = new HashMap<>();
        for (int i = 0; i < source.length; i++) {
            final int index = this.find(i, graph);
            if (!cnt.containsKey(index)) {
                cnt.put(index, new HashMap<>());
            }
            cnt.get(index).merge(source[i], 1, Integer::sum);
        }
        int res = 0;
        for (int i = 0; i < source.length; i++) {
            final int num = target[i];
            final int index = this.find(i, graph);
            final Map<Integer, Integer> map = cnt.get(index);
            if (!map.containsKey(num)) {
                res++;
            } else if (map.computeIfPresent(num, (key, val) -> val - 1) == 0) {
                map.remove(num);
            }
        }
        return res;
    }

    private void union(final int first, final int second, final int[] graph) {
        final int pF = this.find(first, graph);
        final int pS = this.find(second, graph);
        if (pS < pF) {
            graph[pF] = pS;
        } else {
            graph[pS] = pF;
        }
    }

    private int find(final int node, final int[] graph) {
        int parent = graph[node];
        while (graph[parent] != parent) {
            parent = graph[parent];
        }
        return parent;
    }
}
