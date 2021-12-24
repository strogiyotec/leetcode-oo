package leetcode.oo.graphs;

//https://leetcode.com/problems/redundant-connection/
final class ReduntantConnection {

    int[] findRedundantConnection(final int[][] edges) {
        final int[] graph = new int[edges.length + 1];
        for (int i = 1; i <= edges.length; i++) {
            graph[i] = i;
        }
        int[] redundant = null;
        for (final int[] edge : edges) {
            final int firstParent = this.find(graph, edge[0]);
            final int secondParent = this.find(graph, edge[1]);
            if (firstParent == secondParent) {
                redundant = edge;
            } else {
                if (firstParent < secondParent) {
                    graph[secondParent] = firstParent;
                } else {
                    graph[firstParent] = secondParent;
                }
            }
        }
        return redundant;
    }

    private int find(final int[] graph, final int node) {
        int parent = graph[node];
        while (parent != graph[parent]) {
            parent = graph[parent];
        }
        return parent;
    }

}
