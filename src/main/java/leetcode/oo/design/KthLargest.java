package leetcode.oo.design;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-a-stream/
public final class KthLargest {

    private final int limit;

    private final PriorityQueue<Integer> queue = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        this.limit = k;
        for (final int num : nums) {
            this.queue.offer(num);
            if (this.queue.size() > this.limit) {
                this.queue.poll();
            }
        }
    }

    public int add(int val) {
        this.queue.offer(val);
        if (this.queue.size() > this.limit) {
            this.queue.poll();
        }
        return this.queue.peek();
    }
}
