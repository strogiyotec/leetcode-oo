package leetcode.oo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Merge intervals;
 * See {@link <a href ="https://leetcode.com/problems/merge-intervals/">https://leetcode.com/problems/merge-intervals/</a>}
 */
final class MergeIntervals {

    int[][] merge(final int[][] intervals) {
        if (intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        final List<int[]> result = new ArrayList<>(intervals.length);
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            final int[] second = intervals[i];
            final int[] first = result.get(result.size() - 1);
            if (second[0] <= first[1]) {
                final int[] current = result.get(result.size() - 1);
                current[0] = Math.min(current[0], second[0]);
                current[1] = Math.max(current[1], second[1]);
            } else {
                result.add(second);
            }
        }
        final int[][] answer = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
