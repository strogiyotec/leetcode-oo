package leetcode.oo.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/find-the-k-sum-of-an-array/description/
public final class FindKSumOfArray {

    public long kSum(int[] nums, int k) {
        long totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += Math.max(0, nums[i]); //skip negatives
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        final PriorityQueue<KLargest> queue = new PriorityQueue<>(k, Comparator.<KLargest>comparingLong(value -> value.sum).reversed());
        queue.offer(new KLargest(0,totalSum - nums[0]));
        k--;
        while (k > 0) {
            final KLargest poll = queue.poll();
            totalSum = poll.sum;
            final int currentIndex = poll.index;
            final int nextIndex = currentIndex + 1;
            if (nextIndex < nums.length) {
                queue.offer(new KLargest(nextIndex, totalSum - nums[nextIndex]));
                queue.offer(new KLargest(nextIndex, totalSum + nums[currentIndex] - nums[nextIndex]));
            }
            k--;
        }
        return totalSum;
    }

    static class KLargest {
        final int index;

        final long sum;

        public KLargest(final int index, final long sum) {
            this.index = index;
            this.sum = sum;
        }
    }
}
