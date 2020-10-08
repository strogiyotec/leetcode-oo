package leetcode.oo.dp.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import leetcode.oo.IntPair;

/**
 * Remove covered intervals.
 * See {@link <a href ="https://leetcode.com/problems/remove-covered-intervals/">https://leetcode.com/problems/remove-covered-intervals/</a>}
 */
final class RemoveCovered {

    int removeCoveredIntervals(final int[][] intervals) {
        final List<IntPair> pairs = new ArrayList<>(intervals.length);
        for (final int[] interval : intervals) {
            pairs.add(new IntPair(interval[0], interval[1]));
        }
        pairs.sort(Comparator.comparingInt(IntPair::getFirst));
        int size = pairs.size();
        IntPair prev = pairs.get(0);
        for (int i = 1; i < pairs.size(); i++) {
            final IntPair next = pairs.get(i);
            if (next.getFirst() <= prev.getFirst() && next.getSecond() >= prev.getSecond()) {
                size--;
                prev = next;
            } else if (prev.getFirst() <= next.getFirst() && prev.getSecond() >= next.getSecond()) {
                size--;
            } else {
                prev = next;
            }
        }
        return size;
    }
}
