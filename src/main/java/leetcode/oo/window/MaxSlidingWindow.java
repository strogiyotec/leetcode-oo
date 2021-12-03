package leetcode.oo.window;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Maximum sliding window.
 * See {@link <a href ="https://leetcode.com/problems/sliding-window-maximum/">https://leetcode.com/problems/sliding-window-maximum/</a>}
 */
final class MaxSlidingWindow {

    /**
     * Find max sliding window array values.
     *
     * @param nums  Numbers
     * @param limit Limit
     * @return Array with max sliding values
     */
    int[] maxSlidingWindow(final int[] nums, final int limit) {
        final Deque<Integer> queue = new LinkedList<>();
        int right = 0;
        int left = 0;
        final List<Integer> output = new ArrayList<>(nums.length);
        while (right < nums.length) {
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[right]) {
                queue.pollLast();
            }
            queue.add(right);
            if (left > queue.peekFirst()) {
                queue.removeFirst();
            }
            if (right - left >= limit - 1) {
                output.add(nums[queue.peekFirst()]);
                left++;
            }
            right++;
        }
        return output.stream().mapToInt(f -> f).toArray();
    }

}

