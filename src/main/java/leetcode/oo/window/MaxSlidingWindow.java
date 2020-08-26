package leetcode.oo.window;

import java.util.PriorityQueue;

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
        if (nums.length == 0) {
            return new int[0];
        }
        int index = 0;
        int[] answer = new int[nums.length - limit + 1];
        int position = 0;
        final PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        while (position < answer.length) {
            while (queue.size() != limit) {
                queue.offer(nums[index++]);
            }
            answer[position] = queue.peek();
            queue.remove(nums[position++]);
        }
        return answer;
    }
}

