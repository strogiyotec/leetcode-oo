package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/checking-existence-of-edge-length-limited-paths/description/
public final class CheckingExistenseOfEdgeLength {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CheckingExistenseOfEdgeLength().distanceLimitedPathsExist(
            5,
            new int[][]{
                {0, 1, 10}, {1, 2, 5}, {2, 3, 9}, {3, 4, 13}
            },
            new int[][]{
                {0, 4, 14}, {1, 4, 13}
            }
        )));
    }

    private int[] parents;

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        this.parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        final int[][] sortedQueries = new int[queries.length][4];
        for (int i = 0; i < queries.length; i++) {
            final int[] query = queries[i];
            sortedQueries[i] = new int[]{query[0], query[1], query[2], i};
        }
        Arrays.sort(sortedQueries, Comparator.comparingInt(v -> v[2]));
        Arrays.sort(edgeList, Comparator.comparingInt(v -> v[2]));
        int index = 0;
        final boolean[] solutions = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            final int[] sortedQuery = sortedQueries[i];
            while (index < edgeList.length && sortedQuery[2] > edgeList[index][2]) {
                final int[] edge = edgeList[index];
                final int from = edge[0];
                final int to = edge[1];
                this.union(from, to);
                index++;
            }
            final int from = sortedQuery[0];
            final int to = sortedQuery[1];
            final int originalIndex = sortedQuery[3];
            final int fromParent = this.find(from);
            final int toParent = this.find(to);
            solutions[originalIndex] = fromParent == toParent;
        }
        return solutions;
    }

    private void union(final int from, final int to) {
        final int fromParent = this.find(from);
        final int toParent = this.find(to);
        this.parents[fromParent] = this.parents[toParent];
    }

    private int find(int from) {
        while (from != this.parents[from]) {
            this.parents[from] = this.parents[this.parents[from]];
            from = this.parents[from];
        }
        return from;
    }

}
