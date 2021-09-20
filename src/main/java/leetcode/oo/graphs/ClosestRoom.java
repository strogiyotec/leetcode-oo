package leetcode.oo.graphs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

//https://leetcode.com/problems/closest-room/
final class ClosestRoom {

    public int[] closestRoom(int[][] rooms, int[][] queries) {
        Arrays.sort(rooms, Comparator.<int[]>comparingInt(value -> value[1]).reversed());
        int n = rooms.length;
        final int[][] sortedQueries = new int[queries.length][3];
        for (int i = 0; i < queries.length; i++) {
            sortedQueries[i][0] = queries[i][0];
            sortedQueries[i][1] = queries[i][1];
            sortedQueries[i][2] = i;
        }
        final int[] ans = new int[queries.length];
        Arrays.sort(sortedQueries, Comparator.<int[]>comparingInt(value -> value[1]).reversed());
        final TreeSet<Integer> ts = new TreeSet();
        int index = 0;
        for (int i = 0; i < queries.length; i++) {
            while (index < n && rooms[index][1] >= sortedQueries[i][1]) {
                ts.add(rooms[index][0]);
                index++;
            }
            final Integer floor = ts.floor(sortedQueries[i][0]);
            final Integer ceil = ts.ceiling(sortedQueries[i][0]);
            if (floor == null && ceil == null) {
                ans[sortedQueries[i][2]] = -1;
            } else if (floor == null) {
                ans[sortedQueries[i][2]] = ceil;
            } else if (ceil == null) {
                ans[sortedQueries[i][2]] = floor;
            } else {
                if (ceil - sortedQueries[i][0] < sortedQueries[i][0] - floor) {
                    ans[sortedQueries[i][2]] = ceil;
                } else {
                    ans[sortedQueries[i][2]] = floor;
                }
            }
        }
        return ans;
    }
}
