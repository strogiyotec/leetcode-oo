package leetcode.oo.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/minimum-interval-to-include-each-query/
final class MinIntervalToIncludeAllQueries {

    int[] minInterval(final int[][] intervals, final int[] queries) {
        final Map<Integer, List<Integer>> queryToIndex = new HashMap<>(queries.length);
        for (int i = 0; i < queries.length; i++) {
            queryToIndex.merge(queries[i], new ArrayList<>(Collections.singletonList(i)), (oldValue, currentValue) -> {
                oldValue.addAll(currentValue);
                return oldValue;
            });
        }
        Arrays.sort(queries);
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.<int[]>comparingInt(value -> value[0]).thenComparingInt(o -> o[0]));
        final int[] answer = new int[queries.length];
        int intervalIndex = 0;
        for (final int currentQuery : queries) {
            //put elements into the queue
            while (intervalIndex < intervals.length) {
                final int[] currentInterval = intervals[intervalIndex];
                if (currentInterval[0] <= currentQuery) {
                    queue.offer(new int[]{currentInterval[1] - currentInterval[0] + 1, currentInterval[1]});
                    intervalIndex++;
                } else {
                    break;
                }
            }
            while (!queue.isEmpty() && queue.peek()[1] < currentQuery) {
                queue.poll();
            }
            if (queue.isEmpty()) {
                answer[queryToIndex.get(currentQuery).get(queryToIndex.get(currentQuery).size() - 1)] = -1;
            } else {
                answer[queryToIndex.get(currentQuery).get(queryToIndex.get(currentQuery).size() - 1)] = queue.peek()[0];
            }
            queryToIndex.get(currentQuery).remove(queryToIndex.get(currentQuery).size() - 1);
        }
        return answer;
    }
}
