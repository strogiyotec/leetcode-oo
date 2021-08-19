package leetcode.oo.uf;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
public final class MostStonesRemoved {

    private int cnt = 0;

    public static void main(String[] args) {
        System.out.println(
            new MostStonesRemoved().removeStones(
                new int[][]{
                    {0,1},{1,0},{1,1}
                }
            )
        );
    }

    public int removeStones(final int[][] stones) {
        final Map<String, String> parent = new HashMap<>(stones.length << 1);
        for (final int[] stone : stones) {
            final String node = stone[0] + " " + stone[1];
            parent.put(node, node);
        }
        this.cnt = stones.length;
        for (final int[] stone : stones) {
            final String current = stone[0] + " " + stone[1];
            for (final int[] neighbour : stones) {
                if (neighbour[0] == stone[0] || neighbour[1] == stone[1]) {
                    final String neighbourNode = neighbour[0] + " " + neighbour[1];
                    this.union(current, neighbourNode, parent);
                }
            }
        }
        return stones.length - this.cnt;
    }

    private void union(final String current, final String neighbor, final Map<String, String> parent) {
        final String firstParent = this.find(current, parent);
        final String secondParent = this.find(neighbor, parent);
        if (firstParent.equals(secondParent)) {
            return;
        }
        parent.put(secondParent, firstParent);
        this.cnt--;
    }

    private String find(final String current, final Map<String, String> parent) {
        String parentNode = parent.get(current);
        while (!parentNode.equals(parent.get(parentNode))) {
            parentNode = parent.get(parentNode);
        }
        return parentNode;
    }
}
