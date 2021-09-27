package leetcode.oo.stacks;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/
final class SmallestRange {

    public int[] smallestRange(final List<List<Integer>> nums) {
        final PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(value -> nums.get(value[0]).get(value[1])));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            queue.add(new int[]{i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        int start = 0;
        int end = Integer.MAX_VALUE;
        while (queue.size() == nums.size()) {
            final int[] poll = queue.poll();
            final int row = poll[0];
            final int col = poll[1];
            final int min = nums.get(row).get(col);
            if (end - start > max - min) {
                end = max;
                start = min;
            }
            if (col + 1 < nums.get(row).size()) {
                queue.offer(new int[]{row, col + 1});
                max = Math.max(max, nums.get(row).get(col + 1));
            }
        }
        return new int[]{start, end};
    }
}
