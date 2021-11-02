package leetcode.oo.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/
final class MakeArrayContiguous {

    public int minOperations(final int[] nums) {
        Arrays.sort(nums);
        final Deque<Integer> queue = new ArrayDeque<>(nums.length);
        int maxAmount = 0;
        for (final int num : nums) {
            while (!queue.isEmpty() && num - queue.peekFirst() >= nums.length) {
                queue.pollFirst();
            }
            if (queue.isEmpty() || !queue.peekLast().equals(num)) {
                queue.add(num);
            }
            maxAmount = Math.max(
                maxAmount,
                queue.size()
            );
        }
        return nums.length - maxAmount;
    }
}
