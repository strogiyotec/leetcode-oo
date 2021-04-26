package leetcode.oo.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/minimum-difference-between-largest-and-smallest-value-in-three-moves/
final class MinDiffInThreeMoves {

    int minDifference(final int[] nums) {
        if (nums.length < 5) {
            return 0;
        }
        final PriorityQueue<Integer> max = new PriorityQueue<>();
        final PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            max.offer(nums[i]);
            min.offer(nums[i]);
            if (max.size() > 4) {
                max.poll();
                min.poll();
            }
        }
        final int[] minNums = new int[4];
        final int[] maxNums = new int[4];
        for (int i = 0; i < 4; i++) {
            maxNums[i] = max.poll();
            minNums[3 - i] = min.poll();
        }
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            minDiff = Math.min(minDiff, maxNums[i] - minNums[i]);
        }
        return minDiff;
    }
}
