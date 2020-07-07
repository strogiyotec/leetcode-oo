package leetcode.oo.dp.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Activity selection problem.
 * Check Introduction for algorithms
 * Greedy algorithms section
 */
final class ActivitySelection {

    List<Interval> optimal(final List<Interval> intervals) {
        final List<Interval> solution = new ArrayList<>(intervals.size());
        solution.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start >= solution.get(solution.size() - 1).stop) {
                solution.add(intervals.get(i));
            }
        }
        return solution;
    }

    static class Interval {
        final int start;

        final int stop;

        Interval(final int start, final int stop) {
            this.start = start;
            this.stop = stop;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Interval interval = (Interval) o;
            return start == interval.start &&
                    stop == interval.stop;
        }

        @Override
        public String toString() {
            return "Interval{" +
                    "start=" + start +
                    ", stop=" + stop +
                    '}';
        }
    }

}
