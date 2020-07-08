package leetcode.oo.dp.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 * Non-overlapping Intervals.
 * See {@link <a href ="https://leetcode.com/problems/non-overlapping-intervals/">https://leetcode.com/problems/non-overlapping-intervals/</a>}
 */
final class NonOverlapInterval {

    int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        final List<Interval> intervalList = new ArrayList<>(intervals.length + 1);
        for (final int[] interval : intervals) {
            intervalList.add(new Interval(interval[0], interval[1]));
        }
        intervalList.sort(Comparator.comparingInt(h -> h.stop));
        int max = intervalList.get(0).stop;
        int overlappings = 0;
        for (int i = 1; i < intervalList.size(); i++) {
            if (intervalList.get(i).start >= max) {
                max = intervalList.get(i).stop;
            } else {
                overlappings++;
            }
        }
        return overlappings;
    }


    static class Interval {
        final int start;

        final int stop;

        Interval(final int start, final int stop) {
            this.start = start;
            this.stop = stop;
        }
    }
}
