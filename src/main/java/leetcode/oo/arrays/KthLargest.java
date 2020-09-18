package leetcode.oo.arrays;

import java.util.Comparator;
import java.util.PriorityQueue;


/**
 * Kth largest element.
 * See {@link <a href ="https://leetcode.com/problems/kth-largest-element-in-an-array/">https://leetcode.com/problems/kth-largest-element-in-an-array/</a>}
 */
final class KthLargest {

    int findKthLargest(final int[] nums, final int position) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>(nums.length, Comparator.reverseOrder());
        for (final int num : nums) {
            queue.offer(num);
        }
        int index = 0;
        while (index < position - 1) {
            queue.poll();
            index++;
        }
        return queue.peek();
    }
}
