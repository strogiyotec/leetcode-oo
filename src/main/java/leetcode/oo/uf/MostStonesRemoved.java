package leetcode.oo.uf;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
public final class MostStonesRemoved {

    public static void main(String[] args) {
        System.out.println(
            new MostStonesRemoved().removeStones(
                new int[][]{
                    {0, 1}, {1, 0}, {1, 1}
                }
            )
        );
    }

    private int cnt = 0;

    public int removeStones(final int[][] stones) {
        final Map<String, String> graph = new HashMap<>(stones.length << 1);
        for (final int[] stone : stones) {
            final String parent = stone[0] + "-" + stone[1];
            graph.put(parent, parent);
        }
        this.cnt = stones.length;
        for (final int[] first : stones) {
            for (final int[] second : stones) {
                if (first[0] == second[0] || first[1] == second[1]) {
                    this.union(first[0] + "-" + first[1], second[0] + "-" + second[1], graph);
                }
            }
        }
        return stones.length - this.cnt;
    }

    private void union(final String first, final String second, final Map<String, String> graph) {
        final String pFirst = this.find(graph, first);
        final String pSecond = this.find(graph, second);
        if (pFirst.equals(pSecond)) {
            return;
        }
        this.cnt--;
        graph.put(pFirst,pSecond);
    }

    private String find(final Map<String, String> graph, final String node) {
        String parent = graph.get(node);
        while (!parent.equals(graph.get(parent))) {
            parent = graph.get(parent);
        }
        return parent;
    }

}
