package leetcode.oo.graphs;

//https://leetcode.com/problems/redundant-connection/
final class ReduntantConnection {

    int[] findRedundantConnection(final int[][] edges) {
        final int[] grid = new int[edges.length+1];
        for (int i = 1; i <= edges.length; i++) {
            grid[i] = i;
        }
        int[] redundant = null;
        for (final int[] edge : edges) {
            final int firstParent = this.find(grid, edge[0]);
            final int secondParent = this.find(grid, edge[1]);
            if (firstParent == secondParent) {
                redundant = edge;
            } else {
                if (firstParent < secondParent) {
                    grid[secondParent] = firstParent;
                } else {
                    grid[firstParent] = secondParent;
                }
            }
        }
        return redundant;
    }

    private int find(final int[] grid, final int node) {
        int parent = grid[node];
        while (grid[parent] != parent) {
            parent = grid[node];
        }
        return parent;
    }

}
